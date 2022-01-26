package com.company;

import java.util.Arrays;

public class ClientTester {
    // fills result with clients merged from the beginning of
    // list1 and list2;
    // result contains no duplicates and is sorted in ascending
    // order by customer
    // precondition: result.length > 0
    //               list1.length > result.length;
    //               list1 contains no duplicates
    //               list2.length > result.length;
    //               list2 contains no duplicates
    //               list1 and list2 are sorted in ascending order
    //               by client
    // postcondition: list1 and list2 are not modified

    public static void prefixMerge(Client[] list1, Client[] list2, Client[] result) {

    }

    public static void main(String[] args) {
        Client c1 = new Client("Anton", 101);
        Client c2 = new Client("Bradley", 102);
        Client c3 = new Client("Bradley", 103);
        Client c4 = new Client("Cho", 104);
        Client c5 = new Client("Dahl", 105);
        Client c6 = new Client("Edgerton", 106);
        Client c7 = new Client("Edgerton", 107);
        Client c8 = new Client("Fleetwood", 108);

        Client[] list1 = {c1, c3, c4, c5, c7, c8};
        Client[] list2 = {c2, c3, c5, c6, c7};
        Client[] list3 = {c3, c5, c6};

        Client [] result1 = new Client[5];
        prefixMerge(list1,list2,result1);
        System.out.println(Arrays.toString(result1));

        Client [] result2 = new Client[3];
        prefixMerge(list2,list3,result2);
        System.out.println(Arrays.toString(result2));

        Client [] result3 = new Client[3];
        prefixMerge(list3,list1,result3);
        System.out.println(Arrays.toString(result3));

    }
}
