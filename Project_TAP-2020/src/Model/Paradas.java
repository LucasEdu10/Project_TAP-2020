package Model;

import javax.swing.JProgressBar;

public class Paradas {

    private JProgressBar progressbar = null;
    private String situacao = "L"; //L = Livre | O = ocupado
    private int idParadas;
    
    public Paradas(int idParadas, JProgressBar progressbar) {
        this.idParadas = idParadas;
        this.progressbar = progressbar;
    }

    public Paradas() {
    }

    public JProgressBar getProgressbar() {
        return progressbar;
    }

    public void setProgressbar(JProgressBar progressbar) {
        this.progressbar = progressbar;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getIdParadas() {
        return idParadas;
    }

    public void setIdParadas(int idParadas) {
        this.idParadas = idParadas;
    }
    
    
}
