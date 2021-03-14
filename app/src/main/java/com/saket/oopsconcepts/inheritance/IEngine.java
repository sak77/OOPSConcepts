package com.saket.oopsconcepts.inheritance;

/**
 * Interface is a contract between 2 or more classes that define what methods they
 * will implement.
 *
 * Below IEngine interface contains methods/properties for Engine.
 */
public interface IEngine {

    /*
    Interface members are treated as static final members. Hence you cannot have
    instance variables inside an interface.

    Generally speaking, interface should contain methods, an interface with only member
    variables is considered an ANTI-PATTERN.

    Refer this link for more details-
    https://stackoverflow.com/questions/7311274/attributes-member-variables-in-interfaces
     */
    enum EngineType {
        ELECTRIC, COMBUSTION, HYBRID
    }


    void startEngine();

    void stopEngine();
}
