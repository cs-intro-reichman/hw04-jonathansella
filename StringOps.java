public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    System.out.println(capVowelsLowRest("Hello World")); 
    
    camelCase("             Hi   hi  hi hi");  


    }

    public static String capVowelsLowRest (String string) {
        String s = "";
        int i = 0;
        for (string.charAt (i); i < string.length(); i++) {
            if (string.charAt(i) == 97 || string.charAt(i) == 101 || string.charAt(i) == 105 || string.charAt(i) == 111 || string.charAt(i) == 117) {
                s = s + (char)(string.charAt (i) - 32);
            } else if (string.charAt(i) < 91 && string.charAt(i) > 65 && string.charAt(i) != 69 && string.charAt(i) != 73 && string.charAt(i) != 79 && string.charAt(i) != 85) {
                s = s + (char)(string.charAt (i) + 32);
            } else {
                s = s + string.charAt(i);
            }
        }
        return s;
    }

    public static String camelCase (String string) {
        string = deleteSpacebeginning (string);
        string = lowerCase(string);
        string = upperNew(string);
        string = deleteSpace(string);
        System.out.println(string);
        return string;
    }

    public static String lowerCase (String string) {
        String s = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) > 64 && string.charAt(i) < 91) {
                s = s + (char)(string.charAt(i) + 32);
            } else { 
              s = s + string.charAt(i);  
            }
        }
        return s;
    }

    public static String upperNew (String string) {
        String s = "" + string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == 32) {
                s = s + string.charAt(i);
            }else if (string.charAt(i-1) == 32) {
                s = s + (char)(string.charAt(i) - 32);
            } else { 
              s = s + string.charAt(i);  
            }
        }
        return s;
    }

    public static String deleteSpace (String string) {
        String s = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
              s += string.charAt(i);  
            }
        }
        return s;
    }

    public static String deleteSpacebeginning (String string) {
        String s = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
              s = string.substring(i); break; 
            }
        }
        return s;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
