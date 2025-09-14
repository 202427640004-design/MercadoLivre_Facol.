package repository;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class ProdutoRepositorio {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
}
