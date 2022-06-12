package br.com.springboot.domain.repository;

import br.com.springboot.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedididos extends JpaRepository<ItemPedido, Integer> {
}
