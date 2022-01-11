import java.util.*;

public class StringClass {
    public static void main(String[] args){
        List<Integer> listIn = new LinkedList<>();
        listIn.add(23);
        listIn.add(56);
        listIn.add(78);
        listIn.add(72);
        listIn.add(54);

        //Join Two Lists
        List<Integer> listOut = new LinkedList<>();
        listOut.addAll(listIn);
        System.out.println(listOut.addAll(listIn));
        Map<Integer, String> mapStrIn = new HashMap<>();
        mapStrIn.put(1,"One");
        mapStrIn.put(2,"two");
        mapStrIn.put(3,"three");
        mapStrIn.put(4,"four");
        System.out.println("Map: "+mapStrIn);

        List<Integer> listKey = new LinkedList<>(mapStrIn.keySet());
        System.out.println("key sets are: "+listKey);

        List<String> listValue = new LinkedList<>(mapStrIn.values());
        System.out.println("value sets are: "+listValue);

    }
}
