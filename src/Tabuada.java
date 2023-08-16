import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, tab, i;
        System.out.println("Digite um número para calcular a tabuada: ");
        numero = leitor.nextInt();
        for (i = 1; i <=10; i++){
            tab = i * numero;
            System.out.println(numero + " x " + i + " = " + tab);
        }

    }
}
