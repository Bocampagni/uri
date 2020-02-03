//This is a the class that I use to solve the problems. 

package uri;

import java.io.IOException;

public class uri1097 {
 
    public static void main(String[] args) throws IOException {
    	int x = 0;
    	int j = 7;
    	for(int i = 1; i < 10; i+= 2) {
    		while(x < 3) {
    			
    			System.out.println("I="+ i + " J=" + j--);
    			x++;
    			
    		}
    		j+= 5;
    		x = 0;
    		
    	}
    	
 
    }
 
}

