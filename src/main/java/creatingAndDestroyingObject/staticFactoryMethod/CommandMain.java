package creatingAndDestroyingObject.staticFactoryMethod;

public class CommandMain {

    public static void main(String[] args) {
        Command.getCommand(Command.Type.LIGHT_ON).execute();
        Command.getCommand(Command.Type.LIGHT_OFF).execute();
    }
}
