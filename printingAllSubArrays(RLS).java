//subArrays
/*
subArrays should contain continues elements of actual array
arr=[1, 6, 5, 2, 4];
subArrays with size=1:- [1], [6], [5], [2], [4]             5
subArrays with size=2:- [1,6], [6, 5], [5, 2], [2,4]        4
subArrays with size=3:- [1, 6, 5], [6, 5, 2],[5, 2, 4]      3
subArrays with size=4:- [1,6, 5, 2],[6, 5, 2, 4]            2
subArrays with size=5:- [1, 6, 5, 2, 4]                     1
no. of subArrays=15=5+4+3+2+1
1->5, 2->4, 3->3, 4->2, 5->1
actualArraySize to 1
actualArraySize=n
n to 1
no. of subArrays=(n*(n+1))/2=sum of first n natural Numbers(i.e.from 1 to n)
*/
import java.util.*;
public class Main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        //printing oneSized-SubArrays
        /*for(int i=0; i<n; i++)
        {
            System.out.print("["+a[i]+"],");
        }*/
        int subArraySize=1;
        //printing twoSized-SubArrays
        for( ; n-subArraySize>=0; )
        {
            System.out.print("subArraySize="+subArraySize+" No.of subArrays="+(n-subArraySize+1)+" {");
            for(int j=0; j<=n-subArraySize; j++)//
            {
                System.out.print("[");
                for(int k=j; k<j+subArraySize; k++)
                {
                    if(k==j+subArraySize-1)
                        System.out.print(a[k]);
                    else
                        System.out.print(a[k]+",");
                }
                if(j==n-subArraySize)
                    System.out.print("]");
                else
                    System.out.print("], ");
            }
            System.out.println("}");
            subArraySize++;
        }
        //i=0, 
        //j=0       j=1     j=2      j=3     
        //k=0 to 1  1 to 2  2 to 3   3 to 4  
    }
}

