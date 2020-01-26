package uri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class uri1080 {	 
	    public static void main(String[] args) throws IOException {
	    	
	    	
	    	Locale.setDefault(Locale.US);
	    	Scanner sc = new Scanner(System.in);
	    	
	    	int maior, index, aux;
	    	maior = 0;
	    	index = 0;
	    	
	    	for(int i = 0; i < 100; i++) {
	    		aux = sc.nextInt();
	    		if(aux > maior) {
	    			maior = aux;
	    			index = i;
	    		}
	    	}
	    	
	    	System.out.println(maior);
	    	System.out.println(index + 1);		
	    }
	}
