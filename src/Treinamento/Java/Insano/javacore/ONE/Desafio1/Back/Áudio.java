package Treinamento.Java.Insano.javacore.ONE.Desafio1.Back;

import Treinamento.Java.Insano.javacore.ONE.Desafio1.Back.Comandos;
import org.w3c.dom.ls.LSOutput;

public abstract class Áudio implements Comandos {
    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int curtidas;
    private double classificacao;

    public void imprime(){
        System.out.println("===========================================");
        System.out.println("     ");
        System.out.println("Suas informações atual: ");
        System.out.println("Você curtiu essa música: " + this.getCurtidas());
        System.out.println("Você reproduziu essa música no total: " + this.getTotalDeReproducao());
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
