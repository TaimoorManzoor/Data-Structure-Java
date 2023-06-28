package prefixandpostfix;
import java.util.Scanner;
import java.util.Stack;
public class PrefixAndPostfix 
{
    public static void main(String[] args)
    {
        Postfix obj0 =new Postfix();//create the object of postfix class
        obj0.Postfix();//calling of Postfix function
        Prefix obj1=new Prefix();//create the object of Prefix class
        obj1.Prefix();//calling of prefix function
    } 
}
class Postfix
{
    Float pop1;
    Float pop2;
    float resulth;
    String operation;
    Stack<Float> Operand=new Stack<Float>();//create the stack data structure for storing the resulth of postfix expression  
    void Postfix()//body of postfix function
    {
        String array[]={"5","4","*","2","3","*","+","9","-"};//Storing the postfix expression in an array
        System.out.print("The Postfix Expression is : ");
        for (int i = 0; i < array.length; i++) //printing the postfix expression through for-loop
        {
            System.out.print(" "+array[i]);
        }
        System.out.println("");
        //for the postfix we are scan left to right
        for (int i = 0; i < array.length; i++) 
        {
          //if any index are present operator then if part are run in conditonal statement otherwise else  
            if (array[i]=="+" || array[i]=="-" ||array[i]=="*" ||array[i]=="/")
            {
                operation=array[i];//here we are storing the operator
                pop1=Operand.pop();//we are storing pop value in pop1 variable
                pop2=Operand.pop();//we are storing pop value in pop2 variable
            switch(operation)//switch case  cases will run according to the operator
            {
                case "+"://this case are doing addition
                {    
                    resulth= pop1+pop2;
                    break;
                }
                case "-"://this case are doing Subtraction
                {    
                    resulth= pop2-pop1;
                    break;
                }  
                case "*"://this case are doing Multiplication
                {    
                    resulth= pop1*pop2;
                    break;
                }  
                case "/"://this case are doing Division
                {   
                    resulth= pop1/pop2;
                    break;
                }
                default://it will run if operator are not present in the switch case
                {
                    System.out.println("This operator is not present");
                }    
               
            }
             Operand.push(resulth);//this resulth push in stack
        }    
            else //it will run when operand are present in the array index
            {
                Float a=Float.parseFloat(array[i]);//parse  the   array value in to float
                Operand.push(a);//push in the Stack
            }    
        }
        System.out.println("Resulth of Expression is  : "+Operand);//Present the total resulth
    }       
}
class Prefix
{
    Float pop1;
    Float pop2;
    float resulth;
    String operation;
    Stack<Float> Operand=new Stack<Float>();//create the stack data structure for storing the resulth of prefix expression
    
    void Prefix()//body of prefix function
    {
        String array[]={"-","+","*","2","3","*","5","4","9"};//Storing the prefix expression in an array
        System.out.print("The PreFix Expression is : ");
        for (int i = 0; i < array.length; i++) //printing the prefix expression through for-loop
        {
            System.out.print(" "+array[i]);
        }
        System.out.println("");
        int length=array.length;
        //for the postfix we are scan right to left
        for (int i = length-1; i >=0; i--) //it will iterate reverse
        {
            //if any index are present operator then if part are run in conditonal statement otherwise else  
            if (array[i]=="+" || array[i]=="-" ||array[i]=="*" ||array[i]=="/")
            {
                
                operation=array[i];//here we are storing the operator
                pop1=Operand.pop();//we are storing pop value in pop1 variable
                pop2=Operand.pop();//we are storing pop value in pop2 variable
            switch(operation)//switch case  cases will run according to the operator
            {
                case "+"://this case are doing addition
                {    
                    resulth= pop1+pop2;
                    break;
                }
                case "-"://this case are doing Subtraction
                {    
                   resulth= pop1-pop2;
                   break;
                }  
                case "*"://this case are doing Multiplication
                {    
                    resulth= pop1*pop2;
                    break;
                }  
                case "/"://this case are doing Division
                {   

                   resulth= pop1/pop2;
                   break;
                }
                default://it will run if operator are not present in the switch case
                {
                    System.out.println("This operator is not present");
                }    
               
            }
             Operand.push(resulth);//this resulth push in stack
        }    
            else //it will run when operand are present in the array index
            {
                Float a=Float.parseFloat(array[i]);//parse  the   array value in to float
                Operand.push(a);//push in the Stack
            }    
        }
        System.out.println("Resulth of Expression is  : "+Operand);//Present the total resulth
    }       
}

