package hw01.gradle;
import com.google.common.collect.Multiset;
import com.google.common.collect.HashMultiset;
import java.util.Arrays;


public class HelloOtus {

    public static void main(String[] args) {
        String EXAMPLE_TEXT = "Hello Otus";
        Multiset<String> multiset = HashMultiset.create(Arrays.asList(EXAMPLE_TEXT.split(" ")));

        System.out.println(multiset);
    }
}

