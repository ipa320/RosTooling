from flask import Flask
from redis import Redis, RedisError
import sys
import os
import socket

# Connect to Redis
redis = Redis(host="redis", db=0, socket_connect_timeout=2, socket_timeout=2)

app = Flask(__name__)

@app.route("/")
def hello():

    html = "<h3>{name}</h3>"
    with open(sys.argv[2],"r") as f:
        line = f.readline()
        while line:
            line = f.readline()
            line = line.replace("{","&#123;")
            line = line.replace("}","&#125;")
            line = line.replace("_","&#95;");
            line = line.replace("'","&#39;");
            html+="<b>"+line.rstrip()+"</b><br/>"

    return html.format(name=sys.argv[1])

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=80)
