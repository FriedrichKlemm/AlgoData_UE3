package Task_1;

import java.util.Random;

public class SortGroup {
    Number[] sortGroup =  new Number[30];
    Random random;

    SortGroup(){
        for (int i = 0; i < 30; i++){
            sortGroup[i] = new Number(String.valueOf((new Random().nextDouble() * 999 ) -999 ));
            //System.out.println(sortGroup[i]);
        }
    }

    public Number[] getSortGroup() {
        return sortGroup;
    }

    public void setSortGroupNew() {
        for (int i = 0; i < 30; i++){
            sortGroup[i] = new Number(String.valueOf(new Random().nextDouble()%100));
        }
    }

    public void printGroup(){
        for (int i = 0; i < sortGroup.length; i++){
            //System.out.println(i);
            System.out.printf(sortGroup[i].printNumber() + " ");
        }
    }
}
