package problem.string;

public class StringToNumber {
    public static void main(String[] args) {
        System.out.println("-".codePointAt(0));
        System.out.println(atoi("-123"));
        System.out.println(atoi("123a"));
    }
    
    static int atoi(String str) {
        // Your code here
        int multiplier = 1;
        int output = 0;
        for (int index = str.length() - 1; index > -1; index--) {
            int codePointAt = str.codePointAt(index);
            if (codePointAt >= 48 && codePointAt <= 57) {
                output += multiplier * (codePointAt - 48);
                multiplier *= 10;
            } else if (codePointAt == 45 && index == 0) {
                output *= -1;
            } else {
                return -1;
            }
        }
        return output;
    }
    
}
