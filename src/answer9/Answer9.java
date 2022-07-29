package answer9;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Answer9 {

    public static void main(String[] args) {
        String str = "programming";

        //Converts given string into character array


        Stream.of(str.toLowerCase().split(""))
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey()+e.getValue()+" ")
                .forEach(System.out::print);


        //Displays the character and their corresponding frequency
        System.out.println("Characters and their corresponding frequencies");
        System.out.println(str);
    }
}