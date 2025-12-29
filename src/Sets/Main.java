package Sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    /*

    HASHSET = NAO APARECER DUPLICADOS E A ORDEM É ALEATORIA SEM NUMERACAO NEM NADA
    TREESET = NAO APARECER DUPLICADOS E ESTAR COM UMA ORDEM LOGICA(ALFABETICA, NUMERAL, ETC)
    LINKEDHASHSET = NAO APARECE DUPLICADOS E DEIXA NA ORDEM DE IMPLEMENTACAO

     */

    public static void main(String[] args){
        Set<String> ninjas = new HashSet<>();
        ninjas.add("Juju Psita");
        ninjas.add("Naruto");
        ninjas.add("Fofao");
        String alvoRemover = "Fofao";
        System.out.println("HashSet completo: " + ninjas);
        if(ninjas.remove(alvoRemover)){
            System.out.println("Removendo: " + alvoRemover + " com SUCESSO.");
        }else{
            System.out.println("!!! NINJA " + alvoRemover + " NAO FOI REMOVIDO !!!");
        }
        System.out.println("HashSet completo: " + ninjas);

    }
}
