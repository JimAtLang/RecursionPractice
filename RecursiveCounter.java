public class RecursiveCounter {
    // will give a Stack Overflow error as it currently exists
    public void count(int num){
        System.out.println(num);
        count(num+1);
    }
}
