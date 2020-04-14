
package Controller;

public class Roda implements Runnable{

    FuncaoOnibus oni = new FuncaoOnibus();

    public Roda() {
        Thread t = new Thread();
        t.start();
    }
    
    @Override
    public void run() {
        oni.roda();
    }
    
    
    
}
