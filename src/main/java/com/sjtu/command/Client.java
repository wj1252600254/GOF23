package com.sjtu.command;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl(lightOnCommand, lightOffCommand);

        remoteControl.openLight();

        remoteControl.closeLight();
        remoteControl.undoLight();

    }
}
