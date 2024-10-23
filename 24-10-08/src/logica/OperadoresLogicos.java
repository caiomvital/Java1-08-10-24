package logica;

public class OperadoresLogicos {
public static void main(String[] args) {
	
	String nome = "Tadeu";
	boolean adimplente = false;
	boolean temCredito = true;
	
	//se estou adimplente e tenho credito, posso pedir um emprestimo
	//se estou adimplente ou tenho credito, posso fazer um parcelamento
	//se estou inadimplente e não tenho crédito, só posso comprar à vista
	
	boolean possoPedirEmprestimo = (adimplente == true && temCredito == true);
	boolean possoFazerParcelamento = adimplente == true || temCredito == true;

	//se adimplente && temCredito -> pedirEmprestimo = true;
	
	if(adimplente == true) {
		System.out.println("Estou adimplente");
		System.out.println("Meu nome é " + nome);
		int valor1 = 10;
		int valor2 = 20;
		System.out.println(valor1 + valor2);
	} else {
		System.out.println("Estou inadimplente");
	}
	
	
 
	
}
}
