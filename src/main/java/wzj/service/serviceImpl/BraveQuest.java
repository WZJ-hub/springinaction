package wzj.service.serviceImpl;

import wzj.service.Quest;

import java.io.PrintStream;

public class BraveQuest implements Quest {
    private PrintStream printStream;

    public BraveQuest(PrintStream printStream){
        this.printStream=printStream;
    }

    public BraveQuest() {
    }

    @Override
    public void embark() {
        printStream.println("i am braveknight");
    }
}
