package Model;

import java.awt.Color;
import java.util.Random;

public class Onibus {

    private int idOnibus, capMax, prioridade;
    private Color corBackground = null;
    private Color corForeground = null;
    private Color cor = null;

    Random gera = new Random();

    public Onibus(int idOnibus) {
        this.idOnibus = idOnibus;
        gerarCores();
    }

    public Onibus() {
    }

    public Color getCorBackground() {
        return corBackground;
    }

    public void setCorBackground(Color corBackground) {
        this.corBackground = corBackground;
    }

    public Color getCorForeground() {
        return corForeground;
    }

    public void setCorForeground(Color corForeground) {
        this.corForeground = corForeground;
    }

    public int getIdOnibus() {
        return idOnibus;
    }

    public void setIdOnibus(int idOnibus) {
        this.idOnibus = idOnibus;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    private void gerarCores() {
        //int IntPriorid = gera.nextInt(3);

        if (idOnibus == 1) {
            this.cor = new Color(255, 0, 0);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(255, 0, 0); //255,0,0);//Barra Vermelho
           
        } else if (idOnibus == 2) {
            this.cor = new Color(255, 0, 204);
            this.corBackground = new Color(255, 255, 255);//Fonte Branca
            this.corForeground = new Color(255, 0, 204); //153,102,0); //Barra Marrom
            
        } else if (idOnibus == 3) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(51,255,0); //51,255,0); //Barra Azul
            
        } else if (idOnibus == 4) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(28,28,28); //51,255,0); //Barra preto
            
        } else if (idOnibus == 5) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(131,111,255); //51,255,0); //Barra Azul
            
        } else if (idOnibus == 6) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(0,0,205); //51,255,0); //Barra Azul
            
        } else if (idOnibus == 7) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(0,191,255); //51,255,0); //Barra Azul
            
        } else if (idOnibus == 8) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(112,128,144); //51,255,0); //Barra Azul
            
        } else if (idOnibus == 9) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(0,206,209); //51,255,0); //Barra Azul
            
        } else if (idOnibus == 10) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(0,139,139); //51,255,0); //Barra Azul
            
        } else if (idOnibus == 11) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(0,250,154); //51,255,0); //Barra Azul
            
        } else if (idOnibus == 12) {
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(124,252,0); //51,255,0); //Barra Azul
            
        }

    }
}
