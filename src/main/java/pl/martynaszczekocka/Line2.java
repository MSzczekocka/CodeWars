package pl.martynaszczekocka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Line2 {
    public static String WhoIsNext(String[] names, int n){
        List<String> people = new ArrayList<>();
        Collections.addAll(people, names);

        for (int i =0; i<=n; i++){
            people.add(people.get(i));
            people.add(people.get(i));
        }
        return people.get(n-1);
    }
}