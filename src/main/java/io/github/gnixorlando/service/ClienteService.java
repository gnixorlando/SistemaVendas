package io.github.gnixorlando.service;

import io.github.gnixorlando.model.Cliente;
import org.springframework.stereotype.Service;
import io.github.gnixorlando.service.ClientesRepository;

public class ClienteService {
    @Service
    public class ClientesService {

        private ClientesRepository repository;

        public ClientesService(ClientesRepository repository) {
            this.repository = repository;
        }

        public void salvarCliente(Cliente cliente) {
            validarCliente(cliente);
            this.repository.persistir(cliente);
        }

        public void validarCliente(Cliente cliente) {

        }
    }
}
