package com.spring.primeraweb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tbl_personas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    @Id

    private long id;
    private String nombre;
    private int edad;
}
