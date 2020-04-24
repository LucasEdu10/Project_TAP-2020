package Controller;

import Model.Onibus;

public class ComecaPartidas implements Runnable{
	
	String nome;
	Comeca go = new Comeca();
        Onibus onibus;
	
	public ComecaPartidas(Onibus onibus) { // BOTEI O OBJETO ONIBUS PARA PODER RODAR
		this.onibus = onibus;
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
            go.roda();
	}
}
