package panos;

import java.io.*;
import java.util.*;

public class string_sol {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());

        String res;
        res = (A.compareTo(B)>0)? "Yes" : "No";
        System.out.println(res);

        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1).toLowerCase()
                +" "+B.substring(0, 1).toUpperCase()+B.substring(1).toLowerCase());


    }
}

