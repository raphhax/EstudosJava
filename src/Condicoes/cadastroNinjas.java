package Condicoes;
import java.util.Scanner;

import java.util.Scanner;

public class cadastroNinjas {
    private static final int TAMANHO = 10;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[TAMANHO];
        int opcao = 0, ninja =0;
        boolean sair = false;
        do{
            menu();
            opcao  = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.print("Digite o nome: ");
                    ninjas[ninja++] = scanner.nextLine();
                    break;
                case 2:
                    int i = 0;
                    while(ninjas[i] != null){
                        System.out.println(i + "- " + ninjas[i]);
                        i++;
                    }
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }

        }while(!sair);
    }

    public static void menu(){
        System.out.println("---CADASTRO NINJAS---");
        System.out.println("1- Novo ninja");
        System.out.println("2- Visualizar ninjas");
        System.out.println("3- Sair");
        System.out.print("\nselecionar: ");
    }
}
