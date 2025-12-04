package POO_intermediaria;

public class Hatake extends Ninja implements Sharingan{
    public void boasVindas(){
        System.out.println("Eu sou um HATAKE");
    }

    // vem da interface
    public void sharinganAtivado(){
        System.out.println(this.nome + " Ativou o sharingan!");
    }
}
