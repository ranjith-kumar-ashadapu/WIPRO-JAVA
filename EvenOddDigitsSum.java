public class EvenOddDigitsSum {

    public static void main(String[] args)
    {
        //System.out.println("arguments:number,even/odd");
        int input1 = Integer.parseInt(args[0]);
        String input2 = args[1];
        System.out.println(EvenOddDigitSum(input1,input2));

    }

    public static int EvenOddDigitSum(int input1,String input2)
    {

        switch(input2)
        {
            case "odd":
            String ip1 = Integer.toString(input1);
            int size = ip1.length(); 
            int[] odd = new int[size];
            int value =0,j=0, sum = 0;
            for(int i=0;i<size;i++)
            {
                value = input1%10;
                if(value %2!=0)
                {
                    odd[j]=value;
                    j++;
                }
                input1/=10;
            }
            for(int i=0;i<odd.length; i++)
            {
                sum += odd[i];
            }
            return sum;
    
    
    
            case "even":
            String ip2 = Integer.toString(input1);
            int size1 = ip2.length(); 
            int[] even = new int[size1];
            int value1 =0,j1=0, sum1 = 0;
            for(int i=0;i<size1;i++)
            {
                value1 = input1%10;
                if(value1 %2==0)
                {
                    even[j1]=value1;
                    j1++;
                }
                input1/=10;
            }
            for(int i=0;i<even.length; i++)
            {
                sum1 += even[i];
            }
            return sum1;
    
    
        }
            
    return 0;
        }

}
