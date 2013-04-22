EnhancedKick
============

Kick extremely annoying players in a much more satisfying fashion

Note: I use fully-qualified type names instead of imports because I made myself the challange to do this in as few lines as possible. It doesn't have any other reason.

How to build
------------

Just compile the EnhancedKick.java file with javac (don't forget to add bukkit to the classpath), and put the resulting class into a .jar file, together with the plugin.yml.

How to use
----------

Just type /ckick \<username\> into chat. You will need the enhancedkick.kick permission.

How this works
--------------

As soon as the command is received, Packet61WorldEvent will be sent with the following payload:

- 2001 for "block break particles"
- 0 for x-coordinate
- 0 for y-coordinate
- 0 for z-coordinate
- 0x105 as an (invalid) block ID
- false

The invalid block ID will cause the client to crash immediatly.
