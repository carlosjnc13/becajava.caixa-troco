package caixaTroco;
import java.util.Scanner;

public class Produto {
	
	public double ValorProduto;
	public double ValorPagar;
	public double Troco;
	public Scanner Leitor = new Scanner(System.in);
	
	public void ObterValor() {
		System.out.println("digite o valor do produto");
		ValorProduto = Leitor.nextDouble();
	}
	public void ObterValorPagar() {
		System.out.println("digite o valor do pagamento");
		ValorPagar = Leitor.nextDouble();
	}
	public void Calculartroco(){
		Troco = ValorPagar - ValorProduto;
		if (Troco > 0) {
			System.out.println("Seu troco é: " + Troco);	
		}else {
			System.out.println("Não existe Troco");
		}
		
	}
}
