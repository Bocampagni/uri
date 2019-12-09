package uri;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int contador = 0;
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > y) {
			for(int c = y + 1; c < x; c++) {
				if(c % 2 == 1 || c % 2 == -1) {
					contador+= c;
				}
			}
		}
		
		else if(x < y){
			for(int c = x + 1; c < y; c++) {
				if(c % 2 == 1 || c % 2 == -1) {
					contador+= c;
				}
			}
		}
		else {}
		
		System.out.println(contador);
		sc.close();
	}
}