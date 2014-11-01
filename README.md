Magpie Chatbot
==============

The AP CS Curriculum calls for a lab in which students implement a chatbot. That's neat, but
it has them interact with it on the command line. Wouldn't it be a lot better if they could
interact with it in a browser? Or just generally across http?

Well, look no farther. Here's a DropWizard wrapper around a simple IMagpie interface. Note
that using this project will like introduce some more complications (what the heck is an
interface?!), but conveniently you're going to have deal with that about 2 weeks from when
you get to this project because you'll be covering Lists. So perhaps it's not so bad.

Basic instructions
----------------

This is a maven project. If you don't have maven setup, then please read [the getting
started guide](http://maven.apache.org/guides/getting-started/) or search for help
on Google.

Once maven is setup, then this guy is pretty simple to run:

```
git clone git@github.com:khwilson/magpie.git
cd magpie
mvn clean package
java -jar target/magpie-0.1.jar server src/main/resources/basicConfig.yml
```

Now you should have a Magpie bot running on port 8080. Find out if that's the case, e.g.,
by running

```
curl http://localhost:8080/greeting
```

You should see a simple reply `Hi`.

And for the more general reply, try

```
curl -d 'statement="you there?"' http://localhost:8080/reply
```

You should see the reply `You just said "you there?"`.

Extending
---------

Suppose that you have a Magpie located at `$MAGPIE`. Then you should do the following:
1. On the first line of the file, add the package path `package com.kevinhayeswilson.apcs.magpie;`
2. Make sure your class implements `IMagpie`.
3. `cp $MAGPIE src/main/java/com/kevinhayeswilson/apcs/magpie`
4. `echo "magpie: com.kevinhayeswilson.apcs.magpie.MyMagpie" > myConfig.yml` where `MyMagpie` is the name of your `IMagpie` class.
5. `mvn clean package`
6. java -jar target/magpie-0.1.jar server myConfig.yml

And now your magpie is up and chatting.

Quering via AJAX
----------------

Of course, the whole purpose of this is to have a nice web interface to your chatbot. To get that
going..... `raise NotImplementedError`
