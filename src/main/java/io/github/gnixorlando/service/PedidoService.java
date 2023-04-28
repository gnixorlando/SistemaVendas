package io.github.gnixorlando.service;

import io.github.gnixorlando.domain.entity.Pedido;
import io.github.gnixorlando.domain.enums.StatusPedido;
import io.github.gnixorlando.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService{

    Pedido salvar (PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus (Integer id, StatusPedido statusPedido);

}
