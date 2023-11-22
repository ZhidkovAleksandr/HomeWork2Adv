package Task2;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    static void doubleValues(LinkedList list){

        ListIterator lIterator =  list.listIterator();


        while (lIterator.hasNext()){

            var s = lIterator.next();
            lIterator.add(s);

        }

    }
    public static void main(String[] args) throws IOException {
        String s;
        LinkedList<String> linkedWords = new LinkedList();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            System.out.println("Type in the word [" + (i+1)+  "]");
             s = reader.readLine();
             linkedWords.add(s);
        }

        doubleValues(linkedWords);


        for (String e:linkedWords) {

            System.out.println(e);

        }


    }
}