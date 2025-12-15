package POO_ProjetoHerois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome, objeto;
        int idade;

        List<Nadadores> nadadores = new ArrayList<>();

        /*
        Soldado sordado = new Soldado("Max", 30);
        sordado.arsenal();
        sordado.municoes();
        sordado.map.put("Pistola", 10);
        sordado.municoes();
        sordado.map.put("Fuzil", 30);
        sordado.arsenal();
        */

        for(int i = 0; i < 1; i++){
            System.out.print("Digite o nome do personagem: ");
            nome = scanner.nextLine();
            System.out.print("Digite a idade do personagem: ");
            idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o objeto do personagem: ");
            objeto = scanner.nextLine();
            nadadores.add(new Aquaman(nome, idade, objeto));
        }

        // add personagem com sobrecarga de metodos
        System.out.print("Digite o nome do personagem (SOBRECARGA): ");
        nome = scanner.nextLine();
        System.out.print("Digite a idade do personagem (SOBRECARGA): ");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o objeto do personagem (SOBRECARGA): ");
        objeto = scanner.nextLine();
        nadadores.add(new Aquaman(nome, idade, objeto, DificuldadePersonagem.FACIL));

        for(Nadadores n : nadadores){
            n.objetoPersonagem();
            n.inteligenciaCombate();
            n.inteligenciaCombate(51);
        }


        //Aquaman aquaman = new Aquaman(nome, idade, objeto);
        //Mergulhador mergulhador = new Mergulhador(nome, idade, "Pe di patim amarelo");

        //aquaman.objetoPersonagem();
        //mergulhador.objetoPersonagem();
    }
}
