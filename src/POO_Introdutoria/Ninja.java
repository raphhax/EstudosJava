package POO_Introdutoria;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public void SuperPoderAtivado(){
        System.out.println("O super poder do ninja " + this.nome +  " foi ativado!");
    }

    public String souGuerreiro(boolean possuo) {
        if (possuo) {
            return "Eh ninja guerreiro";
        } else {
            return "Nao eh ninja guerreiro";
        }
    }

    public void habilidadeEspecial(){
        System.out.println("Habilidade especial existe e poderá ser ativida para o " + this.nome);
    }
    public void dadosPlayer(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Aldeia: " + this.aldeia);
    }
}
