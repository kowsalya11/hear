public class MyStrMatches {
 
    public static void main(String a[]){
     
        String[] str = {"www.java2novice.com", "http://java2novice.com"};
        for(int i=0;i < str.length;i++){
            if(str[i].matches("^www\\.(.+)")){
                System.out.println(str[i]+" Starts with 'www'");
            } else {
                System.out.println(str[i]+" is not starts with 'www'");
            }
        }
    }
}
- See more at: http://www.java2novice.com/java_string_examples/regular_expression/#sthash.mrBCmK4s.dpuf