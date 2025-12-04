package POO_intermediaria;

public class Uchiha extends Ninja implements Sharingan{
    public void boasVindas(){
        System.out.println("Eu sou um HATAKE");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(this.nome + " Ativou o sharingan!");
    }
}
