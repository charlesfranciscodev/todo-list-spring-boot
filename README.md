# TODO List

Your task is to create the web backend of a todo list app.

## API Routes

### Todos

**GET** `/todos`

Response
```json
{
  "content": [
    {
      "todoId": 1,
      "title": "Pudding",
      "content": "Pudding sweet roll...",
      "completed": false,
      "dueDate": "2020-04-30",
      "priority": 2,
      "user": {
        "userId": 2,
        "firstName": "Richard",
        "lastName": "Burke",
        "username": "whiteostrich",
        "avatarUrl": "https://charlesfranciscodev.github.io/images/diverseui/male-52.jpg"
      }
    },
    {
      "todoId": 2,
      "title": "Sesame snaps",
      "content": "Sesame snaps gummi...",
      "completed": false,
      "dueDate": "2020-01-02",
      "priority": 1,
      "user": {
        "userId": 1,
        "firstName": "Dominic",
        "lastName": "Margaret",
        "username": "lazybear",
        "avatarUrl": "https://charlesfranciscodev.github.io/images/diverseui/male-30.jpg"
      }
    },
    ...
  ],
  ...
}
```

---

**GET** `/todos/{:id}`

Response

```json
{
  "completed": true,
  "content": "Chocolate cake bear claw...",
  "dueDate": "2020-12-29",
  "priority": 2,
  "title": "Muffin",
  "todoId": 4,
  "user": {
    "avatarUrl": "https://charlesfranciscodev.github.io/images/diverseui/female-11.jpg",
    "firstName": "Laura",
    "lastName": "Petersen",
    "userId": 8,
    "username": "blackelephant"
  }
}
```

---

**POST** `/users/{:id}/todos`

Request
```json
{
	"title": "Bear Claw",
	"content": "YOOOOOO Pudding sweet...",
	"completed": true,
	"dueDate": "2020-05-30",
	"priority": 3
}
```

Response
```json
{
  "todoId": 1000,
  "title": "Bear Claw",
  "content": "YOOOOOO Pudding sweet...",
  "completed": true,
  "dueDate": "2020-05-30T00:00:00.000+00:00",
  "priority": 3,
  "user": {
      "userId": 1,
      "firstName": "Dominic",
      "lastName": "Margaret",
      "username": "lazybear",
      "avatarUrl": "https://charlesfranciscodev.github.io/images/diverseui/male-30.jpg"
  }
}
```

---

**PUT** `PUT /users/{:id}/todos/{:id}`

Request
```json
{
  "title": "My Title",
  "content": "This is the content",
  "completed": false,
  "dueDate": "2019-05-30",
  "priority": 1
}
```

Response
```json
{
  "todoId": 1000,
  "title": "My Title",
  "content": "This is the content",
  "completed": false,
  "dueDate": "2019-05-30T00:00:00.000+00:00",
  "priority": 1,
  "user": {
    "userId": 1,
    "firstName": "Dominic",
    "lastName": "Margaret",
    "username": "lazybear",
    "avatarUrl": "https://charlesfranciscodev.github.io/images/diverseui/male-30.jpg"
  }
}
```

---

**DELETE** `/todos/{:id}`

Response

200 | when the todo is successfully deleted

404 | when the todo is not found

### Users

**GET** `/users`

Response
```json
{
  "content": [
    {
      "userId": 1,
      "firstName": "Dominic",
      "lastName": "Margaret",
      "username": "lazybear",
      "avatarUrl": "https://charlesfranciscodev.github.io/images/diverseui/male-30.jpg"
    },
    {
      "userId": 2,
      "firstName": "Richard",
      "lastName": "Burke",
      "username": "whiteostrich",
      "avatarUrl": "https://charlesfranciscodev.github.io/images/diverseui/male-52.jpg"
    },
    {
      "userId": 3,
      "firstName": "Alex",
      "lastName": "Ferrer",
      "username": "whitedog",
      "avatarUrl": "https://charlesfranciscodev.github.io/images/diverseui/male-11.jpg"
    }
  ],
  ...
}
```

---

**GET** `/users/{:id}`

Response
```json
{
  "userId": 2,
  "firstName": "Richard",
  "lastName": "Burke",
  "username": "whiteostrich",
  "avatarUrl": "https://charlesfranciscodev.github.io/images/diverseui/male-52.jpg"
}
```

## Dependencies
* [Docker](https://www.docker.com/)
* [Docker Compose](https://docs.docker.com/compose/)
* Java 11

## Development Workflow

### Build the image(s)

`docker-compose build`

### Run the container(s)

`docker-compose up`

### Run the web server

```shell
cd todolist/
./gradlew bootRun
```

The API should be accessible at [http://localhost:8080](http://localhost:8080).

### Postgres

Want to access the database via psql?

```
docker-compose exec database psql -U postgres
\connect db_dev
```

## References
* [Spring Initializr](https://start.spring.io/)
* [Spring Boot, PostgreSQL, JPA, Hibernate RESTful CRUD API Example](https://www.callicoder.com/spring-boot-jpa-hibernate-postgresql-restful-crud-api-example/)
* [How to generate primary keys with JPA and Hibernate](https://thorben-janssen.com/jpa-generate-primary-keys/)
* [Configuring Logback with Spring Boot](https://lankydan.dev/2019/01/09/configuring-logback-with-spring-boot)

## Data
* [Random User Generator](https://randomuser.me/)
* [Diverse UI](https://diverseui.com/)
