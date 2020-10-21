package caixaTroco;
import java.util.Scanner;
public class caixaTroco {

    public static void main(String[] args) {
    	 int valorProduto = 0;
         int pagamento = 0;
         int troco = 0;
         Scanner leitor = new Scanner(System.in);

         System.out.println("Insira o valor do produto: ");
         valorProduto = leitor.nextInt();

         do{
             System.out.print("Insira o valor do seu pagamento: ");
             pagamento = leitor.nextInt();

             if(pagamento == 0) {
                 System.out.println("Obrigada por usar nosso sistema!");
             }else
                 if(pagamento < valorProduto) {
                 System.out.println("Digite um valor maior que o valor do produto!");
             }else
                 if(pagamento>= valorProduto) {
                     troco = pagamento - valorProduto;
                     System.out.println("O valor do seu troco é: " + troco);
                 }
         }while(pagamento != 0);
     
    	
     }
    }
    
       



