//This is a the class that I use to solve the problems. 

package uri;



public class Main {
 
    public static void main(String[] args){ 
    	
    	
    	calcularHora(217830);
    	
    	
    }
    
    static void calcularHora(double num) {
    	
    	
    	
    	
    	int hora = (int) num / 3600;
    	
    	num = num - hora * 3600;
    	
    	int minuto = (int) num / 60;
    	num = num - minuto * 60;
    	
    	int segundo = (int) num;
    	
    	
    	System.out.println(hora + "h " + minuto + "m " + segundo + "s");
    	  	
    	
    }
}

