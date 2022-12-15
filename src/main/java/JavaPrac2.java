import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaPrac2 {
    public static void main(String[] args) {


        List listOne = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");
        List listTwo = Arrays.asList("Jack", "Daniel", "Sam", "Alan", "James", "George");

        List<String> differences = new ArrayList<>(listOne);
        differences.removeAll(listTwo);

        //List<String> newList = new ArrayList<String>(listOne);
        //newList.addAll(listTwo);
        List<String> newList = new ArrayList<String>() { { addAll(listOne); addAll(listTwo); } };

        Object setNames = new HashSet<String>(newList);


        String valami = "";
    }

    private static void mapToString(@NotNull Map<Integer, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            sb.append("\n");
            sb.append("\t")
                    .append("\"")
                    .append(entry.getKey())
                    .append("\"")
                    .append(":")
                    .append("\"")
                    .append(entry.getValue())
                    .append("\"");
        }
        sb.append("\n");
        sb.append("}");
        System.out.println(sb);
    }
}
