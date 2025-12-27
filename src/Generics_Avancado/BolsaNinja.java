package Generics_Avancado;

import Generics.BolsaGenerica;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    private List<T> ferramentas;

    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }
    public BolsaNinja(List<T> ferramentas) {
        this.ferramentas = ferramentas;
    }

    public void addFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    public void mostrarFerramenta(){
        for(T ferramenta : ferramentas){
            System.out.print(ferramenta + " | ");
        }
    }
}
