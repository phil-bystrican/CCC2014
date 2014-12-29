
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Project Name: S2
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
        
        int int_n = Integer.parseInt(input.readLine());
        

        String str_names1Input = input.readLine();
        
        String str_names1[] = str_names1Input.split(" ");
        
        String str_names2Input = input.readLine();
        
        String str_names2[] = str_names2Input.split(" ");
        
        
        HashMap<String, String> hsmp_partners1 = new HashMap();
        HashMap<String, String> hsmp_partners2 = new HashMap();
                
        for (int i = 0; i < int_n; i++)
        {
            hsmp_partners1.put(str_names1[i], str_names2[i]);
            hsmp_partners2.put(str_names2[i], str_names1[i]);
        }
        
        for (int i = 0; i < int_n; i++)
        {
            if (str_names1[i].equals(str_names2[i]))
            {
                System.out.println("bad");
                System.exit(0);
            }
            else
            {
                String str_partener1 = hsmp_partners2.get(hsmp_partners1.get(str_names2[i]));
                String str_partener2 = hsmp_partners1.get(hsmp_partners2.get(str_names1[i]));
                

                if (hsmp_partners1.get(str_partener1).equals(str_partener2) && hsmp_partners2.get(str_partener2).equals(str_partener1))
                {
                    continue;
                }
                else
                {
                    System.out.println("bad");
                    System.exit(0);
                }
            }
        }
        
        System.out.println("good");

    }
}
