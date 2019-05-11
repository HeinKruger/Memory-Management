/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm.practicals;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Hein
 */
public class MMPracticals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean check =false;
        int i =0;
        
        System.out.println("all processes in memory:");
        String[] arrmem = new String[9];
        arrmem[0] = "A";
        arrmem[1] = "B";
        arrmem[2] = "C";
        arrmem[3] = "D";
        arrmem[4] = "E";
        arrmem[5] = "F";
        arrmem[6] = "G";
        arrmem[7] = "H";
        arrmem[8] = "I";
        System.out.println(Arrays.toString(arrmem));     
        System.out.println("Enter process to remove: ");
        String in = input.nextLine();
        
        for(int j = 0; j < arrmem.length;j++)
        {
            if(arrmem[j] == in)
            {
            arrmem[j] = " ";
            break;
            }
            
        }
        
        
        System.out.println("Array after element is removed");
        System.out.println(Arrays.toString(arrmem));
        
        
    }
    
}
