package POO;

public class StarWars extends Galacticos implements MilitarGalactico{
    public void patrulhamento(){
        System.out.println("ESTA EM PATRULHA");
    }
    public void militar(){
        System.out.println("Eh um soldado espacial");
    }
}
