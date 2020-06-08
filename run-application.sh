#!/bin/bash
# Script per avviare l'applicazione Instagnam dopo il build del codice
echo "Stop eventually containers running" 
docker stop $(docker ps -a -q)
echo "Remove older images of services"
docker rmi -f ricette & docker rmi -f connessioni & docker rmi -f ricette-seguite & docker rmi -f api-gateway
echo "Start application Instagnam"
docker-compose up