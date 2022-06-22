docker run -d   --name postgres   -e POSTGRES_PASSWORD=quarkus   -e POSTGRES_DB=default   -e POSTGRES_USER=quarkus   -p 5432:5432 docker.io/library/postgres:14.2
docker logs --follow postgres
