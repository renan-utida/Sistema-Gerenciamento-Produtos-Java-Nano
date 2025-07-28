package br.com.fiap.produtos.repository;

import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.model.Produto;

import javax.swing.*;
import java.util.List;
import java.util.Vector;

public class CategoriaCollectionRepository {

    private static List<Categoria> categorias;

    static {
           categorias = new Vector<>();

           Categoria eletronicos = new Categoria(1L, "Eletrônicos");
           Categoria celulares = new Categoria(2L, "Celulares");
           Categoria livros = new Categoria(3L, "Livros");

           categorias.add(eletronicos);
           categorias.add(celulares);
           categorias.add(livros);

    }

    public static List<Categoria> findAll() {
        return categorias;
    }

    public static Categoria findById(Long id){
        return categorias.stream()
                .filter(c->c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static List<Categoria> findByNome(String nome){
        return categorias.stream()
                .filter(c->c.getNome().equalsIgnoreCase(nome))
                .toList();
    }

    public static Categoria save(Categoria categoria){
        if(!categorias.contains(categoria)){
            categoria.setId((long)categorias.size() + 1);
            categorias.add(categoria);
            return categoria;
        } else {
            JOptionPane.showMessageDialog(null, "Já existe uma categoria com o nome informado!");
            return null;
        }
    }
}
