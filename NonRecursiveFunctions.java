public class NonRecursiveFunctions {
    public void functionA(){
        System.out.println("running function A");
        functionB();
    }
    private void functionB(){
        System.out.println("running function A");
        functionC();
    }
    private void functionC(){
        System.out.println("Running function C");
    }
}
