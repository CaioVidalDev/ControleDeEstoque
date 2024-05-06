package SistemaEstoqueAtacadão;

/**
 * @author MiguelGadelha/CaioNobreVidal
 * @version 23/11/2023
 */
/**
 * Interface que define o contrato para produtos que podem ser vendidos.
 *
 */
public interface Vendavel {
	/**
	 * Metodo para vender uma quantidade específica do produto.
	 *
	 * @param quantidade A quantidade a ser vendida.
	 * @throws EstoqueInsuficienteException Se a quantidade em estoque for
	 *                                      insuficiente.
	 */
	void vender(int quantidade) throws EstoqueInsuficienteException;
}
