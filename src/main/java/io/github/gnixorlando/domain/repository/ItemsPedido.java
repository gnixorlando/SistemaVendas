package io.github.gnixorlando.domain.repository;

import io.github.gnixorlando.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository <ItemPedido, Integer> {
}
