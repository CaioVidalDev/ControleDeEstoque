package SistemaEstoqueAtacadão;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal que executa o sistema de estoque, responsável por armazenar
 * informações dos produtos registrados e simular vendas.
 * 
 * @author MiguelGadelha/CaioNobreVidal
 * @version 23/11/2023
 */
public class AtacadaoVarejo {
	/**
	 * Método principal para execução do Sistema de Estoque.
	 *
	 * @param args Argumentos de linha de comando (não utilizado neste momento).
	 */
	public static void main(String[] args) {
		List<Vendavel> estoque = new ArrayList<>();

		// Adicionando alguns produtos de exemplo ao estoque
		estoque.add(new Alimento("Arroz", 5.0, 50, "Marca Fartura"));
		estoque.add(new Alimento("Xilito", 1.5, 60, "Marca Torcida"));
		estoque.add(new Alimento("Nesquik Lata", 10.0, 12, "Marca Nestle"));
		estoque.add(new Brinquedo("Barbie", 15.0, 40, "Plástico"));
		estoque.add(new Brinquedo("Carrinho", 10.0, 30, "Plástico"));
		estoque.add(new Brinquedo("Lego Balde", 110.0, 10, "Plástico"));

		// Adicione mais produtos conforme necessário

		// Exibindo informações do estoque
		System.out.println("ESTOQUE INICIAL");
		for (Vendavel produto : estoque) {
			System.out.println("Nome: " + ((Produto) produto).getNome());
			System.out.println("Preço: R$" + ((Produto) produto).getPreco());
			System.out.println("Quantidade em Estoque: " + ((Produto) produto).getQuantidadeEmEstoque());

			if (produto instanceof Alimento) {
				System.out.println("Marca: " + ((Alimento) produto).getMarca());
			} else if (produto instanceof Brinquedo) {
				System.out.println("Material: " + ((Brinquedo) produto).getMaterial());
			}

			System.out.println("-------------");
		}

		// Simulando venda de produtos
		try {
			estoque.get(0).vender(30); // Vender 30 unidades do primeiro produto
			estoque.get(1).vender(15); // Vender 15 unidades do segundo produto
		} catch (EstoqueInsuficienteException e) {
			System.out.println("Erro ao vender produto: " + e.getMessage());
		}
		System.out.println("ESTOQUE FINAL");
		for (Vendavel produto : estoque) {
			System.out.println("Nome: " + ((Produto) produto).getNome());
			System.out.println("Preço: R$" + ((Produto) produto).getPreco());
			System.out.println("Quantidade em Estoque: " + ((Produto) produto).getQuantidadeEmEstoque());

			if (produto instanceof Alimento) {
				System.out.println("Marca: " + ((Alimento) produto).getMarca());
			} else if (produto instanceof Brinquedo) {
				System.out.println("Material: " + ((Brinquedo) produto).getMaterial());
			}

			System.out.println("-------------");
		}
	}
}
