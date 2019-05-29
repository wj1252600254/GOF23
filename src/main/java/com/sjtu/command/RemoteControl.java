package com.sjtu.command;

public class RemoteControl {
    Command commandon;
    Command commandoff;
    Command commandundo;

    public RemoteControl(Command commandon, Command commandoff) {
        this.commandon = commandon;
        this.commandoff = commandoff;
    }

    public void openLight() {
        commandon.execute();
        commandundo = commandon;
    }

    public void closeLight() {
        commandoff.execute();
        commandundo = commandoff;
    }

    public void undoLight() {
        commandundo.undo();
    }
}
