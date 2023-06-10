package Classes;

import java.util.LinkedList;

abstract public class Animal {
    private String name;
    private String typeAnimal;
    private String kindAnimal;
    private LinkedList<String> commands;

    public Animal(String name) {
        setName(name);
        createEmptyListCommands();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public void setKindAnimal(String kindAnimal) {
        this.kindAnimal = kindAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String getKindAnimal() {
        return kindAnimal;
    }

    public String getCommands() {
        return String.join(", ", this.commands);
    }

    public void createEmptyListCommands() {
        this.commands = new LinkedList<>();
    }

    public void addCommand(String command) {
        this.commands.add(command);
        System.out.println(
                getName() + " learned new command: " + command
        );
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getTypeAnimal() + '\'' +
                ", typeAnimal='" + getTypeAnimal() + '\'' +
                ", kindAnimal='" + getKindAnimal() + '\'' +
                ", commands=" + getCommands() +
                '}';
    }
}
