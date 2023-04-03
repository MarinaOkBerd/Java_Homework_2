import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("jewels = ");
        String jewels = scanner.nextLine();
        System.out.print("stones = ");
        String stones = scanner.nextLine();   
        String result = findJewelsInStones(jewels, stones);
        System.out.print(result);
    } 
    
    public static String findJewelsInStones(String jewels, String stones) {
        char[] jewelsArr = jewels.toCharArray();
        char[] stonesArr = stones.toCharArray();
        String result = "";
        for (char jewel : jewelsArr) {
            int count = 0;
            for (char stone : stonesArr) {
                if (jewel == stone)
                    count++;
      }
      result = result + jewel + count;

    }
    return result;
  }
    
}
