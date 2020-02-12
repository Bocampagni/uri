//This is a the class that I use to solve the problems. 

package uri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	List<Integer> listaDeInteiros = new ArrayList<Integer>();
    	int casoDeTeste = sc.nextInt();
    	int contador = 0;
		int x,y;
		
    	for (int i = 0; i < casoDeTeste; i++) {
    		
    		x = sc.nextInt();
    		y = sc.nextInt();
    	
    		if(x + 1 == y || y + 1 == x) {
    			listaDeInteiros.add(contador);
    		}
    		
    		else {
    			if(x > y) {
    				
    				y++; //Não pode ser Y, tende de ser entre x e y.
    				while(y != x ) {
    					if(y % 2 == 1 || y == 1) {
    						contador += y;

    					}
    					
    					y++;
    				}
    				
    				listaDeInteiros.add(contador); 
    			}
    			
    			else if(y > x) {
    				x++; //Analogo ao último comentario.
    				while(x != y ) {
    					if(x % 2 == 1 || x == 1) {
    						contador += x;
    					}
    					
    					
    					x++;
    				}
    				listaDeInteiros.add(contador);
    			}
    			
    			
    			else {
    				listaDeInteiros.add(contador);
    			}
    		}
    		
    		contador = 0;
    	}
    	
    	listaDeInteiros.forEach(p1 -> System.out.println(p1));
    }
 
}

