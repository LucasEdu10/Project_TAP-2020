package Controller;

import java.util.ArrayList;

import Model.Onibus;
import Model.Paradas;

public class SincMetodos {

    Onibus oni = new Onibus();
    Paradas para = new Paradas();

    public static boolean PAUSAR = false;    
    public static int QTD_NUCLEOS = 0;
    public static Paradas[] listaParadas = null;
    public static OnibusRoda[] listaOnibus = null;
    public static ArrayList<Paradas> parada = new ArrayList<Paradas>();
    public static ArrayList<Onibus> onibus = new ArrayList<Onibus>();

    public static void criaThreadOnibus() {
        if (listaOnibus == null) {
            listaOnibus = new OnibusRoda[SincMetodos.QTD_NUCLEOS]; //determinado a quantidade de onibus

            for (int i = 0; i < SincMetodos.QTD_NUCLEOS; i++) {
                listaOnibus[i] = new OnibusRoda(i, new Onibus(i));
            }

            for (Thread ListaThread1 : SincMetodos.listaOnibus) {
                ListaThread1.start();
            }
        }

    }
    
    public static synchronized void LiberaProgress(Paradas parada){        
        parada.getProgressbar().setMinimum(0);
        parada.getProgressbar().setValue(0);
        parada.getProgressbar().setString("Progress Disponível 0%");
        /*parada.getProgressbar().setForeground(new Color(0,120,215));
        parada.getProgressbar().setBackground(new Color(240,240,240));*/
        parada.setSituacao("L");
    }  
    

    public static synchronized Paradas getParadaDisponivel(Paradas parada) {
        for (int i = 0; i < listaParadas.length; i++) {
            if (parada == null) {
                if (listaParadas[i].getSituacao().equals("L")) {
                    listaParadas[i].setSituacao("O");                    
                    return listaParadas[i];
                }
            } else if (parada.getIdParadas() <= i) {
                if (listaParadas[i].getSituacao().equals("L")) {
                    listaParadas[i].setSituacao("O");
                    parada.setSituacao("L");
                    return listaParadas[i];
                }
            }
        }

        return null;
    }

}
