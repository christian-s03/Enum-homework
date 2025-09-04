enum MenuOption {
    START {
        public void execute() {
            System.out.println("STARTING");
        }
    },
    STOP {
        public void execute() {
            System.out.println("STOPPED");
        }
    },
    EXIT {
        public void execute() {
            System.out.println("CLOSED");
        }
    };

    public abstract void execute();
}