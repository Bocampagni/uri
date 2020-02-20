//This is a the class that I use to solve the problems. 

package uri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int contador = 0;
    	int i = 0;
    	List<Double> list = new ArrayList<>();
    	
    	
    	while(contador != 2) {
    		
    		while(list.size() != 2) {
    			Double numero = sc.nextDouble();
    			if(numero < 0 || numero > 10) {
    				System.out.println("nota invalida");
    			}
    			else {
    				list.add(numero);
    				contador++;
    				i++;
    			}
    		}   		
    	}
    	
    	Double media = (list.get(0) + list.get(1))/2;
		System.out.println("media = " + media);
    	
    	
    }
 
}

