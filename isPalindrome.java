 class isPalindrome {


public static void main(String[] args) {
    int input1 = Integer.parseInt(args[0]);
    System.out.println("1:Not Palindrome\n2.Is palindrome");
    System.out.println(palindrome(input1));
}

   static int palindrome(int input1)
    {
    int input2=0,temp,a;
    temp = input1;
    while(temp>0)
    {   
        a = temp%10;
        input2 = input2*10 +a;
        temp = temp /10;
    }
    if(input1==input2)
    {
        return 2;
    }
    else
    {
        return 1;
    }
    	}

}
