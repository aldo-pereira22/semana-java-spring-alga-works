package com.awpag.controller;

import com.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(10L);
        cliente1.setNome("Aldo");
        cliente1.setTelefone("1233213123");


        var cliente2 = new Cliente();
        cliente2.setId(22L);
        cliente2.setNome("João das Couves");
        cliente2.setTelefone("2323123123");
        return Arrays.asList(cliente1, cliente2);
    }
}
