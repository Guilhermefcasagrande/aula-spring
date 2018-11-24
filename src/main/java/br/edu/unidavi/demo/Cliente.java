package br.edu.unidavi.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Cliente {

    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;
    String nome;
    String email;
    Date dataNascimento;
}
