package Classes;

public class Counter implements AutoCloseable{
    private static int counter = 0;

    public Counter() {
    }
    public static int getCounter() {
        return counter;
    }

    public static void add() {
        counter ++;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Отработало закрытие счётчика");
    }
}
