package com.kevinhayeswilson.apcs.magpie;

/**
 * A simple implementation of the {@link com.kevinhayeswilson.apcs.magpie.IMagpie} interface.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class ExampleMagpie implements IMagpie {

    @Override
    public String getGreeting() {
        return "Hi";
    }

    @Override
    public String getReply(String statement) {
        return String.format("You just said \"%s\"", statement);
    }
}
