package POO_ProjetoHerois;

public abstract class Militar extends Personagens{
    DificuldadePersonagem dificuldadePersonagem;
    public Militar() {
    }

    public Militar(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Militar(String nome, int idade, DificuldadePersonagem dificuldadePersonagem){
        this(nome, idade);
        this.dificuldadePersonagem = dificuldadePersonagem;
    }

}
