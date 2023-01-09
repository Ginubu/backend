/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porongama.bosta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    private String nombre;
    private String apellido;
    private String mail;
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String mail, long id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.id = id;
    }

    
    
}
