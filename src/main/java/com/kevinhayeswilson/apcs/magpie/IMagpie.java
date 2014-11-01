package com.kevinhayeswilson.apcs.magpie;

/**
 * An interface that represents the Magpie in the AP CS magpie project.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public interface IMagpie {

    /**
     * Return a greeting for somebody just opening the door to your chatbot!
     *
     * @return A greeting.
     */
    String getGreeting();

    /**
     * Return a reply to a statement that someone makes.
     *
     * @param statement The user's statement
     * @return You magpie's reply
     */
    String getReply(String statement);

}
