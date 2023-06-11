package Classes;

public class Counter implements AutoCloseable{
    private static int counter = 0;

    public Counter() {
    }
    public static int getCounter() {
        return counter;
    }

    public void add() {
        counter ++;
    }

    @Override
    public void close() throws Exception {
        throw new RuntimeException("\"Отработало закрытие счётчика\"");
    }
}
