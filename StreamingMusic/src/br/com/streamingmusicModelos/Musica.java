package br.com.streamingmusicModelos;

public class Musica extends Audio{

    private int curtidas;

    private int views24h;

    public int getViews24h() {
        return views24h;
    }

    public void setViews24h(int views24h) {
        this.views24h = views24h;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    @Override
    public void exibeAudio() {
        System.out.println("Música: " + getNome());
        System.out.println("Autor: " + getAutor());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Visualizações: " + getVisualizacoes());
    }

    public void top50(){

        if(views24h > 1000){

            System.out.println("Essa música está no TOP50!!!");

        } else{

            System.out.println("Virais da semana!!!");

        }


    }

}
