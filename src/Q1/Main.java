/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Abdallah_Ahmed
 */
public class Main {

    public static void main(String[] args) {
        int random;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            random = (int) (Math.random() * 100 + 1);
            linkedList.add(random);
        }
        Collections.sort(linkedList);
        int sum = 0;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            int x = (int) it.next();
            sum += x;
            System.out.println(x);
        }
        System.out.println("\nSum : "+sum);
        System.out.println("Average : "+sum/25);
    }
}
