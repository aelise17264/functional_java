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

    static int fibonacci(int x){
        if(x <= 2){
            return 1;
        }

        return fibonacci( x - 1) + fibonacci(x - 2);
        
    }
    public static void main(String[] args) {
        // countDown(10, 0);
        // countUp(0);
        System.out.println("The 5th fibonacci number is: " + fibonacci(5));
        System.out.println("The 10th fibonacci number is: " + fibonacci(10));
        System.out.println("The 17th fibonacci number is: " + fibonacci(17));

    }
}
