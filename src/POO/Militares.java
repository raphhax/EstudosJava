package POO;

public class Militares extends Ninja {

    public Militares(String nome){
        this.nome = nome;
    }
    public Militares(int idade){
        this.idade = idade;
    }
    public Militares(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void militarismo(){
        System.out.println("Esse eh um ninja do tipo MILITAR");
    }
    @Override
    public void habilidadeEspecial(){
        System.out.println("Habilidade especial existe e poderá ser ativida como arma para o " + this.nome);
    }
    @Override
    public void dadosPlayer() {
        super.dadosPlayer();
    }
}
