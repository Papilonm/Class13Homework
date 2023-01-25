public class Task2 {
    //2) Create a String that should be combination of letters, numbers and special characters.
    // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

    public static void main(String[] args) {


        String str = "Icmdoaejoea134451!@#%^^&@!";
        String nonalphanumeric=str.replaceAll("[A-Za-z1-9]","");
        int nonalphanumericamount=nonalphanumeric.length();

        int strtotallength=str.length();
        System.out.println(strtotallength-nonalphanumericamount);


    }
}