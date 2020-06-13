/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venzina;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xristos
 */
public class LuhnAlgorithm {
       public static void main(String[] args) {
        String cardNo = "1111111111111111"; 
        if (checkLuhn(cardNo)) 
            System.out.println("This is a valid card"); 
        else
            System.out.println("This is not a valid card"); 
        try {
            eggrafisearxeio();
        } catch (IOException ex) {
            Logger.getLogger(Venzina.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            prosthiki();
        } catch (IOException ex) {
            Logger.getLogger(Venzina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static boolean checkLuhn(String cardNo) 
    { 
        int nDigits = cardNo.length();  
        int nSum = 0; 
        boolean isSecond = false; 
        for (int i = nDigits - 1; i >= 0; i--)  
        { 
            int d = cardNo.charAt(i) - '0'; 
            if (isSecond == true) 
              d = d * 2; 
            nSum += d / 10; 
            nSum += d % 10;
            isSecond = !isSecond;
        } 
        return (nSum % 10 == 0); 
    }   
    static void eggrafisearxeio() throws IOException {
        String str = "Έγκυρη";
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\xristos\\Desktop\\aa.txt")); {
               writer.write(str);
               writer.close();
           }
    }
    static void prosthiki() throws IOException {
        String str = "Κάρτα";
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\xristos\\Desktop\\aa.txt", true));
        writer.append(' ');
        writer.append(str);
        writer.close();
    }

   
    
}