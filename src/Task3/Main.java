package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void getIntegerList(List someList, int value){

        for (int i=0; i<10; i++){
            int rand = (int) (Math.random()*value);
            someList.add(rand);
        }

    }

    static void getMinimum(List someList){
        System.out.println(Collections.min(someList));
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ціле число");
        int num = sc.nextInt();
        sc.close();
        getIntegerList(arrayList, num);
        getMinimum(arrayList);




    }
}
