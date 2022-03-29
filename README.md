# gift-card-service-master
This is has functionalities purchase gift cards and also to check the balance of all the existing clients or
a particular client.Balance checking is not available for every client  and need be authorized. 
Postman collection :[https://www.getpostman.com/collections/8ec8939c2312865c05cb](https://www.getpostman.com/collections/8ec8939c2312865c05cb)

As already stated this project is an implementation of such board and made of 3 separate Docker containers that holds:

- PostgreSQL database
- Java backend for check balance and purchase gift cards(Spring Boot)

### Prerequisites

In order to run this application you need to install two tools: **Docker** & **Docker Compose**.

Instructions how to install **Docker** on [Ubuntu](https://docs.docker.com/install/linux/docker-ce/ubuntu/), [Windows](https://docs.docker.com/docker-for-windows/install/) , [Mac](https://docs.docker.com/docker-for-mac/install/) .

**Docker Compose** is already included in installation packs for *Windows* and *Mac*, so only Ubuntu users needs to follow [this instructions](https://docs.docker.com/compose/install/) .




### How to run it?

An entire application can be run using command in a terminal:

```
$ docker-compose up -d
```

If you want to stop it use following command:

```
$ docker-compose down
```


---

# gift-card-postgres (Database)

PostgreSQL database contains only single schema with two tables - Balance
and Gift_card  tables.

After running the app it can be accessible using these connectors:


- Host      :*localhost*
- Database  :*guusto*
- User      :*postgres*
- Password  :*1234*

Details are available in application.properties file as well.

Like other parts of application Postgres database is containerized and
the definition of its Docker container can be found in
*docker-compose.yml* file.

```yml
  gift-card-postgres:
    image: "postgres:9.6-alpine"
    container_name: gift-card-postgres
    volumes:
      - gift-card-data:/var/lib/postgresql/data
    ports:
      - 5432:5432 
    environment:
      - POSTGRES_DB=guusto
      - POSTGRES_USER=postgres
      - POSTGRES_PASSWORD=1234                                                                                       
- 
```

#### gift-card-app (REST API)

This is a Spring Boot (Java) based application that connects with a
database that and expose the REST endpoints that can be consumed by
API tool(Front end not available). It supports multiple HTTP REST methods like GET, POST.


This app is also put in Docker container and its definition can be found
in a file *gift-card-service-master/Dockerfile*.



Test Data Generated Using : [https://www.mockaroo.com/](https://www.mockaroo.com/)(gift-card-service-master/balance-a[i/src/test)


#Docker Deployment Doc 
#[Gift Card Doc](https://docs.google.com/document/d/18CIQa71BxvJYsWFegh8wu_GrJ_pwrM5edWzqBcS1VMA/edit)
