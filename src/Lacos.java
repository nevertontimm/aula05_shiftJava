import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        double largura, comprimento, area;
        String resposta;

        do {
            System.out.println("Digite o comprimento do comodo: ");
            comprimento = leitor.nextDouble();
            System.out.println("Digite a largura do comodo: ");
            largura = leitor.nextDouble();
            area = comprimento * largura;
            System.out.println("A area do comodo é: " + area);
            System.out.println("Deseja informar outro comodo, digite S para Sim e N para Não: ");
            resposta = leitorTexto.nextLine();

        } while(resposta.equalsIgnoreCase("S"));
    }
}
