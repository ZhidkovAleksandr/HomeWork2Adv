package Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String keyPlace;
        String fam;

        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Москва", "Іванови");
        hm.put("Київ", "Петрови");
        hm.put("Лондон", "Абрамовичі");

        while (true) {
            System.out.println("Введіть місто");
            keyPlace = sc.next();
            try {
                fam = hm.get(keyPlace);
                if (fam == null) {
                    throw new NullPointerException();
                }
                System.out.println(fam);
            } catch (NullPointerException e) {
                System.out.println("Міста немає у списку");
            }

        }

    }




}
