import java.util.Scanner;

public class CalculaAreaQuadrado {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar a medida do lado do quadrado
        System.out.println("Digite a medida do lado do quadrado: (em m², 2 casas decimais)");
        int lado = scanner.nextInt();

        //Calcular a área do quadrado
        int resultado = lado * lado;

        //Exibir o resultado
        System.out.println("A área do quadrado é: " + resultado + "m²");

        scanner.close();
    }
}
