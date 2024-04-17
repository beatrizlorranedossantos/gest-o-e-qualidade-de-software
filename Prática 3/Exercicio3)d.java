import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        else {
            double delta = b * b - 4 * a * c;


          
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            if (delta < 0) {
                System.out.println("Caso d.i) - Esta equação não possui raízes reais (delta < 0): delta = " + delta);
            }


      
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Caso d.ii) - Esta equação possui duas raízes reais iguais: x' = x'' = " + raiz);
            }


      
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Caso d.iii) - Esta equação possui duas raízes reais diferentes: delta = " + delta +
                        ", x' = " + raiz1 + ", x'' = " + raiz2);
            }
        }

        scanner.close();
    }
}
