package uri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;



public class uri1094 {
 
    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	Locale.setDefault(Locale.US);
    	DecimalFormat df = new DecimalFormat("0.00");
    	
    	
    	int numeroDeTestes = sc.nextInt();
    	int coelho, rato, sapo, total;
    	coelho = 0; rato = 0; sapo = 0; total = 0; 
    	
    	for(int i = 0; i < numeroDeTestes; i++) {
    		
    		int quantidade = sc.nextInt();
    		String sigla = sc.next();
    		
    		
    		if(sigla.startsWith("C")) {
    			coelho += quantidade;
    			total += quantidade;
    		}
    		else if(sigla.startsWith("R")) {
    			rato += quantidade;
    			total += quantidade;
    		}
    		else if(sigla.startsWith("S")) {
    			sapo += quantidade;
    			total += quantidade;
    		}    		
    	}
    	
    	double percenRato, percenCoelho, percenSapo;
    	
    	
    	percenRato = (double) rato / (double)total;
    	percenCoelho = (double) coelho / (double) total;
    	percenSapo = (double) sapo / (double) total;
    	percenCoelho *= 100;
    	percenRato *= 100;
    	percenSapo *= 100;
    	
    	String pc = df.format(percenCoelho);
    	String pr = df.format(percenRato);
    	String ps = df.format(percenSapo);
    	
    	System.out.println("Total: " + total + " cobaias");
    	System.out.println("Total de coelhos: " + coelho);
    	System.out.println("Total de ratos: " + rato);
    	System.out.println("Total de sapos: " + sapo);
    	System.out.println("Percentual de coelhos: " + pc + " %");
    	System.out.println("Percentual de ratos: " + pr + " %");
    	System.out.println("Percentual de sapos: " + ps + " %");
    	
    }
}
