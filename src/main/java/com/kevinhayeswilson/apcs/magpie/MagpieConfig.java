package com.kevinhayeswilson.apcs.magpie;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.validator.constraints.NotEmpty;

import io.dropwizard.Configuration;

/**
 * Teh config for the {@link com.kevinhayeswilson.apcs.magpie.MagpieApplication}. There is only
 * one property, which is which implementation of an {@link com.kevinhayeswilson.apcs.magpie
 * .IMagpie} you would like to run, the {@link #magpie} parameter.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class MagpieConfig extends Configuration {

    /**
     * The fully-qualified name of the implementation of {@link com.kevinhayeswilson.apcs.magpie
     * .IMagpie} with which you would like to run the application.
     */
    @NotEmpty
    private String magpie;

    @JsonProperty
    public String getMagpie() {
        return magpie;
    }

    @JsonProperty
    public void setMagpie(String magpie) {
        this.magpie = magpie;
    }

}
