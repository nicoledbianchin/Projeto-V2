package com.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Por favor, informe seu nome.")
    private String name;

    @Email(message = "Por favor, informe um email válido.")
    private String email;

    @Min(value = 6, message = "A senha deve ter no mínimo 6 caracteres.")
    private String password;

    public User(){
    }

    public User (String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password, Long id){
        this(name, email, password);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
