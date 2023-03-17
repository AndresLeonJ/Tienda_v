/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Andres
 */
//El Entity, Controller etc es una función de el spring framework para poder 
//indicar el como se va a comportar nuestra clase
@Entity
//Sirve para definir a que tabla le esta haciendo referencia
@Table(name = "paises")
public class Pais implements Serializable{
    
    @Id //cumple el rol de un id 
    
    @GeneratedValue(strategy= GenerationType.IDENTITY) //Sirve para definir 
                                                 //que el id es auto incremental
    private long id; 
    private String pais;
    
//realizamos los getters y los setters 
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}