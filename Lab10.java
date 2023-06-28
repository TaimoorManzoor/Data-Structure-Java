package lab10;
import java.util.Scanner;
public class Lab10
{
    int arr0[]={2,5,1,2,5,5};
    int arr1[]={2,2,4,6,6,6,6,8,10,12};
    //Task 1
    void MaxAndMin()
    {
        //intailize the max and min to index 0 of the array
        int max=arr0[0];
        int min=arr0[0];
        //iteration of loop for checking the condition
        for (int i = 0; i < arr0.length; i++)
        {
            //max is less than  array of index then we perfom swapping 
            if (max<arr0[i])
            {
                max=arr0[i];
            }
            //min is greater than  array of index then we perfom swapping 
            if (min>arr0[i])
            {
                min=arr0[i];
            }
        }
        //printing the max and min
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);
    }
    //Task 2
    int LinearSearch()
    {
        int a=0;int i=0;int count=0;
        Scanner input=new Scanner(System.in);
        //take key from user
        System.out.println("Please tell us your Key value");
        int key=input.nextInt();
        //looping for checking the condition again and again
        for (i = 0; i < arr0.length; i++)
        {
            //if key is equal to array of index and inside the statement ,there is counter
             if (arr0[i]==key) 
             {
                 a=1;
                 count++;
             }
        }
        // if key is not presnet then it will run
            if (a==0)
            {
                System.out.println("Key is not found");
                return -1;
            }
            //print the counter 
            System.out.println("Key occurance : "+count);
            return i;
    }  
    void Sum()
    {
        //sum all the element of the array
        int sum=0;
        for (int i = 0; i < arr0.length; i++) 
        {
            //sum all the array
            sum+=arr0[i];
        }
        //printing the sum of the array
        System.out.println("Sum : "+sum);
    }       
    int BinarySearch()
    {
        int mid;
        Scanner input=new Scanner(System.in);
        System.out.println("Please tell us your Key value");
        int key=input.nextInt();
        int leastpoint=0;
        int Highpoint=arr1.length-1;
        //while work will till the true
        while(true)
        {
            //find the mid value
            mid=(leastpoint+Highpoint)/2;
            //key is equal array mid value
            if (key==arr1[mid]) 
            {
                System.out.println("Key is Found");
                return mid;
            }
            //key is greater than array
            if (key>arr1[mid]) 
            {
                leastpoint=mid+1;
            }
             //key is less than array
            if (key<arr1[mid]) 
            {
                Highpoint=mid-1;
            }
            //leastpoint>Highpoint 
            if (leastpoint>Highpoint) 
            {
                System.out.println("Key is not Found");
                return -1;
            }
        }    
    } 
    void BinarySearch0()
    {
        int mid;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Please tell us your Key value");
        int key=input.nextInt();
        int leastpoint=0;
        int Highpoint=arr1.length-1;
        while(true)
        {
            mid=(leastpoint+Highpoint)/2;
            if (key==arr1[mid]) 
            {
                for (int i = 0; i < arr1.length; i++) 
                {
                       int index1=mid-i;
                       int index2=mid+i;
                       //key is find
                       if(index1>-1 && index2<arr1.length)
                       {    
                           // checking previous index
                            if (key==arr1[index1] )
                            {
                                count++;
                            }
                            // checking next index
                            if (key==arr1[index2])
                            {
                                count++;
                            }
                       }
                    }
                break;
            }
            //key is greater than array
            if (key>arr1[mid]) 
            {
                leastpoint=mid+1;
            }
            //key is less than array
            if (key<arr1[mid]) 
            {
                Highpoint=mid-1;
            }
            //leastpoint>Highpoint 
            if (leastpoint>Highpoint) 
            {
                System.out.println("Key is not Found");
                break;
            }
        }
        //print the counter
        System.out.println(""+(count-1));
    }        
    public static void main(String[] args) 
    {
        Lab10 n=new Lab10();
        n.MaxAndMin();
        n.LinearSearch();
        n.Sum();
        n.BinarySearch();
        n.BinarySearch0();
          
    }
    
}
