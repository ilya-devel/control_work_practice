package Control;

import Classes.Animal;
import Classes.Animals.*;

import java.util.LinkedList;

import static View.GetAnswer.*;
import static View.Menus.*;

public class RunApp {
    static String notPoint = "Такого пункта в меню нет, попробуйте ещё раз";

    public static void Run() {
        LinkedList<Animal> lstAnimals = new LinkedList<>();
        while (true) {
            MainMenu();
            int choice = ChoiceInMenu();
            switch (choice) {
                case 1 -> {
                    System.out.println("Начинаем процедуру добавления животного");
                    Animal tmp = AddAnimal();
                    if (tmp != null) {
                        lstAnimals.add(tmp);

                    }
                }
                case 2 -> {
                    System.out.println("Вы хотите обучить новое животное или оставленное ранее (y/n)");
                    System.out.println();
                }
                case 3 -> {
                    if (lstAnimals.size() != 0) {
                        System.out.println("Ниже список животных, которых сдали в питомник:\n");
                        ShowListAnimals(lstAnimals);
                    }
                    else System.out.println("На данный момент питомник не содержит животных\n");
                }
                case 4 -> System.out.println("Какое животное из списка ниже вы хотите узнать лучше");
                case 0 -> {
                    System.out.println("До свидания");
                    return;
                }
                default -> System.out.println(notPoint);
            }
        }
    }

    public static Animal AddAnimal() {
        System.out.println("Введите имя животного:");
        String name = GetString();
        while (true) {
            TypeAnimalMenu();
            int choiceType = ChoiceInMenu();
            switch (choiceType) {
                case 1:
                    //noinspection TextLabelInSwitchStatement
                    loopPets:
                    while (true) {
                        ShowKindPets();
                        int choiceKind = ChoiceInMenu();
                        switch (choiceKind) {
                            case 1:
                                return new Dog(name);
                            case 2:
                                return new Cat(name);
                            case 3:
                                return new Hamster(name);
                            case 0:
                                break loopPets;
                            default:
                                System.out.println(notPoint);
                                break;
                        }
                    }
                    break;
                case 2:
                    //noinspection TextLabelInSwitchStatement
                    loopPackAnimal:
                    while (true) {
                        ShowKindPackAnimals();
                        int choiceKind = ChoiceInMenu();
                        switch (choiceKind) {
                            case 1:
                                return new Horse(name);
                            case 2:
                                return new Donkey(name);
                            case 3:
                                return new Camel(name);
                            case 0:
                                break loopPackAnimal;
                            default:
                                System.out.println(notPoint);
                                break;
                        }
                    }
                    break;
                case 0:
                    return null;
                default:
                    System.out.println(notPoint);
            }
        }
    }
}
