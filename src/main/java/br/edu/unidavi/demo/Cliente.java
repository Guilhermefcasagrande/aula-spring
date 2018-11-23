package br.edu.unidavi.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Cliente {

    @Id @GeneratedValue
    Long id;
    String nome;
    String email;
}
