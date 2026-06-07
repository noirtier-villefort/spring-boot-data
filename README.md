# Spring Boot Web App with REST API and JPA
## __Allows you create, find, delete users in the database__
### Creating and sending user object
<img width="800" height="450" alt="ezgif com-video-to-gif-converter" src="https://github.com/user-attachments/assets/3e0a1add-c406-42f1-958b-e56e3737677c" />

### Showing all users and check 

<img width="800" height="450" alt="2026-06-0721-19-04-ezgif com-video-to-gif-converter" src="https://github.com/user-attachments/assets/d8ef4327-5b0f-4095-8254-2b8cd9c4fb06" />


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
    email to user in db + in User entity + change object creation in main.html JS
    validation before add. Do not add the same names and emails
    exception handling
- Fix:
    blocking delete http request (csp)
```

#### MySQL is used. Create database like this: 

<img width="800" height="450" alt="2026-06-0101-29-52-ezgif com-video-to-gif-converter(1)" src="https://github.com/user-attachments/assets/3e6147dd-d545-44b5-bef5-dfc08a6ccffe" />
