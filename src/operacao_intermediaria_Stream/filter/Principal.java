package operacao_intermediaria_Stream.filter;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		//filter - Retorna um Stream sequencial com esta coleção como origem.
		
		var cadastroProduto = new CadastroProduto();
		List<Produto> produtos = cadastroProduto.obterTodos();

		Stream<Produto> stream = produtos.stream();

		// Usando Lambdas
//		Stream<Produto> streamComEstoque = stream.filter(produto -> produto.temEstoque());
		
		// Usando Methos reference
		Stream<Produto> streamComEstoque = stream.filter(Produto::temEstoque);

		Stream<Produto> streamComEstoqueInativo = streamComEstoque.filter(Produto::isInativo);
	}

}
