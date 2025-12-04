package POO_ProjetoHerois;

public class Aquaman extends Nadadores{
    String cajado;

    public Aquaman(String nome, int idade, String cajado){
        super(nome, idade);
        this.cajado = cajado;

    }

    public Aquaman(String nome, int idade, String cajado, DificuldadePersonagem dificuldadePersonagem){
        super(nome, idade, dificuldadePersonagem);
        this.cajado = cajado;
    }

    @Override
    public void objetoPersonagem() {
        System.out.println("Objeto portado pelo " + this.nome + " eh um " + this.cajado);
    }
}