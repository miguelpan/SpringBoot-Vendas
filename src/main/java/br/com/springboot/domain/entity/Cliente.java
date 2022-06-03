package br.com.springboot.domain.entity;

import javax.persistence.*;

//Classe de dominio

@Entity
@Table(name = "cliente") // Só é preciso colocar se o nome da classe for diferente do nome da tabela
public class Cliente {
    @Id //obrigatorio ter
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", length = 100)
    private String nome;

    public Cliente() {
    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
