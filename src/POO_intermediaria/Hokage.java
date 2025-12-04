package POO_intermediaria;


// ESSA EH UMA CLASSE ABSTRATA, E USAMOS PARA DEIXAR MAIS ORGANIZADA PARA AS FILHAS, DAI SÓ CRIAREMOS OBJETOS FILHOS
public abstract class Hokage {

    //ATRIBUTOS
    String nome;
    String aldeia;
    String classe;
    int idade;
    int missoes;
    boolean vivoOuNao;

    //CONSTRUTORES
    public Hokage() {
    }

    public Hokage(String nome) {
        this.nome = nome;
    }

    public Hokage(int idade) {
        this.idade = idade;
    }

    public Hokage(String nome, String aldeia, String classe, int idade, int missoes, boolean vivoOuNao) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.classe = classe;
        this.idade = idade;
        this.missoes = missoes;
        this.vivoOuNao = vivoOuNao;
    }

    //METODOS
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
    }

    //METODO ABSTRATO, E ELA NUNCA PODERA SER INSTANCIADA AQUI, MAS EH OBRIGATORIO A INSTANCIAR NUMA FILHA
    public abstract void sabedoria();
}
