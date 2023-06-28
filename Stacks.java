package stacks;

import java.util.Stack;

public class Stacks 
{
    Stack<Character> Names=new Stack<Character>();
    Stack<Character> Names2=new Stack<Character>();
    Stack<Integer> Exes=new Stack<Integer> ();
    Stack<Integer>  cycles=new Stack<Integer> ();
    Stack<Integer>  pro=new Stack<Integer> ();
    void method()
    {
        int count=0;
        char Name[]={'A','C','D','B','E'};
        int Exe[]={1,2,3,4,6};
        int cycle[]={6,4,5,7,3};
        for (int i = 0; i < Name.length; i++)//this for loop is for insert value in Names stack through Name array
        {
            Names.push((Name[i]));
        }
        for (int i = 0; i < Exe.length; i++)//this for loop is for insert value in Exes stack through Exe array
        {
            Exes.push((Exe[i]));
        }
        for (int i = 0; i < cycle.length; i++)//this for loop is for insert value in cycles stack through cycle array
        {
            cycles.push((cycle[i]));
        }
        int processCount=0;//it is used for counting the process count
        for (int i = 0; i <= 30; i++)//this loop is used for checking the condition statement and it will iterate 30 time
        {
            if (processCount<=Names.size())// this statement is true untill Names stack size is less or equal processcount
            {//this statement  is used for increment of processcount and according to the size of Names stack  
                processCount++;
            }
            else
            {    
                int a=cycles.pop();//it is used poping the value cycles stack and then store in a variable
                a--;//decrement the "a" variable  value
                if (a>0 && a<7)//"a" variable value is greater 0 and less 7 then this  condition  work   
                {
                    cycles.push(a);//decrement value of a is push on cycles stack
                    processCount++; // here increment the value of processCount
                }
                else if(a==0)//if a==0 then this condition will work
                {
                    pro.push(processCount-count);//total processCount is push on pro stack but in the first time it is subtract by 0 and other time subtract by 1
                    count=1;//firstly we intalize by 0 and now reintalize by 1
                    char b=Names.pop();//here pop Names stack value and store in b due to the scnario of the task
                    Names2.push(b); //"b" push in Names2 stack 
                }
            }
        }
        System.out.println(""+Names2);// here print the names2.
        System.out.println(""+pro);   //here print the pro
    }

    public static void main(String[] args)
    {
       Stacks obj=new Stacks();// create class object
       obj.method();//calling of object
    }
    
}
