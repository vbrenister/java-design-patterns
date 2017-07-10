package edu.design.patterns.structural.proxy;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("victor", "12345");

        try {
            executor.runCommand("rm - rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
