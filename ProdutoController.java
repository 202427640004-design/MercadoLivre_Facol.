package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
    private Produto produto;
    private ProdutoView view;

    public ProdutoController(Produto produto, ProdutoView view) {
        this.produto = produto;
        this.view = view;
    }

    public void atualizarView() {
        view.exibirProduto(produto.getNome(), produto.getPreco());
    }
}
