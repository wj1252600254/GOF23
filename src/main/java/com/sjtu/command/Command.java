package com.sjtu.command;

public interface Command {
    public void execute();

    public void undo();
}
