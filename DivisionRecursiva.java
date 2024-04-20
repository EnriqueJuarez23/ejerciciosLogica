import java.util.Scanner;
public class DivisionRecursiva {
public static void main(String[] args) {
    Scanner opc = new Scanner(System.in);
    System.out.println("Ingresa un numero:");
    double n1=opc.nextDouble();
    System.out.println("Ingresa otro numero:");
    double n2=opc.nextDouble();
    double resultado=DivisionRecursiva(n1, n2);
    System.out.println("El resultado de la division de "+n1+ "/" +n2+ "=" + resultado);
}
public static double DivisionRecursiva(double a, double b){
    if (a<b){
    return 0;
    }else {
    return 1 + DivisionRecursiva(a-b, b);
    }
}
}