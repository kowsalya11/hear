class Swap_Strings
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter the 1st String : ");
        String s1=br.readLine();
        int len1=s1.length();
 
        System.out.print("Enter the 2nd String : ");
        String s2=br.readLine();
 
        System.out.println("-------------------------------");
        System.out.println("Strings Before Swapping : ");
        System.out.println("1st String = "+s1);
        System.out.println("2nd String = "+s2);
 
        /*Swapping Process Begins*/
        s1=s1+s2;
        s2=s1.substring(0,len1);
        s1=s1.substring(len1);
        /*Swapping Process Ends*/
 
        System.out.println("-------------------------------");
        System.out.println("Strings After Swapping : ");
        System.out.println("1st String = "+s1);
        System.out.println("2nd String = "+s2);
    }
}