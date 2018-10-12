package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
<<<<<<< HEAD
        System.out.println( "Hello World!, Welcome to Channel Store" );
=======
        System.out.println( "Hello Welcome to Channel Store Comcast!" );
>>>>>>> e691f5d9a1c3d156855611e186231ed82beda73c

        System.out.println("A NullPointerException is a drag...");
        Object myObject = null;
        /**
         * Checker prevents this from compiling...
         */
//        System.out.println("myObject: " + myObject.toString());
        /**
         * ... which is simply fantastic. It shows:
         *
         * error: [dereference.of.nullable] dereference of possibly-null
         * reference myObject
         *
         * http://checkerframework.org
         */
        System.out.println("... but thankfully, Checker has our back: http://checkerframework.org");
    }
}
