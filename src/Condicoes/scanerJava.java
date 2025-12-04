package Condicoes;
import java.util.Scanner; /* BIBLIOTECA DO SCANNER */

public class scanerJava {
    public static void main(String[] args){

        /* SCANNER UNICO PARA TODAS AS LEITURAS */
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.print("Digite o nome do ninja: ");
        String nomeNinja = caixaDeTexto.nextLine();

        System.out.print("Digite a idade do ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();

        System.out.println("Idade: " + idadeNinja);
        System.out.println("Nome ninja: " + nomeNinja);

        switch (idadeNinja){
            case 20:
                System.out.println("Idade para ser hokage!");
                break;
            case 16:
                System.out.println("Sem idade para ser hokage!");
                break;
            default:
                System.out.println("OK!");
                break;
        }

        caixaDeTexto.nextLine(); // Para limpar o buffer

        System.out.println("Digite as missoes: ");
        String[] missoes = new String[2];
        for(int i = 0; i < 2; i++){
            System.out.print(i + " = ");
            missoes[i] = caixaDeTexto.nextLine();
        }
        for(int i = 0; i < 2; i++){
            System.out.println("missao " + i + ": " + missoes[i]);
        }




        caixaDeTexto.close();
    }
}
