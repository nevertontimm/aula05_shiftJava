import java.util.Scanner;

public class LacoFor3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int numero, i, media, pares = 0, impares = 0, soma = 0;
        for (i=1; i<=10; i++){
            System.out.println("Digite um número");
            numero = leitor.nextInt();
            soma += numero;
            if (numero % 2 == 0){
                pares ++;
            } else {
                impares ++;
            }
        }
        media = soma / 10;
        System.out.println("Pares: " + pares + " Impares: " + impares + " Média: " + media);
    }
}
