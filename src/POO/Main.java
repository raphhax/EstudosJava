package POO;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        //Ninja naruto = new Ninja();
        //naruto.nome = "Naruto";
        //naruto.aldeia = "Cla das folhas";

        /*
        Ninja[] ninjas = new Ninja[10];
        int i = 0;
        boolean possuo = true;
        while(i < 1){
            ninjas[i] = new Ninja();
            ninjas[i].nome = scanner.nextLine();
            ninjas[i].aldeia = scanner.nextLine();
            i++;
        }
        i = 0;
        while(i < 1){
            System.out.println("Ninja " + i);
            System.out.println(ninjas[i].nome);
            System.out.println(ninjas[i].aldeia);
            ninjas[i].SuperPoderAtivado();
            String haPoder = ninjas[i].souGuerreiro(possuo);
            System.out.println(haPoder);
            System.out.println("-----------------------");
            i++;
        }

        StarWars soldado = new StarWars();
        soldado.patrulhamento();
         */


        /*
        Galacticos galatim = new Galacticos();
        galatim.nome = "Galatao";
        galatim.habilidadeEspecial();

        Militares sordado = new Militares("Tenentao");
        sordado.habilidadeEspecial();

        Militares soldadao = new Militares(20);
        soldadao.nome = "El Soldadao";
        soldadao.habilidadeEspecial();

         */

        Galacticos galatim = new Galacticos("Galatim", "Marte", 999);
        Militares milico = new Militares("Capitao", "Quartel", 30);
        galatim.dadosPlayer();
        milico.dadosPlayer();
    }
}
