package operacao_terminal_Stream.forEach;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

	// uma operação terminal executa todo o pipiline pre configurado
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Stream<Produto> stream = produtos.stream();

        Stream<Produto> streamComEstoque = stream
                .filter(Produto::temEstoque);

        Stream<Produto> streamComEstoqueInativo = streamComEstoque
                .filter(Produto::isInativo);

        // vai percorrer todos os elemntos do stream uma unica vez
        streamComEstoqueInativo.forEach(produto -> { // apenas quando o forEach for invocado, ele executa toda a pipeline
            produto.ativar();
            System.out.println(produto);
        });
    }

}
