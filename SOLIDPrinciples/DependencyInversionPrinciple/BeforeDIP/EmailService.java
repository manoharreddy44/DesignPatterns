//High-level modules should not depend on low-level modules. Both should depend on abstractions.

// Abstractions should not depend on details. Details should depend on abstractions.

//In simple words → Instead of a class directly depending on another concrete class, it should depend on an interface/abstract class.

package SOLIDPrinciples.DependencyInversionPrinciple.BeforeDIP;

class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
