package findFirs_findAny;

import java.util.List;
import java.util.Optional;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Optional<Produto> produtoOptional = produtos.stream()
                .peek(System.out::println) // o peek vai passar por todos ate o final
                .filter(Produto::temEstoque)
                .filter(Produto::isInativo)
                .findFirst(); // retorna um oprional de produto
//                .findAny(); // nao vai ter garantia de qual elemento vai ser retornado

        System.out.println("-------");

        Produto produto = produtoOptional.orElseThrow( // obter o que tem la dentro se nao tiver lançar exceção
                () -> new RuntimeException("Produto não encontrado"));
        System.out.println(produto);
    }

}
