package io.github.gnixorlando.service.impl;

import io.github.gnixorlando.domain.repository.Pedidos;
import io.github.gnixorlando.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
