import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Array {
        public static void main(String[] args) {
            
            Integer[] list1 = new Integer[]{1,2,3,4,5,6,7,8,8};
            Integer[] list2 = new Integer[]{7,8,9,10,11,12,13};

            Set<Integer> results = new LinkedHashSet<>();

            for (int i = 0; i < list1.length; i++) {
                for (int j = 0; j < list2.length; j++) {
                    if (list1[i].equals(list2[j])) {
                        results.add(list1[i]);
                    }
                }
            }

            System.out.println(results);

        }
}
