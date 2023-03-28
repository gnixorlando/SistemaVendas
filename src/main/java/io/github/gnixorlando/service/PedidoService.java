package io.github.gnixorlando.service;

import io.github.gnixorlando.domain.entity.Pedido;
import io.github.gnixorlando.rest.dto.PedidoDTO;

public interface PedidoService{

    Pedido salvar (PedidoDTO dto);
}
