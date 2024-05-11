package Treinamento.Java.Insano.javacore.ONE.ScreenMatch;

public class Start {
    public static void main(String[] args) {
        //Objetos ( ScreenMatch ) instanciados
        ScreenMatch Filme = new ScreenMatch("Shrek", "Andrew Adamson", 2001, 10.0F, true);
        ScreenMatch Filme1 = new ScreenMatch("Kung Fu Panda", "Mark Osborne", 2008, 10.0F, false);

        // Objeto ( Transmissão ) instanciados
        Transmissao t1 = new Transmissao("Netflix");
        Transmissao t2 = new Transmissao("Amazon Play");
        System.out.println("dodod");
        // Associando a classe ScreenMatch e a classe Transmissão
        Filme.setTransmissao(t1);
        Filme1.setTransmissao(t2);

        // Imprimindo as informações
        Filme.imprimirInfor();
        Filme1.imprimirInfor();


    }
}
