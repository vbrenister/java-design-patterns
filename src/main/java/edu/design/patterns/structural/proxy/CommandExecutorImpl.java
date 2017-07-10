package edu.design.patterns.structural.proxy;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
