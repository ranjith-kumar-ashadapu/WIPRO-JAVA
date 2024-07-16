public class secondWordUpperCase {


    public static void main(String args[])
    {
        
        System.out.println(secondWordUpper(args[0]));
    }

    static String secondWordUpper(String input1)
    {
        String[] sentences = input1.split(" ");
    int len = sentences.length;
    if(len<=1)
    
        return "LESS";
    
    else
    
       return sentences[1].toUpperCase();
 
    }
}
