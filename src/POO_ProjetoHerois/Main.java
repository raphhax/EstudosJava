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

        for(int i = 0; i < 2; i++){
            System.out.print("Digite o nome do personagem: ");
            nome = scanner.nextLine();
            System.out.print("Digite a idade do personagem: ");
            idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o objeto do personagem: ");
            objeto = scanner.nextLine();
            nadadores.add(new Aquaman(nome, idade, objeto));
        }

        for(Nadadores n : nadadores){
            n.objetoPersonagem();
        }



        //Aquaman aquaman = new Aquaman(nome, idade, objeto);
        //Mergulhador mergulhador = new Mergulhador(nome, idade, "Pe di patim amarelo");

        //aquaman.objetoPersonagem();
        //mergulhador.objetoPersonagem();
    }
}
