#!/bin/bash
# Script per riavviare l'applicazione Instagnam 
echo "Stop eventually containers running" 
docker stop $(docker ps -a -q)
echo "Start application Instagnam"
docker-compose up