package criando_pipeline;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos(); // fonte de dados (1° Parte)

        // Encadeando as chamadas
        produtos.stream()
//                .filter(produto -> produto.temEstoque() && produto.isInativo())
                .filter(Produto::temEstoque) // operações intermediarias (2° Parte)
                .filter(Produto::isInativo) // Operacao terminal (3° Parte)
                .forEach(produto -> {
                    System.out.println("Ativando " + produto);
                    produto.ativar();
                });

//        Stream<Produto> stream = produtos.stream();
//
//        Stream<Produto> streamComEstoque = stream
//                .filter(Produto::temEstoque);
//
//        Stream<Produto> streamComEstoqueInativo = streamComEstoque
//                .filter(Produto::isInativo);
//
//        streamComEstoqueInativo.forEach(produto -> {
//            System.out.println("Ativando " + produto);
//            produto.ativar();
//        });
    }

}
