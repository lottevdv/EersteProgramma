public class vergelijk {
    public static void main(String[] args) {
        String s1 = "Hallo";
        String s1LC = s1.toLowerCase();
        String s2 = "hallo";
        if (s1LC.compareTo(s2) == 0) {
            System.out.println("Equal!");
        }
    }
}
