public class weightOfString {


    public static void main(String[] args) {
        String str  = args[0];
        int ip1 = Integer.parseInt(args[1]);
        System.out.println(wtOfString(str, ip1));
    }
    static int wtOfString(String input1,int input2){
    int weight =0;
    for (int i = 0; i < input1.length(); i++) 
    {
        char letter = input1.charAt(i);
        
        if (input2 == 0) 
        {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') 
            {
                continue;
            }
        }
        
        if (letter >= 65 && letter <= 90) 
        { 
            weight += letter - 64;
            
        } else if (letter >= 97 && letter <= 122) 
        { 
            weight += letter - 96;
            
        } 
    }
    
    return weight;
}

}
