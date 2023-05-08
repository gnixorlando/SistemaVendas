package io.github.gnixorlando.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "Campo Descrição é obrigatório!")
    private String descricao;

    @Column(name = "PRECO_UNITARIO")
    @NotNull(message = "Campo Preço é obrigatório!")
    private BigDecimal preco;

}
