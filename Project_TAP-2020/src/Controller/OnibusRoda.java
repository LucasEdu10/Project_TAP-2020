package Controller;

import Model.Onibus;
import Model.Paradas;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class OnibusRoda extends Thread {

    private Onibus progresso;
    private int idOnibus;
    private Paradas paradaLivre = null, paraSituacao;
    private SituParadas paraSitu = null;
    private Thread thread;
    private Onibus onibus;
    private Random gera = new Random();
    private int tempo;
    private SincMetodos teste = new SincMetodos();

    public OnibusRoda(int idOnibus, Onibus onibus) {
        this.idOnibus = idOnibus;
        this.onibus = onibus;
        thread = new Thread();
    }

    @Override
    public void run() {
        while (true) {
            paradaLivre = SincMetodos.getParadaDisponivel(paradaLivre);
            
            if (paradaLivre != null) {
                //imprime sequência de 10 números inteiros aleatórios entre 0 e 25               
                    
                tempo = ThreadLocalRandom.current().nextInt(1, 6);
                tempo = tempo * 1000;
                
                //pegar um tempo com random de 1 a 10 e multiplicar por 10
                
                try {
                    paradaLivre.getProgressbar().setMinimum(0);
                    paradaLivre.getProgressbar().setMaximum(tempo);
                    paradaLivre.getProgressbar().setForeground(onibus.getCorForeground());
                    paradaLivre.getProgressbar().setBackground(onibus.getCorBackground());
                    //paradaLivre.getProgressbar().setString("Onibus "+onibus.getIdOnibus()+" na parada... "+paradaLivre.getIdParadas());
                    paradaLivre.getProgressbar().setString("Onibus " + onibus.getIdOnibus() + " aguardando embarque");

                    for (int x = 1; x <= tempo; x++) {
                        synchronized (this) {
                            while (SincMetodos.PAUSAR) {
                                wait();
                            }
                        }

                        paradaLivre.getProgressbar().setValue(x);
                        thread.sleep(1);
                    }

                    SincMetodos.LiberaProgress(paradaLivre);

                } catch (Exception e) {
                }
            }
        }
    }

}
