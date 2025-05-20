# Wallet-to-Wallet Transfer System 💰

A Spring Boot application for secure digital wallet transactions with dynamic fee calculation.

## Features ✨
- 💸 Wallet-to-wallet fund transfers
- 📊 Dynamic 2% transaction fee
- 🔒 Atomic transactions (all-or-nothing)
- 🏦 MySQL database integration
- 📝 Transaction history recording

## Tech Stack 🛠️
- **Backend**: Spring Boot 3.1.5
- **Database**: MySQL
- **ORM**: Spring Data JPA
- **Build Tool**: Maven
- **Lombok**: For boilerplate reduction

## Database Schema 🗃️
```sql
-------------------------------------------------------------------------------------------------------
TO SETUP,
* git clone https://github.com/hayzon1/wallet.git
* Create database with name wallets
* spring.datasource.url=jdbc:mysql://localhost:3306/wallets
spring.datasource.username=your_username
spring.datasource.password=your_password
* 
