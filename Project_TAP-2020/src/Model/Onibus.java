package Model;

import java.awt.Color;
import java.util.Random;

public class Onibus {

    private int idOnibus;
    private Color corProgressBar = null;
    private Color corTextoProgBar = null;
    private Color cor;

  

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

    public Color getCorProgressBar() {
        return corProgressBar;
    }

    public void setCorProgressBar(Color corProgressBar) {
        this.corProgressBar = corProgressBar;
    }

    public Color getCorTextoProgBar() {
        return corTextoProgBar;
    }

    public void setCorTextoProgBar(Color corTextoProgBar) {
        this.corTextoProgBar = corTextoProgBar;
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
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(106, 90, 205); //106, 90, 205;//Barra Roxo

        } else if (idOnibus == 1) {
            this.idOnibus = 2;
            this.cor = new Color(255, 0, 204);
            this.corProgressBar = new Color(255, 255, 255);
            this.corTextoProgBar = new Color(106, 90, 205); //106, 90, 205; //Barra Azul

        } else if (idOnibus == 2) {
            this.idOnibus = 3;
            this.cor = new Color(51, 255, 0);
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(0, 191, 255); //(0, 191, 255); //Barra Azul claro

        } else if (idOnibus == 3) {
            this.idOnibus = 4;
            this.cor = new Color(28, 28, 28);
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(0, 255, 127); //(0, 255, 127); //Barra verde limão

        } else if (idOnibus == 4) {
            this.idOnibus = 5;
            this.cor = new Color(0, 0, 255);
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(0, 100, 0); //(0, 100, 0); //Barra verde escuro

        } else if (idOnibus == 5) {
            this.idOnibus = 6;
            this.cor = new Color(0, 0, 255);
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(218, 165, 32); //(218, 165, 32); //Barra ouro

        } else if (idOnibus == 6) {
            this.idOnibus = 7;
            this.cor = new Color(0, 0, 255);
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(210, 105, 30); //(210, 105, 30); //Barra laranja

        } else if (idOnibus == 7) {
            this.idOnibus = 8;
            this.cor = new Color(0, 0, 255);
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(255, 0, 255); //(255, 0, 255); //Barra rosa

        } else if (idOnibus == 8) {
            this.idOnibus = 9;
            this.cor = new Color(0, 0, 255);
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(178, 34, 34); //(178, 34, 34); //Barra vermelho

        } else if (idOnibus == 9) {
            this.idOnibus = 10;
            this.cor = new Color(0, 0, 255);
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(255, 255, 0); //(255, 255, 0); //Barra amarelo

        } else if (idOnibus == 10) {
            this.idOnibus = 11;
            this.cor = new Color(0, 0, 255);
            this.corProgressBar = new Color(255, 255, 255);
            this.corTextoProgBar = new Color(255, 228, 225); //(255, 228, 225); //Barra rosé

        } else if (idOnibus == 11) {
            this.idOnibus = 12;
            this.cor = new Color(0, 0, 255);
            this.corProgressBar = new Color(255, 255, 255); 
            this.corTextoProgBar = new Color(0, 0, 0); //(0, 0, 0); //Barra preto

        }

    }
}
