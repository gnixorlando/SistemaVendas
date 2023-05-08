package io.github.gnixorlando.domain.entity;


import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;


    @Column (name = "nome", length = 100)
    @NotEmpty(message = "Campo nome é obrigatório!")
    private String nome;

    @NotEmpty(message = "Campo CPF é obrigatório.")
    @CPF(message = "Informe um CPF válido.")
    @Column (name = "cpf", length = 11)
    private String cpf;

    @OneToMany(mappedBy = "cliente" )
    private Set<Pedido> pedidos;

}

