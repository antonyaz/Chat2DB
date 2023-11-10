#!/bin/bash


cd chat2db-client
npm run build:web:prod

cd ..

cp -r chat2db-client/dist chat2db-server/chat2db-server-start/src/main/resources/static/

#if [[ -z chat2db-server/chat2db-server-start/src/main/resources/static/front ]]; then
  rm -rf chat2db-server/chat2db-server-start/src/main/resources/static/front
#fi

mv chat2db-server/chat2db-server-start/src/main/resources/static/dist chat2db-server/chat2db-server-start/src/main/resources/static/front

cp -r chat2db-client/dist/index.html chat2db-server/chat2db-server-start/src/main/resources/thymeleaf

cd chat2db-server

mvn clean install package

cd ..
echo 'finished...'

