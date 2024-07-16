public class totalHillWeight {

    public static void main(String[] args) {
        int a =Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(totalHillWt(a,b,c));
    }
    static int totalHillWt(int input1,int input2,int input3)
    {
            int hwt =0;
        for(int i=0;i<input1;i++)
        {
            hwt= hwt +input2*(i+1);
            input2 = input2+input3;
        }
        return hwt;
    }
}
