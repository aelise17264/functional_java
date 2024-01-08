import java.util.function.Function;
import java.util.function.BiFunction;



public class FunctionalInterface {
    
    public static void main(String[] args){
        // if x is less than 0 return negative x otherwise return x
        //function interface with lambda expression
        Function<Integer, Integer> absoluteValue = (x) -> x < 0 ? -x : x;

        System.out.println(absoluteValue.apply(-100));

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(32, 23));

        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
        System.out.println(addThree.apply(5, 6, 7));

        NoFunction<String> sayHello = () -> "Hello there";
        System.out.println(sayHello.apply());
    }
    
}
