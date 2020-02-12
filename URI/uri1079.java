
package uri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class uri1079 {
 
    public static void main(String[] args) throws IOException {
    	
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	List<Double> listaDeNumeros = new ArrayList<>();
    	int caseTest = sc.nextInt();
    	
    	for(int i = 0; i < caseTest; i++) {
    		Double primeiro, segundo, terceiro;
    		
    		primeiro = sc.nextDouble();
    		segundo = sc.nextDouble();
    		terceiro = sc.nextDouble();
    		

    		primeiro = primeiro * 2;
    		segundo  = segundo * 3;
    		terceiro = terceiro * 5;
    		
    		listaDeNumeros.add((primeiro + segundo + terceiro)/10);
    	}
 

    	for(int i = 0; i < listaDeNumeros.size(); i++) {
    		System.out.printf("%.1f", listaDeNumeros.get(i));
    		System.out.println();
    	}
   

    }
}

