package org.noirtier.springbootdata.entities;
import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /* using Integer type because primitive type int cant be null.
       We dont receive ID in json while saving for example.
       Using primitive type int will cause
       JSON parse error: Cannot map null into type int (set DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)]
     */
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(){return this.email;}
    public void setEmail(String email){ this.email = email;}

    public Integer getAge(){return this.age;}
    public void setAge(int age){ this.age = age;}
}
