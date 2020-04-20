package View;

import Controller.ComecaPartidas;
import Controller.Funcoes;
import Model.Onibus;
import Model.Paradas;

public class teste {

    public static void main(String[] args) {
        
    	Funcoes func = new Funcoes();
		Onibus b1 = new Onibus();
		Paradas parada = new Paradas();
		
		func.addParada(Onibus.parada1);
		//func.addParada(Onibus.parada2);
		
		ComecaPartidas go = new ComecaPartidas(b1);
        
        
    }
}
