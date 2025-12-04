package POO_Introdutoria;

public class Galacticos extends Ninja{

    public Galacticos() {}

    public Galacticos(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void categoriaNinja(){
        System.out.println("Esse eh um ninja do tipo GALACTICO");
    }
    @Override
    public void habilidadeEspecial() {
        super.habilidadeEspecial();
        // Podemos usar isso daqui abaixo pra ficar mais explicito, mas representa o mesmo do q esta acima
        // System.out.println("Habilidade especial existe e poderá ser ativida como arma para o " + this.nome);
    }

    @Override
    public void dadosPlayer() {
        super.dadosPlayer();
    }
}
