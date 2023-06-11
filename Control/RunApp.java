package Control;

import static View.GetAnswer.ChoiceInMenu;
import static View.Menus.MainMenu;

public class RunApp {
    public static void Run() {
        while (true) {
            MainMenu();
            int choice = ChoiceInMenu();
            switch (choice) {
                case 1:
                    System.out.println("Начинаем процедуру добавления животного");
                case 2:
                    System.out.println("Вы хотите обучить новое животное или оставленное ранее");
                case 3:
                    System.out.println("Какое животное из списка ниже вы хотите узнать лучше");
                case 0:
                    System.out.println("До свидания");
                    return;
                default:
                    System.out.println("Такого пункта в меню нет, попробуйте ещё раз");
            }
        }
    }
}
