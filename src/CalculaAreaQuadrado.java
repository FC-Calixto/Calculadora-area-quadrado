import java.util.Scanner;

public class CalculaAreaQuadrado {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado = 0;
        boolean valido = false;

        while (!valido) {

            //Solicitar a medida lateral do quadrado
            System.out.println("Digite a medida lateral do quadrado em metros (até 2 casas decimais): ");
            String entrada = scanner.nextLine();

            //Normalizar entrada com , ou . na medida com casas decimais
            entrada = entrada.replace(',','.');

            try {
                //Converter entrada para double
                lado = Double.parseDouble(entrada);

                //Verifica limite de 2 casas decimais
                if (entrada.matches("\\d+(\\.\\d{1,2})?") && lado > 0) {
                    valido = true;
                } else {
                    System.out.println("Erro: Informe um número positivo com até duas casas decimais.");
                }
            } catch (NumberFormatException e) {
                    System.out.println("Erro: Entrada inválida. Digite apenas números decimais");
                }
        }

            //Calcular a área do quadrado
            double area = lado * lado;

            //Exibir resultado ao usuário utilizando o %.2f m²%n para exibir apenas 2 casas decimais
            System.out.printf("Área do quadrado: %.2f m²%n", area);

            scanner.close();
        }
    }