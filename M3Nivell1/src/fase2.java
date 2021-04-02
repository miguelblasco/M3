import java.util.*;
public class fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] arrayCities; //declaración array
        arrayCities = new String[6]; //iniciación array y número elementos que tendrá

        //rellenar array -> string[] arrayCities = {Barcelona, Madrid,.....}

        arrayCities[0] = "Barcelona";
        arrayCities[1] = "Madrid";
        arrayCities[2] = "Valencia";
        arrayCities[3] = "Málaga";
        arrayCities[4] = "Cádiz";
        arrayCities[5] = "Santander";

        System.out.print("Las ciudades son: \n");
        
        int i;
        for (i = 0; i <= 5; i ++)
        {
        	System.out.println(i + 1 + ".-" + arrayCities[i]);
        }

        //Ordenar Array Ascendentemente
        Arrays.sort(arrayCities);

        //Imprimir
        System.out.print("\n\n");
        System.out.print("Array ordenado:\n");
        for (i = 0; i <= 5; i ++)
        {
        	System.out.println(i + 1 + ".-" + arrayCities[i]);
        }     
    }
}
		
		
		
		
		
	


