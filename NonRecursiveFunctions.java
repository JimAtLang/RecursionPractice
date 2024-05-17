public class NonRecursiveFunctions {
    public void FunctionA(){
        System.out.println("running function A");
        functionB();
    }
    private void functionB(){
        System.out.println("running function B");
        functionC();
    }
    private void functionC(){
        System.out.println("Running function C");
        int x = 1/0;
    }
}
