# Customer Billing System - AI Agent Guidelines

## Architecture Overview
This is a console-based Java application for managing customer billing data. Key components:
- **MainApp.java**: Entry point with menu-driven interface for CRUD operations
- **CustomerDAO.java**: Data access layer using JDBC with MySQL
- **Models**: Customer (with bills list) and BillBook (bill details)
- **Utils**: DBUtil (connection factory), ExcelUtil (POI-based report generation)

Data flow: User input → MainApp → CustomerDAO → MySQL database. Reports exported to Excel.

## Database Schema
- **customers**: cust_id (int), cust_name (varchar), cust_address (varchar), cust_mobile (varchar)
- **bills**: bill_id (int), cust_id (int), bill_date (varchar), product (varchar), quantity (int), total_amount (double)

Tables linked by cust_id foreign key. Use LEFT JOIN in queries to fetch customers with their bills.

## Key Patterns
- **Transactional Operations**: Customer and bills inserted in single transaction (see CustomerDAO.addCustomer)
- **Lazy Loading**: Bills loaded on-demand via LEFT JOIN in getAllCustomers
- **Stream Processing**: Use Java 8 streams for filtering/sorting (e.g., findCustomer, mostValuableCustomer)
- **Exception Handling**: Wrap SQL exceptions in AppException for user-friendly messages
- **Model Design**: Public fields in models (Customer, BillBook) - no getters/setters except getTotalAmount

## Dependencies & Build
- **Maven**: Standard build with POI 5.2.3, MySQL Connector 8.0.33, Log4j 2.23.1
- **Run Command**: `mvn compile exec:java -Dexec.mainClass="org.example.app.MainApp"`
- **Database Setup**: Requires MySQL server with 'customer_db' database. Credentials hardcoded in DBUtil.java

## Development Workflow
- **Add Features**: Extend MainApp menu, add DAO methods, update models if needed
- **Error Handling**: Catch AppException in MainApp, print message to console
- **Excel Export**: Use POI XSSFWorkbook to create sheets, write to 'report.xlsx'
- **Testing**: No existing tests - add JUnit tests in src/test/java for DAO methods

## Conventions
- **Package Structure**: org.example.{app, dao, model, util, exception}
- **Imports**: Group by package, use wildcards for model classes
- **Code Style**: Simple, procedural style; no advanced OOP patterns
- **Logging**: Log4j configured but not used in code - add logging for debugging
