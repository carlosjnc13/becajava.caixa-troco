package caixaTroco;
public class Main {

    public static void main(String[] args) {
    	
    	Produto produto = new Produto();
    	produto.ObterValor();
    	
    	do {
    		produto.ObterValorPagar();
    		
    		if(produto.ValorPagar == 0)
    			break;
    		
    		produto.Calculartroco();
    		
    	}
    	while(produto.ValorProduto != 0); 
    		
    		produto.Leitor.close();
    	
    	
    }     
}


