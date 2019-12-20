package Collections;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
        // init set object
        Set<String> set = new HashSet<String>();
        set.add("Java");
        set.add("C++");
        set.add("Java");
        set.add("PHP");
        // show set
        for (String str : set) {
            System.out.println(str);
        }
    }
}
