## Digital Parking App

### It has two Microservices
    1. car parking registration
    2. car parking process

### Build the project 
    mvn clean install

### Start the Docker
    docker-compose up

### Now start the Both Microservices to execute the Application
    mvn spring-boot:run  

### To Start the Car Parking with car details using controller: 
     Post:  http://localhost:8081/parking/start
        Body:
          {
          "ownerName": "Johne",
          "regNo": "ABC12",
          "module": "Sedan",
          "type": "Petrol"
          }
        Parameter: parkingNo=123Bala106

    Post: http://localhost:8081/parking/end
        Parameter: regNo=ABC12

## To check the MySQL Database:

#### Windows
    docker exec -it MySQL_Container_ID bash

### Connect to mysql database

    mysql -u user -p
### Show database

    show databases;

### Select the database

    use parking_db;

### Display the table

    show tables;
    car                  |
    | parking_end          |
    | parking_start        |
    | parking_start_seq

### Execute mysql query
    select * from car;
    select * from parking_start;
    select * from parking_end;

### Exit from docker container
    exit
            
