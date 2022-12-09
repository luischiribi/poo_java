package principal;
import salud.*;
import java.util.*;

public class inicio {
    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        
        persona ejecutar = new persona();
        ejecutar.pedirDatos();

        System.out.println("ingrese su peso");
        int peso=entrada.nextInt();

        System.out.println("ingrese su estatura");
        int estatura=entrada.nextInt();

        ejecutar.mostrarPersona(peso,estatura);

        ejecutar.calcularlmc(peso,estatura);
        
        ejecutar.mayorEdad();


        entrada.close();

    }
    
}
