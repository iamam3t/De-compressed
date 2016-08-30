package com.leapfrog.homepractice;
import com.leapfrog.homepractice.util.De_Compressed;
public class Program {
    
    public static void main(String[] args) {
        De_Compressed dc = new De_Compressed();
        String comp,decomp;
        comp = dc.getCompressed();
        System.out.println(comp);
        decomp = dc.getDecomposer();
        System.out.println(decomp);
        dc.check();
    }
}