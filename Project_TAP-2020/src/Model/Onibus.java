package Model;

import java.awt.Color;
import java.util.Random;

public class Onibus {

    private int idOnibus, prioridade;
    private Color corBackground = null;
    private Color corForeground = null;
    private Color cor;
    private Paradas situacao;

    Random gera = new Random();

    public Onibus(int idOnibus) {
        this.idOnibus = idOnibus;
        gerarCores();
    }

    public Onibus() {
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Color getCor() {
        return cor;
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

    private void gerarCores() {
        if (idOnibus == 0) {
            this.idOnibus = 1;
            this.cor = new Color(255, 0, 0);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(106, 90, 205); //255,0,0);//Barra Roxo

        } else if (idOnibus == 1) {
            this.idOnibus = 2;
            this.cor = new Color(255, 0, 204);
            this.corBackground = new Color(255, 255, 255);//Fonte Branca
            this.corForeground = new Color(106, 90, 205); //153,102,0); //Barra Azul

        } else if (idOnibus == 4) {
            this.idOnibus = 3;
            this.cor = new Color(51, 255, 0);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(0, 191, 255); //51,255,0); //Barra Azul claro

        } else if (idOnibus == 5) {
            this.idOnibus = 4;
            this.cor = new Color(28, 28, 28);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(0, 255, 127); //51,255,0); //Barra verde limão

        } else if (idOnibus == 6) {
            this.idOnibus = 5;
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(0, 100, 0); //51,255,0); //Barra verde escuro

        } else if (idOnibus == 7) {
            this.idOnibus = 6;
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(218, 165, 32); //51,255,0); //Barra ouro

        } else if (idOnibus == 8) {
            this.idOnibus = 7;
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(210, 105, 30); //51,255,0); //Barra laranja

        } else if (idOnibus == 9) {
            this.idOnibus = 8;
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(255, 0, 255); //51,255,0); //Barra rosa

        } else if (idOnibus == 10) {
            this.idOnibus = 9;
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(178, 34, 34); //51,255,0); //Barra vermelho

        } else if (idOnibus == 11) {
            this.idOnibus = 10;
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(255, 255, 0); //51,255,0); //Barra amarelo

        } else if (idOnibus == 12) {
            this.idOnibus = 11;
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(255, 228, 225); //51,255,0); //Barra rosé

        } else if (idOnibus == 13) {
            this.idOnibus = 12;
            this.cor = new Color(0, 0, 255);
            this.corBackground = new Color(255, 255, 255); //Fonte Branca
            this.corForeground = new Color(0, 0, 0); //51,255,0); //Barra preto

        }

    }
}
