package operacoes_basicas;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Forma Tradicional
//        for (Produto produto : produtos) {
//            produto.ativar();
//            System.out.println(produto);
//        }
        // Forma Usando Streams
        Stream<Produto> stream = produtos.stream(); // Stream - fluxo, ele é processado atraves da fonte de dados (lista de produtos)
        stream.forEach(produto -> {
            produto.ativar();
            System.out.println(produto);
        });
    }

}
