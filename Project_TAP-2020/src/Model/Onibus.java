package Model;

import java.util.Random;

public class Onibus {

	private int idOnibus, capMax, prioridade;
	private String tipo;
	Random gera = new Random();
	Paradas parada;
	
	public static Paradas parada1 = new Paradas(0);  //tive que instanciar para começar com pelo menos uma parada
	//public static Paradas parada2 = new Paradas(1);

	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public int getIdOnibus() {
		return idOnibus;
	}

	public void setIdOnibus(int idOnibus) {
		this.idOnibus = idOnibus;
	}

	public int getCapMax() {
		return capMax;
	}

	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Onibus(String tipo,int idOnibus) {
		this.idOnibus = idOnibus;
		this.tipo = tipo;
	}
	
	public Onibus() {}
		
    public int geraPrioridAleatorio(){
        //int IntPriorid = ThreadLocalRandom.current().nextInt(1, 4);
    	int IntPriorid = gera.nextInt(3);
    	
    	if(IntPriorid == 1) {
    		this.idOnibus = 1;
    		this.prioridade = 1;
            this.tipo = "Pequeno";
            return 1;
    	}else {
    		if(IntPriorid == 2) {
    			this.idOnibus = 2;
    			this.prioridade = 2;
                this.tipo = "Medio";
                return 2;
    		}else {
    			this.idOnibus = 3;
    			this.prioridade = 3;
                this.tipo = "Grande";
                return 3;
    		}
    	}
    	
    	
        /*switch (IntPriorid) {
            case 1: //ONIBUS PEQUENO
                    this.prioridade = 1;
                    this.tipo = "Pequeno";
                    break;
            case 2: //ONIBUS MEDIO
                    this.prioridade = 2;
                    this.tipo = "Medio";
                    break;
            case 3: //ONIBUS GRANDE
                    this.prioridade = 3;
                    this.tipo = "Grande";
                    break;
           default:
                    System.out.println ("O valor da variavel não é nenhum dos anteriores");
        }*/
    }

}
