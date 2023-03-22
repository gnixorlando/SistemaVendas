package io.github.gnixorlando.domain.entity;


import lombok.*;
import javax.persistence.*;
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
    private String nome;

    @Column (name = "cpf", length = 11)
    private String cpf;

    @OneToMany(mappedBy = "cliente" )
    private Set<Pedido> pedidos;

}

