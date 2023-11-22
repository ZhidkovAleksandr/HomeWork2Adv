package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        WalkerStrings ws = new WalkerStrings();
        String st;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean res = true;

        while (res){
            System.out.println("Type in something");
            st = reader.readLine();
            res = ws.addToArray(st);
        }

        ws.printArrayData();


    }

}
