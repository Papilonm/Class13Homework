public class Task6 {
    //6) How would you swap  2 strings without a temporary variable


    public static void main(String[] args) {
        String str1="This is Sentence 1";
        String str2="This is Sentence 2";

       //System.out.println(str1.replace(str2));  THIS DIDN'T WORK

        str1=str1+str2;
        str2=str1.substring(0,18);
        str1=str1.substring(18,36);
        System.out.println("str1 is now "+ str1);
        System.out.println("Str2 is now "+str2); //THIS DID WORK BUT IT IS NOT GENERIC,IT IS ACTUALLY KINDA EMBARRASSING
                                                // TO TURN IN THIS BUT IDK OTHER WAY TO DO IT.






    }
}
