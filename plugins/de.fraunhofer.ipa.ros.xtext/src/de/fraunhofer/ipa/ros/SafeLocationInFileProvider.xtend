package de.fraunhofer.ipa.ros

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.DefaultLocationInFileProvider
import org.eclipse.xtext.util.TextRegion

class SafeLocationInFileProvider extends DefaultLocationInFileProvider {
	
    override getSignificantTextRegion(EObject obj) {
        val significant = super.getSignificantTextRegion(obj)
        val full = super.getFullTextRegion(obj)
        
        if (significant !== null && full !== null) {
            val start = Math.max(significant.getOffset(), full.getOffset())
            val end = Math.min(
                significant.getOffset() + significant.getLength(), 
                full.getOffset() + full.getLength()
            )
            
            val length = end - start
            
            if (length < 0) {
                return full 
            }
            
            return new TextRegion(start, length)
        }
        
        return significant
    }
}