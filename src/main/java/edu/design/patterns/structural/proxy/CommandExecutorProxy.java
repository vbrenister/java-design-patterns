package edu.design.patterns.structural.proxy;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        isAdmin = "Victor".equalsIgnoreCase(user) && "12345".equals(pwd);
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
