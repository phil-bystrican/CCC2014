/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Project Name: S3
 * File Name:	 Main
 * Programmer:	 Phil Bystrican <Phil@PBApps.ca>
 * Teacher:	 Mr. K
 * Date:         Feb 25, 2014
 * Description:  
 **/

public class Main 
{
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException 
    {   
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int int_t = Integer.parseInt(input.readLine());
        
        for (int i = 0; i < int_t; i++)
        {
            boolean bool_failTest = false;
            
            int int_n = Integer.parseInt(input.readLine());
            
            int int_inputCarOrder[] = new int[int_n];
            int int_carOrder[] = new int[int_n];
            
            for (int j = 0; j < int_n; j++)
            {
                int_inputCarOrder[j] = Integer.parseInt(input.readLine());
            }
            
            int int_placeholder = 0;
            
            for (int j = int_inputCarOrder.length-1; j >= 0; j--)
            {
                int_carOrder[int_placeholder] = int_inputCarOrder[j];
                
                int_placeholder++;
            }
            
            int int_lastCarInLake = 1;
            
            int int_carsInBranch[] = new int[int_carOrder.length];
            
            int int_numberOfCarsOutOfBranch = 0;
            
            for (int j = 0; j < int_carOrder.length; j++)
            {
                while (int_carsInBranch.length != 0 && int_carsInBranch.length-1 > int_numberOfCarsOutOfBranch)
                {
                    if (int_carsInBranch[int_numberOfCarsOutOfBranch]-int_lastCarInLake == 0)
                    {
                        int_carsInBranch[int_numberOfCarsOutOfBranch] = 0;
                        int_numberOfCarsOutOfBranch++;
                    }
                    else {break;}
                }

                if ((int_carOrder[j]-int_lastCarInLake) == 0)
                 {
                     int_carOrder[j] = 0;
                     int_lastCarInLake ++;
                     continue;
                 }
                 else 
                 {
                     int_carsInBranch[int_carsInBranch.length-1] = int_carOrder[j];
                     int_carOrder[j] = 0;
                 }
            }     
            
            for (int j = 0; j < int_carOrder.length; j++)
            {
                if (int_carOrder[j] != 0)
                {
                    bool_failTest = true;
                    break;
                }
            }  
            
            for (int j = 0; j < int_carsInBranch.length; j++)
            {
                if (int_carsInBranch[j] != 0)
                {

                    bool_failTest = true;
                    break;
                            
                }
            }  
            
            if (bool_failTest)
            {
                System.out.println("N");
            }
            else
            {
                System.out.println("Y");
            }
        }   
    }
     
}
