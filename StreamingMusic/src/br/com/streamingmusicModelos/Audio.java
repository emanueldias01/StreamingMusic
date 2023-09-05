package br.com.streamingmusicModelos;

public class Audio {
    private String nome;

    private String autor;

    private double duracao;

    private int visualizacoes;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }


    public void exibeAudio() {

        System.out.println("audio: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Duração: " + duracao);
        System.out.println("Visualizações: " + visualizacoes);


    }

    public void play(){

        this.visualizacoes++;


    }


}
