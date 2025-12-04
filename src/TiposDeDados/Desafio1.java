package TiposDeDados;

public class Desafio1 {
    public static void main(String[] args){
        String ninja1_nome = "Naruto", ninja2_nome = "Sakura", ninja3_nome = "Kakashi";
        int ninja1_idade = 20, ninja2_idade = 22, ninja3_idade = 24;
        int missao1 = 1, missao2 = 2, missao3 = 3;
        boolean concluida = false;
        System.out.println("Nome: " + ninja1_nome + "; idade: " + ninja1_idade + "; Missao: " + missao1);
        if(!concluida){
            System.out.println("A Missao ainda nao foi concluida pelo " + ninja1_nome + ".");
        }else{
            System.out.println("MISSAO CONCLUIDA COM SUCESSO!!! ");
        }
    }
}
