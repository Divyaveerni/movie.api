# Movie API – Spring Boot REST Application

## Description
This is a simple Spring Boot RESTful API for managing movies (Netflix-style catalog).
The application allows users to add a movie and fetch movie details by ID.
Data is stored in-memory using an ArrayList.

## Tech Stack
- Java
- Spring Boot
- REST API
- Maven
- Postman (for API testing)

## How to Run the Application
1. Clone the repository from GitHub
2. Open the project in Eclipse
3. Run `Application.java` as a Spring Boot App
4. The application will start on `http://localhost:8080` (or the configured port)

## API Endpoints

### Add a Movie
- **Method:** POST
- **URL:** `/api/movies`

**Request Body (JSON):**
```json
{
  "id": 1,
  "name": "Baahubali",
  "description": "Epic historical action movie",
  "genre": "Epic Action",
  "rating": 10.10
}
Get Movie by ID
Method: GET
URL: /api/movies/{id}
Example:
GET /api/movies/1
## Important Implementation Details
- Implemented RESTful API principles
- Used in-memory data storage with ArrayList
- Input validation for required fields
- Returned proper HTTP status codes
- Tested APIs using Postman

## Limitations
- Data is stored in memory and will be lost when the application restarts
- No database integration

## Future Enhancements
- Add database support using Spring Data JPA
- Implement update and delete operations
- Add authentication and authorization
