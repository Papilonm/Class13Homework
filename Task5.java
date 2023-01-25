public class Task5 {
    //5) How would you check if String is palindrome or not? aba=> true
    //Abbc =>false

    public static void main(String[] args) {


        StringBuilder strbd=new StringBuilder("This is the Sentence to test");
        StringBuilder reversestrbd=strbd.reverse();

        if (strbd.equals(reversestrbd)){
            System.out.println("Sentence is Palindrome");
        }else{
            System.out.println("Sentence is not Palindrome");
        }
    }
}
/// THIS DIDNT WORK IM NOT SURE WHY