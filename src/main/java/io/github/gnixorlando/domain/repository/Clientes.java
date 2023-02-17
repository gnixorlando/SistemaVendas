package io.github.gnixorlando.domain.repository;

import io.github.gnixorlando.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);

    Boolean existsByNome (String nome);

    @Query (" select c from Cliente c left join fetch c.pedidos where c.id =:id")
    Cliente findClienteFetchPedidos (@Param("id") Integer id);


}
