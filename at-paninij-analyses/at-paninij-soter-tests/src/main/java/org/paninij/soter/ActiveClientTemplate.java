package org.paninij.soter;

import org.paninij.soter.LeakyServer;
import org.paninij.lang.Capsule;
import org.paninij.lang.CapsuleSystem;
import org.paninij.lang.Local;
import org.paninij.lang.Root;

@Root
@Capsule
public class ActiveClientTemplate
{
    @Local LeakyServer server;
    Secret secret = new Secret();
    Integer integer = new Integer(42);
    
    public void run()
    {
        System.out.println("Starting `ActiveClient`.");
        
        server.giveSecret(secret);          // Unsafe
        server.giveSecret(new Secret());    // Safe

        server.giveInteger(integer);        // Safe (because Integer is transitively immutable)
        server.giveInteger(new Integer(7)); // Safe

        Secret s = server.getSecret();

        System.out.println("Stopping `ActiveClient`.");
    }
    
    public static void main(String[] args) {
        CapsuleSystem.start(ActiveClient.class.getName(), args);
    }
}