#!/bin/bash

protoc -I=./googleapis/google -I=./ --java_out=./src --kotlin_out=./src protos/proxima.proto
