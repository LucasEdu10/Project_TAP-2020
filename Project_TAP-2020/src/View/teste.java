package View;

import Controller.FuncaoParada;
import Model.Paradas;

public class teste {

    public static void main(String[] args) {
        Paradas b = new Paradas();
        FuncaoParada a = new FuncaoParada();
        FuncaoParada a2 = new FuncaoParada();
        a.addParadas(10, "L");
        a2.addParadas(14, "O");
        
        System.out.println(a.toString());
        System.out.println(a2.toString());
        
    }
}
