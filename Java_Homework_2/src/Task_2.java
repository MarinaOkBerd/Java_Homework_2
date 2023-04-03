import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] Notebook = new String[n];
        for (int i = 0; i < n; i++) {
          Notebook[i] = scanner.nextLine();
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] dangerFood = new String[m * 2];
        String[] goodFood = new String[m * 2];
        for (int i = 0; i < m * 2; i += 2) {
          String[] allFood = scanner.nextLine().split("[-]");
          dangerFood[i] = allFood[0].trim();
          dangerFood[i + 1] = String.valueOf(allFood[0].trim().charAt(0)).toUpperCase() + allFood[0].trim().substring(1);
          goodFood[i] = allFood[1].trim();
          goodFood[i + 1] = String.valueOf(allFood[1].trim().charAt(0)).toUpperCase() + allFood[1].trim().substring(1);
        }
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m * 2; j++) {
            Notebook[i] = Notebook[i].replaceAll(dangerFood[j], goodFood[j]);
          }
        }
    
        for (String line : Notebook) {
          System.out.println(line);
        }
      }
    
    
}
