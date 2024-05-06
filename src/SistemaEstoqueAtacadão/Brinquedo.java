package SistemaEstoqueAtacadão;

/**
 * @author MiguelGadelha/CaioNobreVidal
 * @version 23/11/2023
 */
/**
 * Subclasse do Produto que representa produtos do tipo Brinquedo.
 *
 */
public class Brinquedo extends Produto implements Vendavel {
	/**
	 * Material do brinquedo, característica que o diferencia de outros produtos
	 * genéricos.
	 */
	private String material;

	/**
	 * Construtor para a classe Brinquedo.
	 *
	 * @param nome                O nome do brinquedo.
	 * @param preco               O preço unitário do brinquedo.
	 * @param quantidadeEmEstoque A quantidade disponível em estoque.
	 * @param material            O material do brinquedo.
	 */
	public Brinquedo(String nome, double preco, int quantidadeEmEstoque, String material) {
		super(nome, preco, quantidadeEmEstoque);
		this.material = material;
	}

	/**
	 * Obtém o material do brinquedo.
	 *
	 * @return O material do brinquedo.
	 */
	public String getMaterial() {
		return material;
	}

	
	/**
	 * Esse metodo ele compara se a quantidade pedida na venda é maior que a
	 * quanidade em estoque, e caso aconteça, ocorre a excecao
	 * EstoqueInsuficienteException + mensagem de falta de estoque insificiente
	 * @param quantidade A quantidade a ser vendida.
	 * @throws EstoqueInsuficienteException Se a quantidade em estoque for
	 *                                      insuficiente.
	 */
	public void vender(int quantidade) throws EstoqueInsuficienteException {
		if (quantidade > getQuantidadeEmEstoque()) {
			throw new EstoqueInsuficienteException(
					"Estoque insuficiente para vender " + quantidade + " unidades de " + getNome());
		}
		setQuantidadeEmEstoque(getQuantidadeEmEstoque() - quantidade);
	}
}
