public class isPalinPossible {
 public static void main(String[] args) {
    int ip = Integer.parseInt(args[0]);
    System.out.println(isPlain(ip));    
 }

 static int isPlain(int input1)
 {
     int a[]  = new int[10];
     int c =0 ;
     while (input1!=0)
     {   
         a[input1%10]+=1;
         input1/=10;
     }
     for(int i=0;i<10;i++)
     {
         if(a[i]%2!=0)
         {
             c++;
         }
     }
     if(c>1)
     {
         return 1;
     }
     else
     {
         return 2;
     }
 }
}
