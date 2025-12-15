package POO_ProjetoHerois;

public abstract class Nadadores extends Personagens implements ExibirDadosAquaticos {
    DificuldadePersonagem dificuldadePersonagem;

    public Nadadores() {
    }

    public Nadadores(String nome, int idade){
        this.classe = "Nadador";
        this.nome = nome;
        this.idade = idade;
        this.vivo = true;
    }

    public Nadadores(String nome, int idade, DificuldadePersonagem dificuldadePersonagem){
        this(nome, idade); // sobrecarregando construtor anterior, mas agora tendo novos argumetnos extras
        this.dificuldadePersonagem = dificuldadePersonagem;
    }

    @Override
    public void classePersonagem() {
        System.out.println("Classe: " + classe);
    }
    @Override
    public abstract void objetoPersonagem();

    public void inteligenciaCombate(){
        System.out.println("Consigo dar golpes básicos!");
    }
    //sobrecarregando méto_do anterior

    public void inteligenciaCombate(int qi){
        if(qi >= 50 && qi < 100){
            System.out.println("Consigo dar golpes médios!");
        }else if(qi >= 100){
            System.out.println("Consigo dar golpes fortes!");
        }else{
            System.out.println("Consigo dar golpes básicos!");
        }
    }
}
