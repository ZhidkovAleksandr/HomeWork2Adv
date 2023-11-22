package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class WalkerStrings {

    private ArrayList arrayList;

public WalkerStrings(){
    this.arrayList = new ArrayList<>();
}
    public <T> boolean addToArray(T value) {



            if (!value.equals("end.")) {
                this.arrayList.add(value);
                return true;
            } else {
               return false;
            }



    }

    public void printArrayData(){

        Iterator iterator = arrayList.listIterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }

    }




}
