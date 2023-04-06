    // TODO: 31.03.2023 Удалить все четные элементы из списка

import java.util.ArrayList;
import java.util.List;

public class task1 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeEvenNumber(strings);
        System.out.println(strings); // [string, my_string]
    }
    
    static void removeEvenNumber(List<String> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
            try {
                Integer numb = Integer.parseInt(numbers.get(i));
                if(numb % 2 == 0){
                    numbers.remove(i);
                }
            }
            catch (NumberFormatException e)
            {

            }


        }
    }
}