import java.util.Scanner;

public class createPin {
    public static void main(String[] args) {
        System.out.println("Enter 3 Number 100:999");
        Scanner sc =new Scanner(System.in);
        int ip1 = sc.nextInt();
        int ip2 = sc.nextInt();
        int ip3 = sc.nextInt();
        System.out.println(cPin(ip1, ip2, ip3));
        sc.close();
    }
    
static int cPin(int input1, int input2,int input3 )
{
    int a[] = new int[3];
    int c[] = new int[3];
    int b[] = new int[3];
    int pin[]  = new int[4];
    int p=0;
    a[0] = input1%10;
    input1/=10;
    b[0] = input2%10;
    input2/=10;
    c[0]  = input3%10;
    input3/=10;
    pin[3] = Math.min(a[0],Math.min(b[0],c[0]));

    a[1] = input1%10;
    input1/=10;
    b[1] = input2%10;
    input2/=10;
    c[1]  = input3%10;
    input3/=10;
    pin[2] = Math.min(a[1],Math.min(b[1],c[1]));

    a[2] = input1%10;
    input1/=10;
    b[2] = input2%10;
    input2/=10;
    c[2]  = input3%10;
    input3/=10;
    pin[1] = Math.min(a[2],Math.min(b[2],c[2])); 

    pin[0] = Math.max(a[0],Math.max(a[1],Math.max(a[2],Math.max(b[0],Math.max(b[1],Math.max(b[2],Math.max(c[0],Math.max(c[1],c[2]))))))));

    for (int t=0;t<4;t++)
    {
        p = p*10+pin[t];
    }
    return p;
}

}


