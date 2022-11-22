package com.mundotaci.projetotaci.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter 
@Entity
@Table(name = "store")
public class Store {

    public Store() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento do id
    private Long storeId;

    @NotBlank 
    private String cnpj;
    @NotBlank 
    private String nameStore;
    @NotBlank 
    private String adress;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank 
    private String phone;
    @NotBlank 
    private String cep;
    @NotBlank
    private String owner;
    @NotBlank 
    private String celPhone;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String image;

}
