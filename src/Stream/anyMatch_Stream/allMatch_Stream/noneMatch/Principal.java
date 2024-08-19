package Stream.anyMatch_Stream.allMatch_Stream.noneMatch;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		var cadastroProduto = new CadastroProduto();
		List<Produto> produtos = cadastroProduto.obterTodos();

//        boolean temProdutoNoEstoque = produtos.stream()
//                .peek(System.out::println)
//                .anyMatch(Produto::temEstoque); // anyMatch - qualquer elemento corresponde a esse predicado
//        System.out.println(temProdutoNoEstoque);

//        boolean todosProdutoPossuemEstoque = produtos.stream()
//                .peek(System.out::println)
//                .allMatch(Produto::temEstoque); // allMatch - todos os produtos precisar retornar true, tem que ter estoque
//        System.out.println(todosProdutoPossuemEstoque);

		boolean nenhumProdutoPossuiEstoque = produtos.stream().peek(System.out::println).noneMatch(Produto::temEstoque); // noneMatch - nenhum produto tem estoque (faltando)
		System.out.println(nenhumProdutoPossuiEstoque);
	}

}
