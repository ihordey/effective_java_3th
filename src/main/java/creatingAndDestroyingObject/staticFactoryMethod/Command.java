package creatingAndDestroyingObject.staticFactoryMethod;

public interface Command {
    enum Type {
        EMPTY, LIGHT_ON, LIGHT_OFF;
    }

    void execute();

    static Command getCommand(Type type) {
        switch (type) {
            case LIGHT_ON: {
                return new EmptyCommand.LightOnCommand();
            }
            case LIGHT_OFF: {
                return new EmptyCommand.LightOffCommand();
            }
            default:
                return new EmptyCommand();
        }
    }

    static class EmptyCommand implements Command {
        public void execute() {
            System.out.println("EMPTY command");
        }


        static class LightOnCommand implements Command {
            public void execute() {
                System.out.println("LIGHT ON command");
            }
        }

        static class LightOffCommand implements Command {
            public void execute() {
                System.out.println("LIGHT OFF command");
            }
        }
    }
}
