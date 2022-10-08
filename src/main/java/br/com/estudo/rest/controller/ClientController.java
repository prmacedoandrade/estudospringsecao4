package br.com.estudo.rest.controller;


import br.com.estudo.br.com.estudo.model.Client;
import br.com.estudo.br.com.estudo.model.br.com.estudo.repository.ClientRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Optional;

@Controller
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientRepositoy clientRepositoy;


    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Client> getClientById(@PathVariable Integer id){

        Optional<Client> clientOpt = clientRepositoy.findById(id);

        if(clientOpt.isPresent())
            return ResponseEntity.ok( clientOpt.get() );

        return ResponseEntity.notFound().build();

    }

}
