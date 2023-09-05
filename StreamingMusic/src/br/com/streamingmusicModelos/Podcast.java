package br.com.streamingmusicModelos;

public class Podcast extends Audio {

    private double avaliacao;

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public void exibeAudio() {
        System.out.println("Podcast: " + getNome());
        System.out.println("Autor: " + getAutor());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Visualizações: " + getVisualizacoes());
    }


    public void exibeAvaliacao(){

        if(getVisualizacoes() > 300){
            System.out.println("Esse podcast está bem avaliado!!!");


        }else{
            System.out.println("Mais podcast da semana!!!");

        }


    }
}
