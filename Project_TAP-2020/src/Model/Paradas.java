package Model;

public class Paradas {

    private int idParada, total = 0;
    private String situacao = "L"; //L = Livre | O = ocupado

    public Paradas(int idParada) {
        this.idParada = idParada;
    }

    public Paradas() {
    }

    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
