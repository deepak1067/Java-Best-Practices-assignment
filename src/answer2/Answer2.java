package answer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Answer2 {

    public static void main(String[] args) {

        List<String> collection = new ArrayList<>(
                Arrays.asList("A", null, "B", null, "C", "", "D"));

        collection = collection.stream()

                .filter(x -> x != null)
                .filter(x -> !x.isEmpty())      // or `Objects::nonNull`
                .collect(Collectors.toList());

        System.out.println(collection);
    }
}