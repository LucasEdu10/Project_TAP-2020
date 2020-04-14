
package Controller;

import Model.Onibus;
import java.util.ArrayList;

public class FuncaoOnibus {
    
    ArrayList<Onibus> parada = new ArrayList<Onibus>();
    Onibus o = new Onibus();

    public FuncaoOnibus() {
    }

    public void addParadas(int t, String s) {
        o.setIdOnibus(t);
        o.setStituacao(s);

        parada.add(o);
    }

    @Override
    public String toString() {
        return "Parada=" + o.getIdOnibus()+ " Situação=" + o.getStituacao();
    }

    public synchronized void roda(){
        for(int i = 0; i < parada.size(); i++){
            try {
                Thread.sleep(100);
            }catch(Exception e){
                System.out.println("Interrompida");
            }
            System.out.println("RODANDO");
        }
    }
}
