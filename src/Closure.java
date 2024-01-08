public class Closure {

    public static void main(String[] args){
        NoFunction<NoFunction<String>> createHello = () -> {
            String name = "Fred";
            return () -> "Hello " + name;
        };

        NoFunction<String> greeter = createHello.apply();
        // can access the string variable name within the function above
        //we would not have been able to print this variable outside of its scope
        System.out.println(greeter.apply());
    }
    
}
