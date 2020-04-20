package Controller;

import java.util.ArrayList;

import Model.Onibus;
import Model.Paradas;

public class Funcoes {
	
	Onibus oni = new Onibus();
	Paradas para = new Paradas();
	
	public  static Paradas[] listaParadas = null;
	public  static ArrayList<Paradas> parada = new ArrayList<Paradas>();
	public  static ArrayList<Onibus> onibus = new ArrayList<Onibus>();
	
	public void addParada(Paradas p) {
		parada.add(p);
	}
	
	public int paradaDisp(Paradas[] paradas) {
		for(int i = 0; i < parada.size(); i++) {
			if(para.getTotal() == oni.getIdOnibus()) {
				return paradas[i].getIdParada();
			}
		}
		return (Integer) null;
	}
	
	public Paradas proxParada(Paradas pAtual) {
		return this.parada.get(pAtual.getIdParada() + 1);
	}
	
	public Onibus proxOnibus() {
		Onibus proxOni = null;
		try {
			for(int i =0; i < parada.size(); i++) {
				
			}
		}catch (Exception e) {
			
		}
		return proxOni;
	}

}
