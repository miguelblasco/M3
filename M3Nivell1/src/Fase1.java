import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		

        System.out.print("1.-Introduce nombre de la primera ciudad: \n"); //instrucción para sacar por pantalla mensajes
        String ciudad1 = entrada.nextLine(); // introducir un valor
        System.out.print("\n\n"); // para crear una línea en blanco

        System.out.print("2.-Introduce nombre de la segunda ciudad: \n");
        String ciudad2 = entrada.nextLine();
        System.out.print("\n\n");

        System.out.print("3.-Introduce nombre de la tercera ciudad: \n");
        String ciudad3 = entrada.nextLine();
        System.out.print("\n\n");

        System.out.print("4.-Introduce nombre de la cuarta ciudad: \n");
        String ciudad4 = entrada.nextLine();
        System.out.print("\n\n");

        System.out.print("5.-Introduce nombre de la quinta ciudad: \n");
        String ciudad5 = entrada.nextLine();
        System.out.print("\n\n");

        System.out.print("6.-Introduce nombre de la sexta ciudad: \n");
        String ciudad6 = entrada.nextLine();
        System.out.print("\n\n");

        //mostrar por pantalla las 6 ciudades
        System.out.print("Las seis ciudades son: " + ciudad1 + "," + ciudad2 + "," + ciudad3 + "," + ciudad4 + "," + ciudad5 + "," + ciudad6);
           
        entrada.close();
    }
}
		
		
		
		
	


