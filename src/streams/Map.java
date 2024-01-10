package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args){
        Integer [] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        // List<Integer> doubled = new ArrayList<>();
        //this works but isn't the best way to go about it
        // for(int i = 0; i < listOfIntegers.size(); i++){
        //     Integer result = listOfIntegers.get(i) * 2;
        //     doubled.add(result);
        // }
        //with map we don't have to worry about indexing & off by one errors
        Function<Integer, Integer> timesTwo = (x) -> x * 2;

        List<Integer> doubled = listOfIntegers.stream().map(timesTwo).collect(Collectors.toList());

        System.out.println(doubled);
    }
    
}
