public class Recursion {
    static void countDown(Integer x, Integer end){
        if(x < end){
            System.out.println("Done");
            return;
        }
        System.out.println(x);
        countDown(x - 1, end);
        //no for loop & no mutation
    }

    static void countUp(Integer y){
        if(y > 10){
            System.out.println("Fin");
            return;
        }
        System.out.println(y);
        countUp(y + 1);
    }
    public static void main(String[] args) {
        countDown(10, 0);
        countUp(0);
        
    }
}
