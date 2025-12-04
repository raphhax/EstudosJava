package POO_ProjetoHerois;

public abstract class Nadadores extends Personagens  implements ExibirDadosAquaticos {
    public Nadadores() {
    }
    public Nadadores(String nome, int idade){
        this.classe = "Nadador";
        this.nome = nome;
        this.idade = idade;
        this.vivo = true;
    }

    @Override
    public void classePersonagem() {
        System.out.println("Classe: " + classe);
    }

    @Override
    public abstract void objetoPersonagem();
}
