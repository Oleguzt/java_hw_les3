// TODO: 31.03.2023 Удалить строки, которые являются целыми числами}

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class task2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
    
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    
    }
    
    static void removeIntegers(List<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            try {
                Integer.parseInt(string);
                iterator.remove();
            } catch (NumberFormatException e) {
            }
        }
    }
}
  