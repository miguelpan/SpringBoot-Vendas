package br.com.springboot.domain.repository;

import br.com.springboot.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// @Repository determina que a classe faz acesso a banco de dados

public interface Clientes extends JpaRepository<Cliente, Integer> {


    List<Clientes> findByNomeLike(String nome);
}
