package problem.string;

public class ValidateIPAddress {
    public static void main(String[] args) {
        boolean valid = isValid("a.b.c.d");
        System.out.println("valid = " + valid);
    }
    
    public static boolean isValid(String s) {
        if (s.length()-s.replace(".","").length()!=3) return false;
        String[] split = s.split("\\.");
        if (split.length != 4) return false;
        for (String s1 : split) {
            if (s1.isEmpty()) return false;
            try{
                int number = Integer.parseInt(s1);
                if (s1.length() > 1 && s1.charAt(0) == '0') return false;
                if (number > 255) return false;
            }catch (Exception exception){
                return false;
            }
        }
        return true;
    }
    
}
