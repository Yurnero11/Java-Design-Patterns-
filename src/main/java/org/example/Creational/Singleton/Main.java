package org.example.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("first log...");
        ProgramLogger.getProgramLogger().addLogInfo("second log...");
        ProgramLogger.getProgramLogger().addLogInfo("last log...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
