package POO_ProjetoHerois;

import java.util.HashMap;
import java.util.Map;


public class Soldado extends Militar implements Armamentos{
    Map<String, Integer> map = new HashMap<>();

    int municoes;

    public Soldado() {
    }

    public Soldado(String nome, int idade) {
        super(nome, idade);
    }

    public Soldado(String nome, int idade, DificuldadePersonagem dificuldadePersonagem) {
        super(nome, idade, dificuldadePersonagem);
    }

    @Override
    public void arsenal() {
        System.out.println("Armas disponiveis: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey());
        }
    }

    @Override
    public void municoes() {
        System.out.println("Municoes disponiveis: ");
        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            i++;
            System.out.println(i + "- " + entry.getKey() + ": " + entry.getValue() + " municoes");
        }
    }



}
