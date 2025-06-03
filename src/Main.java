import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("QUAL É O FILME?");
        System.out.println("**--------------------**");

        System.out.println("Jogador 1: Qual o nome do filme?");
        String nomeFilme = s.nextLine();

        String resposta = "";

        String[] dicas = new String[5];

        //PONTUAÇÃO
        int pontos[] = new int[5];

        pontos[0] = 100;
        pontos[1] = 60;
        pontos[2] = 40;
        pontos[3] = 20;
        pontos[4] = 10;

        for (int i = 0; i < dicas.length; i++) {
            System.out.println("Jogador 1: Qual a " + (i + 1) + "° dica ?");
            dicas[i] = s.nextLine();
        }

        for (int i = 0; i < dicas.length; i++) {
            System.out.println("Jogador 2: A " + (i + 1) + "° dica é:\n" +
                    dicas[i] + "\n" +
                    "Qual o nome do filme ?");
            resposta = s.nextLine();

            if (Objects.equals(resposta, nomeFilme)) {
                System.out.println("Parabéns, Você acertou, +" + pontos[i] + " pontos !");
                break;
            } else {
                System.out.println("Você errou !\n");
            }
        }


    }
}