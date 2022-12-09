package salud;
import java.util.*;

public class persona {

    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    int edad;
    String sexo;
    
   

    Scanner entrada = new Scanner(System.in);

    public void pedirDatos() {

        System.out.println("-----------------------------------");

        System.out.println("ingrese su tipo de documento");
        tipoDoc=entrada.next();

        System.out.println("ingrese su documento");
        documento=entrada.nextInt();

        System.out.println("ingrese su nombre");
        nombre=entrada.next();

        System.out.println("ingrese su apellido");
        apellido=entrada.next();

        System.out.println("ingrese su edad");
        edad=entrada.nextInt();

        System.out.println("ingrese su sexo");
        sexo=entrada.next();    

    }
    public void mostrarPersona(int peso,int estatura) {

        System.out.println("-----------------------------------");
        
        System.out.println("Documento "+tipoDoc+" numero :"+documento);

        System.out.println("Nombre: "+nombre+apellido);

        System.out.println("peso: "+peso+"kg");

        System.out.println("Estatura: "+estatura);

        System.out.println("Edad: "+edad);

        System.out.println("Sexo: "+sexo);    

        System.out.println("-----------------------------------");
    }
    
    public int calcularlmc(int peso,int estatura) {
      
        int pesoActual=peso/estatura*2;

        if (pesoActual<19) {
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if((pesoActual>20)&&(pesoActual<=25)){
            System.out.println("El peso es ideal");
        }
        else if(pesoActual>25){
            System.out.println("Tiene sobrepeso");
        }

        return pesoActual;       
    }

    public void mayorEdad() {

        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }


    
}
