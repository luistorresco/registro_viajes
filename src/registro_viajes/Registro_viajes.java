/*
 * Hacer un programa que lea n registros de viajes 
código viaje, numero de personas que viajan y ciudad destino),
debe imprimir el valor del viaje si el valor por persona para cada destino
es el siguiente: Cartagena vale 1200000, Leticia vale 2000000, Cali 
vale 800000 y Bogotá vale 700000)
 */
package registro_viajes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Registro_viajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objered=new Scanner(System.in);
        int n, nro_personas; 
        float valor_persona, valor_total;
        String cod, ciudad;
        
        System.out.println("digite cantidad de registros");
        n=objered.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("cual es el codigo del viaje?");
            cod=objered.next();
            System.out.println("cuantas personas viajan ");
            nro_personas=objered.nextInt();
            System.out.println("cual es la ciudad de destinos?");
            ciudad=objered.next();
            //selector multiple
            switch (ciudad){
                case "cartagena": valor_persona=1200000;
                    break;
                case "leticia": valor_persona=2000000;
                    break;
                case "cali": valor_persona=800000;
                    break;
                case "bogota": valor_persona=700000;
                    break;
                default:System.out.println("\n Opcion no valida");
                 valor_persona=0;
                    break;   
            }
                valor_total=nro_personas*valor_persona;
                System.out.println("el valor todal es de "+ valor_total+ "  con un codigo de viaje " + cod);
           
        } 
    }
    
}
