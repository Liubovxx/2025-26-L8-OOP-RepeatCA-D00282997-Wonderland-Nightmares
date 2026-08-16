# 2025-26-L8-OOP-RepeatCA-D00282997-Wonderland-Nightmares
# GCA2 — N-tier System (Resubmission)
**Module:** COMP C8Z03 Object-Oriented Programming  
**Stage:** 4 (Individual Project)  
**Student:** Liubov Lykhosherst – D00282997

## 1. Project Overview

### Domain Summary (142 words)
The system is developed for a trading card game called **“Wonderland Nightmares”**, inspired by the dark gothic atmosphere of the game *Alice: Madness Returns*. 

The application allows managing collectible cards featuring twisted Wonderland characters, creatures, weapons and locations. The system contains four main entities: **Card**, **CardSet**, **Player**, and **Retailer**.

The **Card** entity stores information about each card such as name, type, domain, madness level, attack, defense and special ability. The **CardSet** entity represents different expansions of the game. The **Player** entity keeps track of competitive players and their achievements. The **Retailer** entity stores information about shops that sell the cards.

The main goal of the system is to help fans and collectors manage their card collections and provide basic functionality for shop owners. The project demonstrates N-tier architecture using Java, JDBC, sockets and JSON.

## 2. Key Features
- CRUD operations for cards
- Client-server communication using TCP sockets
- JSON data exchange
- JDBC connection to MySQL database
- Basic support for binary data (card images)

## 3. How to Run

### Prerequisites
- Java 17 or higher
- MySQL Server
- IntelliJ IDEA (recommended)

### Database Setup
1. Create a new database: `wonderland_nightmares_db`
2. Execute the script: `sql/mysqlSetup.sql`
3. Make sure each table has test data

## 4. JSON Protocol Documentation

- **GET_ALL**
    - Payload: `{}`
    - Response: `ServerResponse<List<Card>>` { status: "SUCCESS", data: [...] }

- **GET_BY_ID**
    - Payload: `{ "id": 1 }`
    - Response: `ServerResponse<Card>` { status: "SUCCESS", data: {...} }

- **ADD**
    - Payload: `{ "cardName": "Alice", ... }`
    - Response: `ServerResponse<Card>` { status: "SUCCESS", data: {...} }

- **DELETE**
    - Payload: `{ "id": 1 }`
    - Response: `ServerResponse<Boolean>` { status: "SUCCESS", data: true }

- **DISCONNECT**
    - Payload: `{}`
    - Response: `ServerResponse<String>` { status: "SUCCESS", message: "Disconnected" }

### Configuration
Create file `config/db.properties`:
```properties
db.url=jdbc:mysql://localhost:3306/wonderland_nightmares_db
db.user=root
db.password=
