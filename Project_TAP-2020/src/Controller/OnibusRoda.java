package Controller;

import Model.Onibus;
import Model.Paradas;
import java.util.ArrayList;

public class OnibusRoda extends Thread{

    private Onibus progresso;    
    private int idOnibus;
    private Paradas paradaLivre = null;
    private Thread thread;
    private Onibus onibus;
    
    public OnibusRoda(int idOnibus, Onibus onibus) {
        this.idOnibus = idOnibus;
        this.onibus = onibus;
        thread = new Thread();
    }    
    

    @Override
    public void run() {
        while (true) {
           
            paradaLivre = SincMetodos.getParadaDisponivel(paradaLivre);
            
            if (paradaLivre  != null) {
               
               //pegar um tempo com random de 1 a 10 e multiplicar por 10
               int tempo  = 2000;
               try {
                    
                    paradaLivre.getProgressbar().setMinimum(0);
                    paradaLivre.getProgressbar().setMaximum(tempo);   
                    paradaLivre.getProgressbar().setForeground(onibus.getCorForeground());
                    paradaLivre.getProgressbar().setBackground(onibus.getCorBackground());
                    //paraLivre.getProgressbar().setString(cli.getDesc_prior()+" iniciando atendimento");*/

                    for(int x = 1; x <= tempo; x++){
                        synchronized(this){
                            while(SincMetodos.PAUSAR){
                                wait();
                            }
                        } 

                        paradaLivre.getProgressbar().setValue(x);
                        thread.sleep(1);                                                    
                    }                     
                    
                    SincMetodos.LiberaProgress(paradaLivre);                                                
                    
                }catch (Exception e) {
                }
            }
        }
    }

}
