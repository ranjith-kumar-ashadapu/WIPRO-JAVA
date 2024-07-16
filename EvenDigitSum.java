class EvenDigitSum
{
    public static void main(String args[])
    {
        int input1 = Integer.parseInt(args[0]);
        System.out.println(EvenDigitsSum(input1));
    
    }
    public static int EvenDigitsSum(int input1)
    {
        String ip1 = Integer.toString(input1);
        int size = ip1.length(); 
        int[] even = new int[size];
        int value =0,j=0, sum = 0;
        for(int i=0;i<size;i++)
        {
            value = input1%10;
            if(value %2==0)
            {
                even[j]=value;
                j++;
            }
            input1/=10;
        }
        for(int i=0;i<even.length; i++)
        {
            sum += even[i];
        }
        return sum;
    }
}