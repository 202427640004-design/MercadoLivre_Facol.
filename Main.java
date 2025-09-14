import model.Produto;
import view.ProdutoView;
import controller.ProdutoController;
import repository.ProdutoRepositorio;

public class Main {
    public static void main(String[] args) {
        ProdutoRepositorio repositorio = new ProdutoRepositorio();
        
        Produto p1 = new Produto("Notebook", 3500.0);
        Produto p2 = new Produto("Smartphone", 1800.0);

        repositorio.adicionarProduto(p1);
        repositorio.adicionarProduto(p2);

        ProdutoView view = new ProdutoView();

        for (Produto p : repositorio.listarProdutos()) {
            ProdutoController controller = new ProdutoController(p, view);
            controller.atualizarView();
        }
    }
}
