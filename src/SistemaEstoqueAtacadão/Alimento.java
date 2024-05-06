package SistemaEstoqueAtacadão;

/**
 * @author MiguelGadelha/CaioNobreVidal
 * @version 23/11/2023
 */
/**
 * Subclasse do Produto que representa produtos do tipo Alimento.
 *
 */
public class Alimento extends Produto implements Vendavel {
	/**
	 * marca do alimento, característica que o diferencia de outros produtos
	 * genéricos.
	 */
	private String marca;

	/**
	 * Construtor para a classe Brinquedo.
	 *
	 * @param nome                O nome do alimento.
	 * @param preco               O preço unitário do alimento.
	 * @param quantidadeEmEstoque A quantidade disponível em estoque.
	 * @param material            A marca do alimento.
	 */
	public Alimento(String nome, double preco, int quantidadeEmEstoque, String material) {
		super(nome, preco, quantidadeEmEstoque);
		this.marca = material;
	}

	/**
	 * Obtém a marca do alimento.
	 *
	 * @return a marca do alimento.
	 */
	public String getMarca() {
		return marca;
	}

	
	/**
	 * Esse metodo ele compara se a quantidade pedida na venda é maior que a
	 * quanidade em estoque, e caso aconteça, ocorre a excecao
	 * EstoqueInsuficienteException + mensagem de falta de estoque insificiente
	 * 
	 * @param quantidade quantidade que sera retirada do estoque
	 * @throws EstoqueInsuficienteException Se a quantidade nãofor o suficiente
	 * 
	 */
	public void vender(int quantidade) throws EstoqueInsuficienteException {
		if (quantidade > getQuantidadeEmEstoque()) {
			throw new EstoqueInsuficienteException(
					"Estoque insuficiente para vender " + quantidade + " unidades de " + getNome());
		}
		setQuantidadeEmEstoque(getQuantidadeEmEstoque() - quantidade);
	}
}
