package in.conceptarchitect.calculator;

public class ConsoleDataProvider implements  DataProvider{
    @Override
    public int get(String name) {
        return Input.readInt(name);
    }
}
