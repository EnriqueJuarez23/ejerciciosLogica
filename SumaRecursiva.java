import java.util.Scanner;
public class SumaRecursiva {
public static void main(String[] args) {
    Scanner opc = new Scanner(System.in);
    System.out.println("Ingresa un numero:");
    int n1=opc.nextInt();
    System.out.println("Ingresa otro numero:");
    int n2=opc.nextInt();
    int resultado=SumaRecursiva(n1, n2);
    System.out.println("el resultado de la suma de "+n1+ "+" +n2+ "=" + resultado);
}
public static int SumaRecursiva(int a, int b){
    if (b==0){
    return a;
    }else {
    return SumaRecursiva(a+1,b-1);
    }
}
}

