package Treinamento.Java.Insano.javacore.DevDojo.ControleRemotoPOO;

public class ControleFuncionando {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto(50,true,true);
        c1.ligar();
        c1.abrirMenu();
    }
}
