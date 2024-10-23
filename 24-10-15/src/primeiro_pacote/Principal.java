package primeiro_pacote;

import java.util.HashMap;
import java.util.Map;

public class Principal {
public static void main(String[] args) {

	Map<String, Double> produtos = new HashMap<>();
	
	produtos.put("Arroz", 3.5);
	produtos.put("Feijão", 9.59);
	produtos.put("Macarrão", 2.37);
	
	for(String chave : produtos.keySet()) {
		System.out.print(chave + ": ");
		System.out.printf("R$ %.2f\n", produtos.get(chave));
	}

	for(Map.Entry<String, Double> entrada: produtos.entrySet()) {
        System.out.println("Produto: " + entrada.getKey() + " - Preço: " + entrada.getValue());

	}
//	System.out.println(metodo(10, 0));
	try {
	    double resultado = metodo(10, 0);
	    System.out.println("O resultado é: " + resultado);
	} catch (ArithmeticException ex) {
	    System.out.println("Erro: " + ex.getMessage());  // Vai imprimir "Erro: Não é possível dividir por zero!"
	}
	
}

public static double metodo(int a, int b) throws ArithmeticException {
	if(b == 0) {
		throw new ArithmeticException("Não é possível dividir por 0");
		
	} 

	return a / b;
	}
}


