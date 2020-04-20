package Controller;

import Controller.Funcoes;
import Model.Onibus;
import Model.Paradas;

public class ComecaPartidas implements Runnable{
	
	private Funcoes funcao = new Funcoes();
	private Paradas para = new Paradas();
	private Onibus oni = new Onibus();
	String nome;
	Onibus onibus;
	
	public ComecaPartidas(Onibus onibus) { // BOTEI O OBJT ONIBUS PARA PODER RODAR
		this.onibus = onibus;
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println("Onibus partindo...");
		do {
			for(int p = para.getIdParada(); p < funcao.parada.size(); p++) {
				para.setIdParada(p);
				synchronized (para) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					if(para.getIdParada() < 5) { //ELE POR ENQUANTO ESTÁ RODANDO SE BASEANDO AQUI, SE TIVER "<2" VAI RODAR 0 E 1
						if(oni.geraPrioridAleatorio() == 1) {
							funcao.addParada(para); // TODA VEZ QUE PASSA AQUI ADD UMA PARADA NO METODO
							System.out.println("Onibus: "+oni.getTipo()+" Indo para a parada: "+para.getIdParada());
							System.out.println("Onibus: "+oni.getTipo()+" Saindo da parada: "+para.getIdParada());
						}else {
							if(oni.geraPrioridAleatorio() == 2) {
								funcao.addParada(para);// TODA VEZ QUE PASSA AQUI ADD UMA PARADA NO METODO
								System.out.println("Onibus: "+oni.getTipo()+" Indo para a parada: "+para.getIdParada());
								System.out.println("Onibus: "+oni.getTipo()+" Saindo da parada: "+para.getIdParada());
							}
						}
					}
					/*if(oni.geraPrioridAleatorio() == 1) {
						System.out.println("Onibus: "+oni.getTipo()+" Indo para a parada: "+para.getIdParada());
						System.out.println("Onibus: "+oni.getTipo()+" Saindo da parada: "+para.getIdParada());
					}else {
						if(oni.geraPrioridAleatorio() == 2) {
							System.out.println("Onibus: "+oni.getTipo()+" Indo para a parada: "+para.getIdParada());
							System.out.println("Onibus: "+oni.getTipo()+" Saindo da parada: "+para.getIdParada());
						}
					}*/
				}
			}
			
		} while(funcao.parada.size() > 0);
		
	}

}
