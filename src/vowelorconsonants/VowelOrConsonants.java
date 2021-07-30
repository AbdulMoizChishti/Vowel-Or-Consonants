/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelorconsonants;
import java.util.Scanner;
/**
 *
 * @author Abdul Moiz Chishti
 */
public class VowelOrConsonants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner obj= new Scanner (System.in);
        System.out.println("Enter any Character:");
       
        char c=obj.next().charAt(0);
     
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'  )
            System.out.println(c + " is vowel");
        else
            System.out.println(c + " is consonant");
       

    }
}