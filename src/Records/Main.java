package Records;

import POO_intermediaria.Ninja;

public class Main {
    public static void main(String[] args){
        NinjaRecord cadastroNinjaRecord = new NinjaRecord("Sasuke", "sasuKE@gMail.coM", 1191234567);
        NinjaRecord cad2 = new NinjaRecord("sasuke@email");

        System.out.println(cad2);
        System.out.println(cadastroNinjaRecord);

        // A GRANDE DIFERENCA EH QUE SEUS ATRIBUTOS SAO FINALS, OU SEJA EU NAO CONSIGO ALTERAR E;E DEPOIS, ENTAO IGUAL
        // NO CAD2 EU CRIEI SO COM EMAIL, DAI DEPOIS EU NAO CONSIGO NEM ADD UM NOME NEM SE QUER MUDAR O EMAIL.
        // MESMA COISA PARA O CADASTRONINJARECORD, NELE EU NAO CONSIGO ALTERAR NADA, NAO EXISTE SET E NEM MUDANCA BRUTA
    }
}
