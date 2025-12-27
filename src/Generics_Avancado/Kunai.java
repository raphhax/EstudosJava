package Generics_Avancado;

public class Kunai {
    private String name;
    private String classKunai;

    public Kunai() {
    }
    public Kunai(String name) {
        this.name = name;
    }
    public Kunai(String name, String classKunai) {
        this.name = name;
        this.classKunai = classKunai;
    }

    @Override
    public String toString() {
        return "[KUNAI] " + name;
    }
}
