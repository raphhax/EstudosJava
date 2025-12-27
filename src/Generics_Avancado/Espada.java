package Generics_Avancado;

public class Espada {
    private String name;
    private String lamina;

    public Espada() {
    }

    public Espada(String name) {
        this.name = name;
    }

    public Espada(String name, String lamina) {
        this.name = name;
        this.lamina = lamina;
    }

    @Override
    public String toString() {
        return "[SWORD] " + name;
    }
}
