package trabalho04_GetsSets;
import java.util.Scanner;
public class principal {

	public static void main (String [] args) {
		Scanner read = new Scanner(System.in);
		
		conta conta01 = new conta(23196, 50.00, 1);
		conta conta02 = new conta(23085, 2);
		conta conta03 = new conta();
		conta03.setNumero(22145);
		conta03.setSaldo(100.00);
		conta03.setTipo(3);
		
		System.out.println(conta01.toString());
		System.out.println(conta02.toString());
		System.out.println(conta03.toString());
		
		conta01.setSaldo(-30.00);
		System.out.println(conta01.toString());
		
		conta01.setSaldo(90.00);
		System.out.println(conta01.toString());
		
		conta02.setSaldo(-10.00);
		System.out.println(conta02.toString());
		
		conta02.setSaldo(400.00);
		System.out.println(conta02.toString());
		
		conta03.setSaldo(-150.00);
		System.out.println(conta03.toString());
		
		conta03.setSaldo(350.00);
		System.out.println(conta03.toString());
		
		read.close();
	}
}
