package com.example.lib;

import java.util.LinkedList;

/*
  TODO("Sample 3 will be failed")
 */
public class Q0002AddTwoNums {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        LinkedList<Integer> linkedList3 = new LinkedList<Integer>();

//        linkedList1.add(2);   //Sample 1
//        linkedList1.add(4);
//        linkedList1.add(3);
//        linkedList2.add(5);
//        linkedList2.add(6);
//        linkedList2.add(4);

//        linkedList1.add(0);   //Sample 2
//        linkedList2.add(0);

        linkedList1.add(9);     //Sample 3
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList2.add(9);
        linkedList2.add(9);
        linkedList2.add(9);
        linkedList2.add(9);
        linkedList3 = addTwoLists(linkedList1,linkedList2);

        int i = 0;
        while (i < linkedList3.size()) {
            System.out.print(" "+ linkedList3.get(i));
            i++;
        }
    }

    private static LinkedList<Integer> addTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int carry =0;
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        for(int i=l1.size()-1;i>=0;i--) {
            int parseInt = Integer.parseInt(l1.get(i).toString());
            int parseInt2 = Integer.parseInt(l2.get(i).toString());
            int sum =parseInt + parseInt2+carry;
            int value=sum%10;
            carry =sum/10;
            l3.add(value);
        }
        return l3;
    }
}
