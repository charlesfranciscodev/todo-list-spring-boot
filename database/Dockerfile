# base image
FROM postgres:10.13-alpine

# run create.sql on init
ADD create.sql /docker-entrypoint-initdb.d
