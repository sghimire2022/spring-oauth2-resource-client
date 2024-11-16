# OAuth2 Authentication and Authorization Project

This project demonstrates how to set up an **OAuth2 Resource Server** to provide OAuth2 authentication and authorization to its clients. It consists of four different modules, each serving a specific purpose.

## Modules Overview

1. **Authorization Server**  
   - Registers the client and client secret.  
   - Manages the tokens and authentication for the system.

2. **Resource Server**  
   - Secures and authenticates endpoints using the Authorization Server.  
   - Acts as the protected resource provider.

3. **Client Server**  
   - A client service that retrieves data from the Resource Server.  
   - Demonstrates how a registered client interacts with the Resource Server.

4. **NoAuth Client**  
   - A sample client service that attempts to access the Resource Server without valid credentials (client ID and client secret).  
   - Illustrates unauthorized access behavior.

---

## Project Setup

### Prerequisites
- **Java**: Ensure you have Java 11 or higher installed.
- **Maven/Gradle**: For building the project.
- **Spring Boot**: Used to implement the modules.
- **Database**: (Optional) For storing client details and tokens, if configured
