package SistemaEstoqueAtacadão;

/**
 * @author MiguelGadelha/CaioNobreVidal
 * @version 23/11/2023
 */
/**
 * Classe de excecao personalizada para representar um estoque insuficiente.
 *
 */
@SuppressWarnings("serial")
public class EstoqueInsuficienteException extends Exception {
	/**
	 * Construtor para a exceção EstoqueInsuficienteException.
	 *
	 * @param mensagem A mensagem de erro associada à exceção.
	 */
	public EstoqueInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
