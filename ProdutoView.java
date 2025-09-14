package view;

public class ProdutoView {
    public void exibirProduto(String nome, double preco) {
        System.out.println("=== Produto ===");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
