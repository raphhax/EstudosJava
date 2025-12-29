package LinkedList_Challenge;

public class Ninja {
    private String nome;
    private int idade;
    private Aldeia aldeia;
    public Ninja() {
    }

    public Ninja(String nome, int idade, Aldeia aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia.nomeAldeia();
    }

    public void setAldeia(Aldeia aldeia) {
        this.aldeia = aldeia;
    }

    @Override
    public String toString() {
        return "NINJA: " + nome + " || IDADE: " + idade + aldeia.toString();
    }
}
