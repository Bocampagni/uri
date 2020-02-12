package uri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uri1061 {
 
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	List<String> list = new ArrayList<>();
    	
    	for(int i = 0; i < 4; i++) {
    		list.add(sc.nextLine());
    	}
    	
    	int dia1 = Integer.parseInt(list.get(0).substring(4));
    	
    	int dia2 = Integer.parseInt(list.get(2).substring(4));
    	
    	String[] array1 = list.get(1).split(" : ");
    	int[] hms1 = new int[3];
    	for (int i = 0; i < 3; i++) {
    		hms1[i] = Integer.parseInt(array1[i]);
    	}
    	
    	String[] array2 = list.get(3).split(" : ");
    	int[] hms2 = new int[3];
    	for (int i = 0; i < 3; i++) {
    		hms2[i] = Integer.parseInt(array2[i]);
    	}
    	
    	//[0] - > hora
    	//[1] - > minuto
    	//[2] - > segundo
    	int resultadoDia = dia2 - dia1;
    	int resultadoHora, resultadoMinuto, resultadoSegundo;
    	
    	if(hms2[0] > hms1[0]) {
    		resultadoHora = hms2[0] - hms1[0];
    	}
    	else if(hms2[0] < hms1[0]) {
    		resultadoHora = hms2[0] - hms1[0] + 24;
    		resultadoDia -= 1;
    	}
    	
    	else {
    		resultadoHora = 0;
    	}
    	
    	
    	
    	if(hms2[1] > hms1[1]) {
    		resultadoMinuto = hms2[1] - hms1[1];
    	}
    	else if(hms2[1] < hms1[1]) {
    		resultadoMinuto = hms2[1] - hms1[1] + 60;
    		resultadoHora -= 1;
    	}
    	
    	else {
    		resultadoMinuto = 0;
    	}
    	
    	
    	
    	if(hms2[2] > hms1[2]) {
    		resultadoSegundo = hms2[2] - hms1[2];
    	}
    	else if(hms2[2] < hms1[2]) {
    		resultadoSegundo = hms2[2] - hms1[2] + 60;
    		resultadoMinuto-= 1;
    	}
    	
    	else {
    		resultadoSegundo = 0;
    	}
    	 
    	System.out.println(resultadoDia + " dia(s)\n" + resultadoHora + " hora(s)\n" + resultadoMinuto + " minuto(s)\n" + resultadoSegundo + " segundo(s)");
    	
    }
}

