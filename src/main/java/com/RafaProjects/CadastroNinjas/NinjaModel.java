package com.RafaProjects.CadastroNinjas;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    int age;
    String email;

    public NinjaModel() {

    }

    public NinjaModel(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
