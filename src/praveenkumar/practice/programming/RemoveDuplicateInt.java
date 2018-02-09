package praveenkumar.practice.programming;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateInt {


    public static void main(String[] args) {

        int value[] = {1,2,3,4,3,2,1,6,7,8,9};
        RemoveDuplicateInt removeDuplicateInt = new RemoveDuplicateInt();
        removeDuplicateInt.removeDuplicateValues(value);

    }


    public void removeDuplicateValues(int value[]) {

        Set set = new HashSet();

        for (int i = 0; i < value.length; i++) {

            for (int j = 0; j < value.length; j++) {

                if (i != j) {
                    if (value[i] == value [j]){
                        set.add(value[i]);
                    }
                }
            }
        }
        Iterator iterator =  set.iterator();
        while (iterator.hasNext()){
            System.out.printf(String.valueOf(iterator.next())+",");
        }
    }
}
