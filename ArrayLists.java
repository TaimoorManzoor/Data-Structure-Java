/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author sp20-bscs-0021
 */
public class ArrayLists {

   
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Press 1 for Task 1");
        System.out.println("Press 2 for Task 2");
        System.out.println("Press 3 for Task 3");
        int choice=input.nextInt();
        switch(choice)
        {    
            case 1:
            {
                Array obj =new Array();
                obj.method();
                break;
            }

            case 2:
            {
                 Sort obj1=new Sort();
                 obj1.Unique();
                 obj1.method();
                 break;
            }
            case 3:
            {
                Restaurant obj=new Restaurant();
                obj.method();
                break;
            }
            default:
            {
                System.out.println("Please write the correct task");
                break;
            }
        }
               
                

    }
    
}
class Array
{
    ArrayList<String> l=new ArrayList<String>();
    void method()
    {
        l.add("Turgut");
        l.add("Ertugal");
        l.add("Bamsi");
        l.add("Osman");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String a=input.next();
        System.out.println("-----------OUTPUT------------");
        if(l.contains(a)==true)
        {
            System.out.println("The index of the "+l.indexOf(a));
        }
        else
        {
            System.out.println("The String is not found");
        }   
    }        
}
class Sort
{
    Scanner input=new Scanner(System.in);
    ArrayList<Integer> Array=new ArrayList<Integer>();
    ArrayList<Integer> Array1=new ArrayList<Integer>();
    ArrayList<Integer> Frequency = new ArrayList();
    ArrayList<Integer> Unique = new ArrayList();
    void Unique()
    {
        int count=0;
        int array[]={3,5,2,5,3,6,8,6,5,3,5,5,2,5,6,3};
        int i,j ;
        for (int k = 0; k < array.length; k++) 
        {
            Array1.add(array[k]);
        }
       for ( i = 0; i < array.length; i++) 
       {
           count++;
           for ( j = 0; j < i; j++)
            if (Array1.get(i) == Array1.get(j)) 
            {
             break;
            }

           if (i==j) 
           {
                Unique.add(Array1.get(i));
           } 
        }
    }
    void method()
    {
        int array[]={3,5,2,5,3,6,8,6,5,3,5,2,6,5,3};
        int d[]=new int [Unique.size()];
        for (int i = 0; i < array.length; i++)
        {
            Array.add(array[i]);
        }
        System.out.println("-----------OUTPUT------------");
        System.out.println("Total Element");
        System.out.println(Array);
        for (int i = 0; i < Unique.size(); i++) 
        {
             d[i]=Collections.frequency(Array, Unique.get(i));                 
        }
        for (int i = 0; i < d.length; i++)
        {
            Frequency.add(d[i]);
        }
        System.out.println("Occurance of Element");
        System.out.println(""+Frequency);
        System.out.println("Unique  Element");
        System.out.println(""+Unique);
        int n = Frequency.size(),i,j,key,keyNum;
            for(i = 1; i < n; i++)
            {
                key = Frequency.get(i);
                keyNum = Unique.get(i);
                j = i - 1;
                while(j >= 0 && Frequency.get(j) > key)
                {
                    Frequency.set(j+1,Frequency.get(j));
                    Unique.set(j+1,Unique.get(j));
                    j--;
                }
                Frequency.set(j+1,key);
                Unique.set(j+1,keyNum);
            }
            System.out.println("Sorting w.r.t  occurance of a value");
            System.out.println(Unique);        
    }

}
class Restaurant
{
    ArrayList<Integer> Distance=new ArrayList<Integer>();
    ArrayList<Integer> Distances=new ArrayList<Integer>();
    ArrayList<Character> Location=new ArrayList<Character>();
    ArrayList<Character> Locations=new ArrayList<Character>();

    char Location1[]={'A', 'E', 'D', 'B', 'C'};
    int Distance1[]={13, 21, 8, 10, 4};
    void method()
    {
        System.out.println("-----------OUTPUT------------");
        Character temp='0';
        for (int i = 0; i < Distance1.length; i++) 
        {
            Distance.add(Distance1[i]);
        }
        for (int i = 0; i < Location1.length; i++)
        {
               Location.add(Location1[i]);
        }
           for (int i = 0; i < Location1.length; i++)
        {
               Distances.add(Distance.get(i));
        }
           
        System.out.println("Distance Array : "+Distance);
        System.out.println("Location Array :"+Location);
        Collections.sort(Distances);
        for (int i = 0; i < Distances.size(); i++)
        {
            for (int j = 0; j < Distances.size(); j++)
            {
                if (Distances.get(i)==Distance.get(j)) 
                {    
                     temp =  Location.get(j);
                     Locations.add(temp);
                }
            }
        }
        System.out.print("Optimize Route : ");
        System.out.println(Locations);

    }        
}
    
