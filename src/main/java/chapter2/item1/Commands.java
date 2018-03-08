package chapter2.item1;

import lombok.extern.slf4j.Slf4j;

public class Commands {
    enum Type {
        LIGHT_ON, LIGHT_OFF;
    }

    private Commands() {
    }


    public static Command getCommand(Type type) {
        switch (type) {
            case LIGHT_ON:
                return new EmptyCommands.LightOnCommand();
            case LIGHT_OFF:
                return new EmptyCommands.LightOffCommand();
            default:
                return new EmptyCommands();
        }
    }

    @Slf4j
    private static class EmptyCommands implements Command {
        public void execute() {
            log.info("EMPTY command");
        }

        @Slf4j
        private static class LightOnCommand implements Command {
            public void execute() {
                log.info("LIGHT ON command");
            }
        }

        @Slf4j
        private static class LightOffCommand implements Command {
            public void execute() {
                log.info("LIGHT OFF command");
            }
        }
    }
}
