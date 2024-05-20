public class Main {
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        NonRecursiveFunctions nrf = new NonRecursiveFunctions();
        //nrf.functionA();
        RecursiveCounter rc = new RecursiveCounter();
        rc.count(0);
    }
}
