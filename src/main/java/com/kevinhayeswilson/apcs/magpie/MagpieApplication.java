package com.kevinhayeswilson.apcs.magpie;

import com.kevinhayeswilson.apcs.magpie.resources.GreetingResource;
import com.kevinhayeswilson.apcs.magpie.resources.ReplyResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * The main class of a DropWizard wrapper around {@link com.kevinhayeswilson.apcs.magpie.IMagpie}'s
 * so that the chatbot can be run in REST environment.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class MagpieApplication extends Application<MagpieConfig> {

    public static void main(String[] args) throws Exception {
        new MagpieApplication().run(args);
    }


    @Override
    public void initialize(Bootstrap<MagpieConfig> magpieConfigBootstrap) {
        // no-op
    }

    @Override
    public void run(MagpieConfig magpieConfig, Environment environment) throws Exception {
        final Object objMagpie = this.getClass()
                                     .getClassLoader()
                                     .loadClass(magpieConfig.getMagpie())
                                     .newInstance();
        if (!(objMagpie instanceof IMagpie)) {
            throw new IllegalStateException("You must pass the fully qualified name an IMagpie "
                                            + "the config yaml.");
        }
        final IMagpie magpie = (IMagpie) objMagpie;

        final GreetingResource greetingResource = new GreetingResource(magpie);
        final ReplyResource replyResource = new ReplyResource(magpie);

        environment.jersey().register(greetingResource);
        environment.jersey().register(replyResource);
    }
}
