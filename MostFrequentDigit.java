import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class MostFrequentDigit{

    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);

        int ip1  = sc.nextInt();
        int ip2  = sc.nextInt();
        int ip3  = sc.nextInt();
        int ip4  = sc.nextInt();
        sc.close();
        System.out.println(Frequent( ip1, ip2, ip3, ip4));
    }
    static int Frequent(int input1,int input2,int input3,int input4)
    {
        int a = 0;
        int[] occurance = {0,0,0,0,0,0,0,0,0,0};
        int indexVal;
        int j=0;
        int[] ocCount = {0,0,0,0,0,0,0,0,0,0};
        while(input1>0)
        {
            a =input1%10;
            occurance[a]+=1;
            input1/=10;
        }
        while(input2>0)
        {
            a =input2%10;
            occurance[a]+=1;
            input2/=10;
        }
        while(input3>0)
        {
            a =input3%10;
            occurance[a]+=1;
            input3/=10;
        }
        while(input4>0)
        {
            a =input4%10;
            occurance[a]+=1;
            input4/=10;
        }
        int maxVal =  Arrays.stream(occurance).max().getAsInt();
        for(int i =0 ;i<10;i++)
        {
            if(maxVal == occurance[i])
            {
                ocCount[j] = i;
                j++;
            }
        }
        indexVal = Arrays.stream(ocCount).max().getAsInt();
        return indexVal;
	}
}
