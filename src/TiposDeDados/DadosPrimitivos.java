package TiposDeDados;

import java.sql.SQLOutput;

public class DadosPrimitivos {
    public static void main(String[] args){
        int idade = 20;
        char inicial = 'R';
        boolean treinando = true;
        double altura = 1.68;
        float peso = 6400;
        Long saldoBancario = 1000000000L;

        System.out.println("Dados do ninja!:");
        System.out.println("Idade: " + idade);
        System.out.println("Inicial: " + inicial);
        System.out.println("Treinando: "  +treinando);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Saldo Bancario: " + saldoBancario);

        String nome = "Raphael Naruto";
        System.out.println("Nome: " + nome);
        String nomeUpper = nome.toUpperCase();
        System.out.println("Nome maiusculo: " + nomeUpper);

    }
}
