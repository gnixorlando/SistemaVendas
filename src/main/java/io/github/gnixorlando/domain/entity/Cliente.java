package io.github.gnixorlando.domain.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;


    @Column (name = "nome", length = 100)
    private String nome;

    @Column (name = "cpf", length = 11)
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @OneToMany(mappedBy = "cliente" )
    private Set<Pedido> pedidos;

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {

        this.pedidos = pedidos;
    }
    public Cliente () {

    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }


}

