import java.util.Scanner;

public class Main {
    public static void main(String[]args){
    Scanner op= new Scanner (System.in);

System.out.print("Bienvenido a nuestro menu de opcion, por favor sea tan amable de indicar que proceso desea realizar");
int opcion; 

do{
    System.out.print("Menu de opciones");
    System.out.print("1. Pasar de coordenadas polares a coordenadas cartesianas");
    System.out.print("2. Pasar de coordenadas cartesianas a coordenadas polares");
    System.out.print("3. Salir del programa ");

opcion=op.nextint();
switch(opcion){
  
    case 1:
        System.out.print("Ingrese la distancia (r): ");
                    double r = op.nextDouble();
                    System.out.print("Ingrese el ángulo en grados (θ): ");
                    double theta = Math.toRadians(op.nextDouble());
                    double x = r * Math.cos(theta);
                    double y = r * Math.sin(theta);
                    System.out.println("Las coordenadas cartesianas son: (" + x + ", " + y + ")");
                    break;
    case 2:
       System.out.print("Introduzca el valor a guardar como eje x de la coordenada"); 
        double x=op.nextDouble();
        System.out.print("Introduzca el valor a guardar como eje y de la coordenada"); 
        double y=op.nextDouble();
        double r = Math.sqrt(x * x + y * y);
        double t = Math.toDegrees(Math.atan2(y, x));
        System.out.println("Las coordenadas polares son: (r=" + r + ", θ=" + t + "°)");
        break; 
    case 3: 
        System.out.print("Saliendo del programa....");
        break;
        default;
        
        System.out.print("Opcion no valida");
        break;
}
}
}  while (opcion!=3);
    }
        }
