package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){

        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Caio Matheus de Proença");
        cliente1.setEmail("cmproenca2@gmail.com");
        cliente1.setTelefone("15 997256577");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Amanda de Proença");
        cliente2.setEmail("amproenca2@gmail.com");
        cliente2.setTelefone("15 997256579");

        return Arrays.asList(cliente1, cliente2);
    }
}
