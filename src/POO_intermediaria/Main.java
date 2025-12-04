package POO_intermediaria;

public class Main {
    public static void main(String[] args){
        /*
        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashi";
        Hashirama.exibirDados();
        Hashirama.sabedoria();
         */

        // OBJ kakashi
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.aldeia = "hatakudos";
        kakashi.idade = 20;
        kakashi.sharinganAtivado();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Uchihados";
        sasuke.idade = 19;
        sasuke.sharinganAtivado();
    }
}
