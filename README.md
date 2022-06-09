# CUSTOMER

### Description
Simple REST service storing bank users data: id, name, surname.

### API
Endpoint:

`GET /v1/customer/{idCustomer}` returns data of customer by idCustomer

Response example: 

```json
[
{
  "id":1234,
  "firstName":"Jan",
  "lastName":"Kowalski"
}
]
```

### Database
Local MySql database with 1 table: 

* customer

#### CUSTOMER

| Field       | Type   | Null | Key | Default | Extra          |
|:---:|:---:|:---:|:---:|:---:|:---:|
| id          | bigint | NO   | PRI | NULL    | auto_increment |
| customer_id          | bigint | NO   |  | NULL    |  |
| first_name | varchar(255) | YES  |     | NULL    |                |
| last_name | varchar(255) | YES  |     | NULL    |                |






