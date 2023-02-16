package io.github.gnixorlando.domain.repository;

import io.github.gnixorlando.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository <Pedido, Integer> {
}
