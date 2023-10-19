#!/usr/bin/env bash

echo 'Copy files...'

mvn clean package

scp -i root@185.46.11.243 \
    target/ANNAMATH-0.0.1.jar \
    root@185.46.11.243:depl/

echo 'Restart server...'

ssh -i root@185.46.11.243
java -jar target/ANNAMATH-0.0.1.jar &
echo 'Bye'