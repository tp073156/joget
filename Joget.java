package joget;
import java.util.*;
import java.util.stream.Collectors;

public class Joget {
    public static void main(String[] args) {
        List<String> arrayA = new ArrayList<>(Arrays.asList("Honda", "Toyota", "Proton"));
        arrayA.add("Nissan");
        System.out.println("After adding Nissan: " + arrayA);

        arrayA.add(0, "Mazda");
        System.out.println("After adding Mazda at first: " + arrayA);

        List<String> arrayB = Arrays.asList("Cat", "Dog", "Elephant");
        arrayA.addAll(arrayB);
        System.out.println("After combining with arrayB: " + arrayA);

        Map<String, String> mapC = new HashMap<>();
        mapC.put("123", "Justin");
        mapC.put("456", "Owen");
        mapC.put("789", "Hugo");

        Map<String, String> mapD = new HashMap<>();
        mapD.put("123", "George");
        mapD.put("555", "Jack");
        mapD.put("888", "Julian");

        mapC.putAll(mapD);
        System.out.println("After combining mapC and mapD: " + mapC);

        System.out.println("Reason Justin is no longer in mapC: mapD had the same key '123' and overwrote the value with 'George'");

        System.out.print("Entries where key contains '5': ");
        mapC.entrySet().stream()
            .filter(e -> e.getKey().contains("5"))
            .forEach(e -> System.out.print(e + " "));
        System.out.println();

        mapC.entrySet().removeIf(e -> e.getValue().toLowerCase().contains("o"));
        System.out.println("After removing values containing 'o': " + mapC);

        String str = "111222888222555";
        str = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed str: " + str);

        int lastIndex = str.lastIndexOf("222");
        if (lastIndex != -1) {
            str = str.substring(0, lastIndex) + "aaa" + str.substring(lastIndex + 3);
        }
        System.out.println("After replacing last '222' with 'aaa': " + str);
    }
}
