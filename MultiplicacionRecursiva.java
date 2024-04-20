import java.util.Scanner;
public class MultiplicacionRecursiva {
public static void main(String[] args) {
    Scanner opc = new Scanner(System.in);
    System.out.println("Ingresa un numero:");
    int n1=opc.nextInt();
    System.out.println("Ingresa otro numero:");
    int n2=opc.nextInt();
    int resultado=MultiplicacionRecursiva(n1, n2);
    System.out.println("El resultado de la multiplicacion de "+n1+ "*" +n2+ "=" + resultado);
}
public static int MultiplicacionRecursiva(int a, int b){
    if (b==0){
    return 0;
    }else {
    return a + MultiplicacionRecursiva(a,b-1);
    }
}
}