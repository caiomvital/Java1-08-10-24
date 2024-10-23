package estoque;

import java.util.Scanner;

public class ControleEstoque {

	public static void main(String[] args) {
		
		/* Passo 1: Crie três variáveis:
	    1. nome do produto 
	    2. preço do produto 
	    3. quantidade do produto. */

		String lista = "";
		
		
		String nomeDoProduto;
		double precoDoProduto; 
		int quantidadeProduto;
		
		/*Passo 2: 
	    Solicite ao usuário que preencha 
	    1. o nome do produto; 
	    2. o preço do produto;
	    3. a quantidade do produto. */
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do produto: ");
		nomeDoProduto = scan.nextLine();
		System.out.println("Digite o preço do produto: ");
		precoDoProduto = scan.nextDouble();
		System.out.println("Digite a quantidade em estoque: ");
		quantidadeProduto = scan.nextInt(); scan.nextLine();
		
		lista += "Produto: " + nomeDoProduto + "\n";
		lista += "Preço: R$ " + precoDoProduto + "\n";
		lista += "Quantidade: " + quantidadeProduto + "\n";
		
		
		 /* Passo 3: 
	    Crie mais duas variáveis 
	    1. uma para verificar se o produto está em estoque
	    2. outra para verificar se o produto está em promoção */
		
		boolean emEstoque;
		boolean emPromocao;
		
		/* Passo 4: Exiba no console:
	    
	    1. Se um produto está disponível para compra.
	    Regra: Um produto estará disponível para compra 
	    se estiver em estoque.
	    */
		emEstoque = quantidadeProduto > 0;
		
		if(emEstoque == true) {
			System.out.println("Produto disponível.");
		} else {
			System.out.println("Produto indisponível.");
		}
		
		
		/*
	    2. em promoção: 
	    Um produto estará em promoção se a quantidade em estoque 
	    for maior que 20 OU se o preço multiplicado pela quantidade 
	    for maior que R$ 50 */
		
		emPromocao = quantidadeProduto > 20 || 
				(precoDoProduto * quantidadeProduto) > 50;
		if(emPromocao == true) {
			System.out.println("Produto está em promoção.");
		} else {
			System.out.println("Produto está com preço normal.");
		}
		
		/* Passo 5: Crie mais quatro produtos. */
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o nome do produto: ");
			nomeDoProduto = scan.nextLine();
			System.out.println("Digite o preço do produto: ");
			precoDoProduto = scan.nextDouble();
			System.out.println("Digite a quantidade em estoque: ");
			quantidadeProduto = scan.nextInt(); scan.nextLine();
			
			lista += "Produto: " + nomeDoProduto + "\n";
			lista += "Preço: R$ " + precoDoProduto + "\n";
			lista += "Quantidade: " + quantidadeProduto + "\n";
			
			emEstoque = quantidadeProduto > 0;
			
			if(emEstoque == true) {
				System.out.println("Produto disponível.");
			} else {
				System.out.println("Produto indisponível.");
			}
			
			emPromocao = quantidadeProduto > 20 || 
					(precoDoProduto * quantidadeProduto) > 50;
			if(emPromocao == true) {
				System.out.println("Produto está em promoção.");
			} else {
				System.out.println("Produto está com preço normal.");
			}
			
		}
		
		System.out.println(lista);
		

	}

}
