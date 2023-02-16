package io.github.gnixorlando.domain.repository;

import io.github.gnixorlando.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository <Produto, Integer> {

}
