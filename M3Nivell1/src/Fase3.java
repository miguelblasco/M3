import java.util.*;


public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); //Para que no salga error al final del programa se debe poner: entrada.close();

        int num;
 
        String ingresar;

        ArrayList<String> arrayModifiedCities = new ArrayList<String>();

        
        do{
           
            System.out.print("¿Cuántas ciudades quieres introducir?: ");
            ingresar =entrada.nextLine();
            System.out.print("\n");

   
            if (!(ingresar.matches("[0-9]*")))
            	System.out.println("Sólo ingresa números por favor!\n");
            
        } while (!(ingresar.matches("[0-9]*")));



        num = Integer.parseInt(ingresar);// para convertir "entrada" que es un string en int para que puedar usarlo num
        
        int i;
        for (i = 0; i < num; i ++){
        	System.out.print("\n");
        	System.out.print(i + 1 + ".-Introduce nombre de la ciudad " + (i + 1) + ": ");
            arrayModifiedCities.add(entrada.nextLine());
            System.out.print("\n");
        }


        System.out.print("\n\n");
        System.out.print("Las ciudades son:");
        System.out.print("\n");
        
        for (String c:arrayModifiedCities){
        	i = arrayModifiedCities.indexOf(c); // indexOf nos permite saber la posición que ocupa el elemento del array
        	System.out.println(i + 1 + ".-" + c); 
        }

        System.out.print("\n\n");
        System.out.print("Las ciudades modificadas son: \n");

        for (String c:arrayModifiedCities){
        	i = arrayModifiedCities.indexOf(c);
        	System.out.println(i + 1 + ".-" + c.replace("a", "4"));
        }
        entrada.close(); //sirve para cerrar el: Scanner entrada = new Scanner(System.in);  
    }
}
		
		
		
	


