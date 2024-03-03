#!/bin/bash

protoc -I=./googleapis/google -I=./ --java_out=./src --kotlin_out=./src protos/proxima.proto
#python -m grpc_tools.protoc -I=./googleapis/google/ -I./ --python_out=./src protos/proxima.proto
