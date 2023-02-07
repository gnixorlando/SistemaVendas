package io.github.gnixorlando.service;

import io.github.gnixorlando.model.Cliente;
import io.github.gnixorlando.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClientesRepository repository;

    @Autowired
    public ClienteService (ClientesRepository repository) {
        this.repository=repository;
    }

    public void salvarCliente (Cliente cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);
}

    private void validarCliente(Cliente cliente) {

    }