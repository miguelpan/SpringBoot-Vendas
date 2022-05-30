package br.com.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

//Class para configuração spring em all project
//Class apenas para application development
public class myConfiguration {

    //CommandLineRunner codigo que executa sempre que o programa inicializa
    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("RODANDO CONFIG.PROPERTIES DE DEVELOPMENT");
        };
    }
}
