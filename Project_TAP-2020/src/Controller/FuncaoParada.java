package Controller;

import Model.Paradas;
import java.util.ArrayList;

public class FuncaoParada {

    ArrayList<Paradas> parada = new ArrayList<Paradas>();
    Paradas p = new Paradas();

    public FuncaoParada() {
    }

    public void addParadas(int t, String s) {
        p.setIdParada(t);
        p.setSituacao(s);

        parada.add(p);
    }

    @Override
    public String toString() {
        return "Parada=" + p.getIdParada() + " Situação=" + p.getSituacao();
    }

}
