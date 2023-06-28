
package task.pkg1;

import java.util.Scanner;

public class TASK1 
{    
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Press 1 for Task 1");
        System.out.println("Press 2 for Task 2");
        System.out.println("Press 3 for Task 3");
        System.out.println("Press 4 for Task 4");
        System.out.println("Press 5 for Task 5");
        int choice=input.nextInt();
        switch(choice)
        {    
            case 1:
            {
                Highest obj1=new Highest();
                obj1.method();
                break;
            }
            case 2:
            {
                Average obj2=new Average();
                obj2.method();
                break;
            }
            case 3:
            {
                Unique obj3=new Unique();
                obj3.method();
                break;
            }
            case 4:
            {
                sort obj4=new sort();
                obj4.method();
                break;
            }
            case 5:
            {
                Medical obj5=new Medical();
                obj5.method();
                break;
            }
            default:
            {
                System.out.println("Please chose the right Task");
            }    
        }           

    }
    
}
//Task#1---------------------------------------------------------------------------------------------------------
class Highest
{
    int array[]={113,25,75,1,2};
    void method()
    {
        System.out.print("The Array is : {");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(" "+array[i]);
        }
        System.out.print("}\n");
        int Max=array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(Max<array[i])
            {
                Max=array[i];  
            }    
        }
        System.out.println("The highest value is : "+Max);
    }        
}
//Task#2---------------------------------------------------------------------------------------------------------
class Average
{
    int array[]={3,25,75,1,2};
    void method()
    {
        int sum=0;
        System.out.print("The  Array is : {");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(" "+array[i]);
        }
        System.out.print("}\n");
        for (int i = 0; i < array.length; i++)
        {
            sum+=array[i];
        }
        int Average=sum/array.length;
        System.out.println("The Average of the Array is : "+Average);
    }        
}
//Task#3---------------------------------------------------------------------------------------------------------
class Unique
{
    void method()
    {
                int x,y;
		int Unique[] = {1,1,1,2,2,4,3,3,2,6,6,8,9,8,6,5};
                System.out.print("The Unique Array is :  ");
		for (x = 0; x < Unique.length; x++) 
                {
	
		  Unique[x]=Unique[x];
		   for (y = 0; y < x; y++)
		    if (Unique[x] == Unique[y])
                    {
		     break;   
		    }
		    if (x==y) 
                    {
                        System.out.print(" "+Unique[x]);
		    }
		}
                System.out.println("\n");
    }
}
//Task#4---------------------------------------------------------------------------------------------------------
class sort
{    int array[]={3,25,75,1,2,3,2};
    void method()
    {
        int temp=0;
        System.out.println("The FIRST ARRAY");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(" "+array[i]);
            for (int j = 0; j < array.length; j++)
            {
                if(array[i]<array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }   
                   
            }
        }
        System.out.println("");
        System.out.println("The Second ARRAY");
        int array2[]=new int[7];
        for (int i = 0; i < array2.length; i++)
        {
            array2[i]=array[i]; 
            System.out.print(" "+array2[i]);
        }   
    }        
}
//Task#5---------------------------------------------------------------------------------------------------------
class Medical
{
    int array[][]=
    {
        {3,4,5,1,3},
        {5,7,0,0,1},
        {2,3,0,0,7},
        {0,0,3,5,2},
        {0,0,1,6,7},
    };
    int count=0;
    void method()
    {
        System.out.println("The 2D array is ");
          for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++) 
            {
                 
                System.out.print(""+array[i][j]);
                if(array[i][j]==0)
                {
                    if(i==4)
                    {
                        continue;
                    }   
                    if(array[i+1][j]==0 && array[i][j+1]==0 && array[i+1][j+1]==0)
                    {
                        count++;
                    }   
                }
            }
            System.out.println("");
        }
          System.out.println("***||OUTPUT||***");
          System.out.println("The black spot is :"+count);
    }       
}