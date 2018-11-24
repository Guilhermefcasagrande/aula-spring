package br.edu.unidavi.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{

    List <Cliente> findByNome(String nome);

    @Query(value = "SELECT * FROM cliente c WHERE MONTH(c.dataNascimento) = :mes", nativeQuery = true)
    List<Cliente> findByDataNascimentoAtMesCorrente(@Param("mes") Integer mes);
}
