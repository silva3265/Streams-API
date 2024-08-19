package Stream_elementos_distintos;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .distinct() //  vai retornar um Stream de apenas de elementos unicos
                .forEach(System.out::println);
    }

}
