# Spring Boot Web App with REST API and JPA
## __Allows you create, find, delete users in the database__
<img width="800" height="450" alt="2026-06-0723-29-23-ezgif com-video-to-gif-converter(1)" src="https://github.com/user-attachments/assets/aea42388-c425-476d-8596-21447b2b121f" />


### Project Structure:

- *__PageController__* - returns main.html. 
- *__main.html__*  - a page with fields where user can enter a data and save it or generate json (generated via JS JSON.stringify).
  - Button "Send and save" calls JS function saveUser() that creates user object by getting values of fields and than sends POST request to REST API users/add endpoint.
  - Button "Generate JSON" simply creates user object by getting values of the fields and put json to textarea **
  - Page uses bootstrap styling

- *__UserController__* - REST API controller.
  - Has dependency field injection of UserService.
  - Handles:
    - GET /users/{id}
    -  GET /users/all 
    - POST /users/add
    - ~~DELETE /users/delete/{id}~~ - delete doesnt work because of blocking request while sending (csp)

- *__UserService__* - business logic, communicating with JPA Repository

- *__UserRepository__* extends JpaRepository

```
TODO: 
- Add:
    - UserService validation before calling repository.save(). Do not add the same names and emails
    - exception handling
    - main.html: pop message while clicking buttons
- Fix:
    blocking delete http request (csp)
```

#### MySQL is used. Create database like this: 

<img width="800" height="450" alt="2026-06-0101-29-52-ezgif com-video-to-gif-converter(1)" src="https://github.com/user-attachments/assets/3e6147dd-d545-44b5-bef5-dfc08a6ccffe" />
