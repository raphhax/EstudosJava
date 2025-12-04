package POO_ProjetoHerois;

public class Mergulhador extends Nadadores{
    String trajeNatacao;

    public Mergulhador(String nome, int idade, String trajeNatacao){
        super(nome, idade);
        this.trajeNatacao = trajeNatacao;
    }

    @Override
    public void objetoPersonagem() {
        System.out.println("Objeto portado pelo " + this.nome + " eh um " + this.trajeNatacao);
    }
}