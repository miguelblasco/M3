import java.util.Scanner;

public class Nivell3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
        int fibonacci;
        int fibo = 0;
        int anterior = 1;
        int actual = 0;
        int i;
        
        System.out.print("Introducir número para el cáculo de la serie de Fibonacci:");		
        fibonacci = entrada.nextInt();
        
        System.out.println();
		System.out.print("0,");
        
        for (i = 1; i < fibonacci; i ++){
        
            fibo = actual + anterior;
    	//	  1       1       0
    	//	  2       1       1
    	//	  3       2       1
    	//	  5       3       2
    	//	  8       5       3
    	//	  13      8       5
            
          //Garantizamos que en el último término de la serie no salga la ","
			if (i == fibonacci - 1) {
			    System.out.print(fibo);
			}else System.out.print(fibo + ",");
			
            anterior = actual;
            actual = fibo;	               
        }		
		entrada.close();				
	}
}





