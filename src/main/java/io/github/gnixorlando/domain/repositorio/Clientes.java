package io.github.gnixorlando.domain.repositorio;

import io.github.gnixorlando.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);

    Boolean existsByNome (String nome);

}
