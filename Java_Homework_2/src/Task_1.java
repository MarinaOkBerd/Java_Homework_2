import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s = ");
        String s = scanner.nextLine();
        int[] index = new int[s.length()];
        for (int i = index.length - 1; i >= 0; i--) {
            index[i] = index.length - i;
        }
        String result = shuffle(s, index);
        System.out.println(result);
    }
    
    public static String shuffle(String s, int[] index){
        char[] Char = new char[s.length()];    
        for (int i = 0; i < s.length(); i++) {
            Char[index[i] - 1] = s.charAt(i);
        }
        return new String(Char);
    } 
}
