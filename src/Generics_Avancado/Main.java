package Generics_Avancado;

public class Main {
    public static void main(String[] args){
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.addFerramenta(new Kunai("Kunai de fogo", "B+"));
        bolsaNinja.addFerramenta(new Kunai("Kunai de agua", "A+"));
        bolsaNinja.addFerramenta(new Espada("Espada Ninja Suprema", "High Power"));
        System.out.println("Ferramentas da BOLSA NINJA: ");
        bolsaNinja.mostrarFerramenta();
    }
}
