# Insurance Company Project

An application for Insurance functionalities.

Data Model
![image](https://user-images.githubusercontent.com/45535529/213809606-ae1fe657-4c03-433b-99a8-474454d3b92b.png)


## API Reference for Account Object

#### GET

```http
  GET /api/getAccounts
  GET /api/getAccountById/{accountId}
  GET /api/getPoliciesById/{accountId}
```

#### POST

```http
  POST /api/addAccount
  PUT /api/updateAccount
```

#### PUT

```http
  PUT /api/updateAccount
```

#### DELETE

```http
  DELETE /api/deleteAccount/{accountId}
```


## Features

- Create, Read, Update and Delete for each object
- One-To-One, One-To-Many and Many-To-Many relationships
- search by PolicyCode
- exception for duplicate PolicyCode
- Unit Tests
