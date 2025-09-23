// We could use RegEx's with capture groups, eg: echo "abcrui" | sed -E 's/abc(.*)/\1/'  -> output will be rui
 
class StringFinalExercise {

    public static void main(String[] args) {

        String url = "http://www.codeforall.com";

        String domain = url.substring(url.lastIndexOf("/") + 1); // www.codeforall.com

        String name = url.substring(url.indexOf(".") + 1, url.lastIndexOf(".")); // codeforall

        int codeEnd = name.lastIndexOf("e"); // get last "e" of code
        int allStart = name.lastIndexOf("a"); // get first "a" of all

        String codeStr = name.substring(0, codeEnd + 1);     // code
        String forStr = name.substring(codeEnd + 1, allStart); // for
        String allStr = name.substring(allStart);              // all

        codeStr = codeStr.substring(0, 1).toUpperCase() + codeStr.substring(1);  // Code
        allStr = allStr.substring(0, 1).toUpperCase() + allStr.substring(1);        // All

        name = codeStr + " " + forStr + " " + allStr + "_"; // Code for All_

        System.out.println("I am a Code Cadet at " + name + ", " + domain);
    }
}

/*
public class StringManipulation {

    public static void main(String[] args) {

        String str = "http://www.codeforall.com";
        String domain = str.replaceAll(".*www", "www");

        String firstWord = domain.substring(domain.indexOf(".") + 1, domain.lastIndexOf("e") + 1);
        String secondWord = domain.substring(domain.indexOf(firstWord) + firstWord.length(), domain.lastIndexOf("a"));
        String thirdWord = domain.substring(domain.lastIndexOf(secondWord) + secondWord.length(), domain.lastIndexOf("."));

        String name ="< " + firstWord.substring(0,1).toUpperCase() + firstWord.substring(1) + " "
                          + secondWord + " "
                          + thirdWord.substring(0,1).toUpperCase() + thirdWord.substring(1) + "_ >";

        System.out.println("I am a Master Coder at " + name + ", " + domain);
    }
}
*/