package LinkedList_Challenge;
import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;

import static LinkedList_Challenge.MenuConstantes.*; // importando todas as consts static do arquivo

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static int id;

    public static void main(String[] args){
        id = 0;
        LinkedList<Ninja> listaNinjas = new LinkedList<>();
        int opcao = OP_PADRAO;

        System.out.println("-------BEM VINDO A LISTA DE NINJAS-------\n");

        while(opcao != SAIR){
            opcao = menu();
            switch (opcao){
                case SAIR:
                    return;
                case 1:
                    System.out.println("ADICIONANDO NINJA...\n");
                    if(addNaLista(listaNinjas)){
                        System.out.println("\nAdd com SUCESSO\n");
                    }else{
                        System.out.println("\nFALHA NA HORA DE ADICIONAR\n");
                    }
                    break;
                case 2:
                    System.out.println("VISUALIZANDO LISTA...");
                    for(Ninja ninjas : listaNinjas){
                        System.out.println(ninjas);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\nREMOVENDO NINJA...");
                    if(removerNinja(listaNinjas)){
                        System.out.println("\nREMOVIDO COM SUCESSO\n");
                    }else{
                        System.out.println("\nFALHA NA REMOCAO\n");
                    }
                    break;
                default:
                    System.out.println("\n!!!OPCAO INVALIDA!!!\n");
                    break;
            }
        }
    }

    public static int menu(){
        int opcao = OP_PADRAO;
        System.out.println("MENU:\n" +
                            "0- SAIR\n" +
                            "1- Add Ninja\n" +
                            "2- Listar Ninjas\n" +
                            "3- Remover Ninja\n");
        System.out.print("OPCAO DESEJADA: ");
        opcao = scanner.nextInt();
        return opcao;
    }

    public static boolean addNaLista(LinkedList<Ninja> listaNinja){
        System.out.println("Digite os dados do ninja que deseja adicionar: ");

        System.out.print("NOME: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.print("IDADE: ");
        int idade = scanner.nextInt();

        System.out.print("ALDEIA: ");
        scanner.nextLine();
        String aldeia = scanner.nextLine();

        System.out.println("DIGITE A LOCALIZACAO PARA ADICAO: ");
        System.out.print("1- COMECO\n2- MEIO\n3- FIM\n---- OPCAO: ");
        int opAdd = scanner.nextInt();
        if(opAdd == 2){
            System.out.print("Index para adicionar(INDEX MAXIMO: " + (listaNinja.size()-1) + ") : ");
            int indexAdd = scanner.nextInt();
            listaNinja.add(indexAdd, new Ninja(nome, idade, new Aldeia(aldeia)));
        }else if(opAdd == 1){
            listaNinja.addFirst(new Ninja(nome, idade, new Aldeia(aldeia)));
        }else if(opAdd == 3){
            listaNinja.addLast(new Ninja(nome, idade, new Aldeia(aldeia)));
        }else{
            System.out.println("Opcao invalida! ");
            return false;
        }
        return true;
    }

    public static boolean removerNinja(LinkedList<Ninja> listaNinja){
        System.out.print("1- Remover o primeiro da lista\n2- Remover o ultimo da lista\n3- Remover um id especifico\n---- OPCAO: ");
        int opRemov = scanner.nextInt();
        if(opRemov == 3){
            System.out.print("Digite o id desejado: ");
            int id = scanner.nextInt();
            listaNinja.remove(id);
        }else if(opRemov == 1){
            listaNinja.removeFirst();
        }else if(opRemov == 3){
            listaNinja.removeLast();
        }else{
            return false;
        }
        return true;
    }

}
