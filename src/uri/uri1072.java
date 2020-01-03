
package uri;

import java.io.IOException;
import java.util.Scanner;


public class uri1072 {
 
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int teste = sc.nextInt();
    	int in = 0;
    	int out = 0;
    	int[] array = new int[teste];
    	for(int i = 0; i < teste; i++) {
    		array[i] = sc.nextInt();
    		if(array[i] >= 10 && array[i] <= 20) {
    			in++;
    		}
    		else {
    			out++;
    		}
    	}
    	
    	
    	System.out.println(in + " in\n" + out + " out");
    }
}

