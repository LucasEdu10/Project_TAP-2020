package Controller;

import Model.Onibus;
import Model.Paradas;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SincMetodos {

    private Color cor = null;
    public static boolean paradinha = false;
    public static int controlNucleos = 0;
    public static Paradas[] listaParadas = null;
    public static OnibusRoda[] listaOnibus = null;
    public static int totalOnibus;
    public static int totalParadas;

    public static void criaThreadOnibus() {
        if (listaOnibus == null) {
            listaOnibus = new OnibusRoda[SincMetodos.controlNucleos]; //determinado a quantidade de onibus

            for (int i = 0; i < SincMetodos.controlNucleos; i++) {
                totalOnibus++;
                listaOnibus[i] = new OnibusRoda(i, new Onibus(i));
            }
            for (Thread ListaThread1 : SincMetodos.listaOnibus) {
                ListaThread1.start();
            }
        }
    }

    public static synchronized void ZerarBarra(Paradas parada) {
        parada.getProgressbar().setMinimum(0);
        parada.getProgressbar().setValue(0);
        parada.getProgressbar().setString("Parada " + parada.getIdParadas());
        parada.setSituacao("Livre");
        totalParadas++;
        parada.getDescri().setText("Livre");
    }

    public static synchronized Paradas getParadaDisponivel(Paradas parada) {
        for (int i = 0; i < listaParadas.length; i++) {
            if (parada == null) {
                if (listaParadas[i].getSituacao().equals("Livre")) {
                    listaParadas[i].getDescri().setText("Ocupada");
                    listaParadas[i].setSituacao("Ocupada");
                    return listaParadas[i];
                }
            } else if (parada.getIdParadas() <= i) {
                if (listaParadas[i].getSituacao().equals("Livre")) {
                    listaParadas[i].setSituacao("Ocupada");
                    listaParadas[i].getDescri().setText("Ocupada");
                    parada.setSituacao("Livre");
                    parada.getDescri().setText("Livre");
                    return listaParadas[i];
                }
            }
        }
        return null;
    }
}
