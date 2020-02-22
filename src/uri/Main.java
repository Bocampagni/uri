//This is a the class that I use to solve the problems. 

package uri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	List<String> listaTelefonica = new ArrayList<>();
    	
    	
    	int teste = sc.nextInt();
    	
    	for(int i = 0; i < teste; i++) {
    		
        	listaTelefonica.add(sc.next());
    	}
    	
    	int resultado = compara(listaTelefonica);
    	
    	System.out.println(resultado);
    	
    	
    	
    	
    }
    
    
    public static Integer compara(List<String> list) {
    	
    	int contador = 0;
    	for(int i = 0; i < list.size() - 1; i++) {
    		
    		String aux1 = list.get(i + 1);
    		String aux2 = list.get(0);
    		
    		for(int j = 0; j < aux1.length(); j ++){
    			if(aux1.charAt(j) == aux2.charAt(j)) {
    				contador++;
    			}
    			else if(aux1.charAt(j) != aux2.charAt(j)) {
    				break;
    			}
    		}
    	}
    	return contador;
    }
 
}

