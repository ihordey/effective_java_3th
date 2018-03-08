package chapter2.item1;

public class CommandMain {

    public static void main(String[] args) {
        Commands.getCommand(Commands.Type.LIGHT_ON).execute();
        Commands.getCommand(Commands.Type.LIGHT_OFF).execute();
    }
}
