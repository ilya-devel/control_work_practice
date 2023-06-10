package View;

import java.util.Scanner;

public class GetAnswer {
    public static int ChoiceInMenu() {
        int choice = -1;
        while (choice == -1) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("--> ");
                choice = in.nextInt();
            } catch (Exception ex) {
                System.out.println("Invalid input! Try Again.");
            }
        }
        return choice;
    }

    public static boolean ConfirmData (String data) {
        String ans;
        while (true) {
            System.out.println("Вы подтверждаете следующие данные:");
            System.out.println("\t" + data);
            System.out.println("y/n");
            System.out.print("--> ");
            Scanner in = new Scanner(System.in);
            ans = in.nextLine();
            try {
                if (ans.equals("y") || ans.equals("n")) {
                    return ans.equals("y");
                } else {
                    throw new Exception("Invalid input");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + " Try Again");
            }
        }
    }
}
