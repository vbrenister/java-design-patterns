package edu.design.patterns.behaviour.chainofresp;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 50) {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispending " + num + " 50$ note");
            if (remainder != 0) {
                chain.dispense(new Currency(remainder));
            } else {
                chain.dispense(cur);
            }
        }
    }
}
