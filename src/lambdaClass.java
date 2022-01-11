import java.util.ArrayList;
import java.util.Locale;

public class lambdaClass {
    public static void main(String[] args){
        // pass lambda expression as a method argument

        ArrayList<String> language = new ArrayList<>();
        language.add("java");
        language.add("python");
        language.add("swift");
        language.add("C");
        language.add("C++");
        System.out.println(language);
        language.replaceAll(e->e.toUpperCase());
        System.out.println("Uppercase arrayList: "+ language);
    }

}
