import br.com.streamingmusicModelos.Musica;
import br.com.streamingmusicModelos.Podcast;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {


        //musicas

        Musica musica1 = new Musica();

        musica1.setNome("Payphone");
        musica1.setAutor("Maroon 5");
        musica1.setDuracao(3.51);
        musica1.setVisualizacoes(3456789);
        musica1.setCurtidas(500);
        musica1.setViews24h(870);

        Musica musica2 = new Musica();

        musica2.setNome("Rockstar");
        musica2.setAutor("Post Malone");
        musica2.setDuracao(3.38);
        musica2.setVisualizacoes(88893);
        musica2.setCurtidas(350);
        musica2.setViews24h(830);

        Musica musica3 = new Musica();

        musica3.setNome("The Hills");
        musica3.setAutor("The Weeknd");
        musica3.setDuracao(4.02);
        musica3.setVisualizacoes(993723);
        musica3.setCurtidas(600);
        musica3.setViews24h(1050);


        //podcasts

        Podcast podcast1 = new Podcast();

        podcast1.setNome("Hipsters Ponto Tech");
        podcast1.setAutor("Alura");
        podcast1.setDuracao(43.30);
        podcast1.setVisualizacoes(470);


        Podcast podcast2 = new Podcast();

        podcast2.setNome("IronBerg");
        podcast2.setAutor("Renato Cariani");
        podcast2.setDuracao(57.32);
        podcast2.setVisualizacoes(530);

        Podcast podcast3 = new Podcast();

        podcast3.setNome("G1");
        podcast3.setAutor("GLOBO");
        podcast3.setDuracao(32.58);
        podcast3.setVisualizacoes(270);





        Scanner respostaUsuario = new Scanner(System.in);
        System.out.println("o que gostaria de ouvir: ");
        System.out.println("Músicas: 1       Podcasts: 2        Sair: 3");
        int leitura = respostaUsuario.nextInt();

        while (leitura != 3) {
            int leituMusic = 0;
            if (leitura == 1) {
                System.out.println("Escolha a música que quer ouvir");
                System.out.println(1);
                musica1.exibeAudio();
                System.out.println(2);
                musica2.exibeAudio();
                System.out.println(3);
                musica3.exibeAudio();
                System.out.println("Sair da aba de músicas:");
                System.out.println(4);

                Scanner musicUsu = new Scanner(System.in);
                leituMusic = musicUsu.nextInt();
            }
            if (leituMusic == 1) {
                musica1.play();
                System.out.println("ouvindo Payphone...");

            } else if (leituMusic == 2) {
                musica2.play();
                System.out.println("ouvindo Rockstar...");



            } else if (leituMusic == 3) {
                musica3.play();
                System.out.println("ouvindo The Hills...");


            } else if (leituMusic == 4 ) {
                respostaUsuario = new Scanner(System.in);
                System.out.println("o que gostaria de ouvir: ");
                System.out.println("Músicas: 1       Podcasts: 2        Sair: 3");
                leitura = respostaUsuario.nextInt();

            }

            if(leitura == 2){
                System.out.println("qual podcast gostaria de ouvir: ");
                System.out.println(1);
                podcast1.exibeAudio();
                System.out.println(2);
                podcast2.exibeAudio();
                System.out.println(3);
                podcast3.exibeAudio();
                System.out.println("Sair da aba de podcasts: ");
                System.out.println(4);

                Scanner respostaPod = new Scanner(System.in);
                int leituPod = respostaPod.nextInt();

                if (leituPod == 1){
                    System.out.println("Ouvindo Hipsters...");




                } else if (leituPod == 2) {
                    System.out.println("Ouvindo IronBerg...");


                } else if (leituPod == 3) {

                    System.out.println("Ouvindo G1...");

                } else if (leituPod == 4) {
                    respostaUsuario = new Scanner(System.in);
                    System.out.println("o que gostaria de ouvir: ");
                    System.out.println("Músicas: 1       Podcasts: 2        Sair: 3");
                    leitura = respostaUsuario.nextInt();
                }


            }
        }

        }


    }













