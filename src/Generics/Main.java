package Generics;

public class Main {
    public static void main(String[] args){
        EquipamentosNinja Kunai_Vento = new EquipamentosNinja("Kunai do vento");
        EquipamentosNinja Kunai_Fogo = new EquipamentosNinja("Kunai das labaredas de fogo");
        EquipamentosNinja Bolas_Hidrogenio = new EquipamentosNinja("Bolas de Hidrogenio");
        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addEquipamento(Kunai_Fogo);
        bolsaGenerica.addEquipamento(Kunai_Vento);
        bolsaGenerica.addEquipamento(Bolas_Hidrogenio);
        System.out.println(bolsaGenerica);
    }
}