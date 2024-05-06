package SistemaEstoqueAtacadão;

/**
 * @author MiguelGadelha/CaioNobreVidal
 * @version 23/11/2023
 */
/**
 * Classe abstrata que representa produtos genericos em geral de uma empresa. Esta
 * classe deve ser estendida por tipos específicos de produtos.
 *
 */
public abstract class Produto {
	/**
	 * Nome do produto.
	 */
	private String nome;

	/**
	 * Preço unitário do produto.
	 */
	private double preco;

	/**
	 * Quantidade disponível em estoque.
	 */
	private int quantidadeEmEstoque;

	/**
	 * Construtor para a classe Produto.
	 *
	 * @param nome                O nome do produto.
	 * @param preco               O preço unitário do produto.
	 * @param quantidadeEmEstoque A quantidade disponível em estoque.
	 */
	public Produto(String nome, double preco, int quantidadeEmEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	/**
	 * Obtém o nome do produto.
	 *
	 * @return O nome do produto.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Obtém o preço unitário do produto.
	 *
	 * @return O preço unitário do produto.
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * Define a quantidade em estoque de um produto.
	 *
	 * @param quantidade Valor que será adicionado à quantidade em estoque.
	 */
	public void setQuantidadeEmEstoque(int quantidade) {
		quantidadeEmEstoque = quantidade;
	}

	/**
	 * Obtém a quantidade disponível em estoque.
	 *
	 * @return A quantidade disponível em estoque.
	 */
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	/**
	 * Método abstrato para vender uma quantidade específica do produto.
	 *
	 * @param quantidade A quantidade a ser vendida.
	 * @throws EstoqueInsuficienteException Se a quantidade em estoque for
	 *                                      insuficiente.
	 */
	public abstract void vender(int quantidade) throws EstoqueInsuficienteException;
}
