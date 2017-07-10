package edu.design.patterns.behaviour.chainofresp;

/**
 * Created by vbrenister on 7/10/2017.
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
