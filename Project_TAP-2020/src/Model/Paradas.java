package Model;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Paradas {

    private JProgressBar progressbar = null;
    private String situacao = "Livre"; //L = Livre | O = ocupado
    private int idParadas;
    private JLabel descri = null;

    public Paradas(int idParadas, JProgressBar progressbar, JLabel descri) {
        this.idParadas = idParadas;
        this.progressbar = progressbar;
        this.descri = descri;
    }

    public Paradas() {
    }

    public JLabel getDescri() {
        return descri;
    }

    public void setDescri(JLabel descri) {
        this.descri = descri;
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
