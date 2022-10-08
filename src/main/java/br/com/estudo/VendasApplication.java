package br.com.estudo;

import br.com.estudo.br.com.estudo.model.Client;
import br.com.estudo.br.com.estudo.model.br.com.estudo.repository.ClientRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner commandLineRunner(@Autowired ClientRepositoy clientRepositoy){
        return args -> {

            Client c = new Client();
            c.setName("Paulo");

            clientRepositoy.save(c);

        };
    }


    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
