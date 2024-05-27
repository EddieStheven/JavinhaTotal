package Treinamento.Java.Insano.javacore.ONE.Desafio1.Back;

import Treinamento.Java.Insano.javacore.ONE.Desafio1.Back.Comandos;
import org.w3c.dom.ls.LSOutput;

public abstract class Áudio implements Comandos {
    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int curtidas;
    private double classificacao;
    private Service service;



    public void imprime(){
        System.out.println("===========================================");
        System.out.println("     ");
        System.out.println("Suas informações atual: ");
        System.out.println("Você curtiu essa música: " + this.getCurtidas());
        System.out.println("Você reproduziu essa música no total: " + this.getTotalDeReproducao());
        service();
    }

    public void service(){
        if (this.service != null ){
            System.out.println("Você está escutando no: " + service.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public double getClassificacao() {
        return classificacao;
    }
    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }


    @Override
    public void curte() {
        if (getCurtidas() == 0) {
            System.out.println("===========================================");
            System.out.println("Você curtiu essa música :)");
        }
        this.curtidas++;
    }

    @Override
    public void reproduz() {

        if(getTotalDeReproducao() == 0){
            System.out.println("Você reproduziu essa música :)");
        }
        this.totalDeReproducao++;
    }
}
