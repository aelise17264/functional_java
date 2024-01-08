import java.util.function.Function;

public class ReturningFunctions {

    protected static class MyMath {
        //how to get rid of repetive code
        // public static Integer timesTwo(Integer x){
        //     return x * 2;
        // }
        // public static Integer timesThree(Integer x){
        //     return x * 3;
        // }
        // public static Integer timesFour(Integer x){
        //     return x * 4;
        // }
        public static Function<Integer, Integer> createMultiplier(Integer y){
            return (Integer x) -> x * y;
        }
    }
    public static void main(String[] args){
    // function that returns a function that returns a string
    NoFunction<NoFunction<String>> createGreeting = () -> () -> "Hello functional";
    NoFunction<String> greeting = createGreeting.apply();

    System.out.println(greeting.apply());

    Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
    Function<Integer, Integer> timesThree = MyMath.createMultiplier(3); 
    Function<Integer, Integer> timesFour = MyMath.createMultiplier(4);

    System.out.println(timesTwo.apply(5));
    System.out.println(timesThree.apply(6));
    System.out.println(timesFour.apply(7));

}
}