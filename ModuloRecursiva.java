import java.util.Scanner;
public class ModuloRecursiva {
public static void main(String[] args) {
    Scanner opc = new Scanner(System.in);
    System.out.println("Ingresa un numero:");
    int n1=opc.nextInt();
    System.out.println("Ingresa otro numero:");
    int n2=opc.nextInt();
    int resultado=ModuloRecursiva(n1, n2);
    System.out.println("El resultado de la division de "+n1+ "%" +n2+ "=" + resultado);
}
public static int ModuloRecursiva(int a, int b){
    if (a<b){
        return 0;
        }else {
        return 1 + ModuloRecursiva(a-b,b);
        }
    }
    }

