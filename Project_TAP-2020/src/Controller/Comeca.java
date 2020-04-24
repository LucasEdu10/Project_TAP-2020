package Controller;

import Model.Onibus;
import Model.Paradas;

public class Comeca {
    
    Paradas para = new Paradas();
    Onibus oni = new Onibus();
    Funcoes funcao = new Funcoes();
    
    public synchronized void roda(){
        System.out.println("Onibus partindo...");
        do {
            for(int p = para.getIdParada(); p < funcao.parada.size(); p++) {
                para.setIdParada(p);
//                funcao.addParada(para);
               synchronized  (para) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                        }
                        //if(para.getIdParada() < 5) { //ELE POR ENQUANTO ESTÁ RODANDO SE BASEANDO AQUI, SE TIVER "<2" VAI RODAR 0 E 1
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
                        //}
                }
            }

        } while(para.getIdParada() <= 5);
        
    }
    
}
