package POO;

public interface MilitarGalactico {
    /*
    * Basicamente uma interface funciona da seguinte forma: Voce cria um arquvio do tipo interface, dai voce apenas criará métodos lá,
    * como era com virtual publics, dai tinha override etc em C++, ai em java voce vai chamar esses métodos definitivamente e apenas
    * redefinir eles, dando uma funcionalidade adequada para eles, dai sempre que voce chamar esse método de mesmo nome em classes que
    * implementam essa interface, voce vai chamar o mesmo nome porem com funcionalidades diferentes pis ela foi reescreita
     */

    void militar();
    void patrulhamento();
}
