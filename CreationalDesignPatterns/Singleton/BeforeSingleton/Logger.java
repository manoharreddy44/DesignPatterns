//The Singleton ensures:
//Only one instance of a class exists.
//Provides a global access point to that instance.

package CreationalDesignPatterns.Singleton.BeforeSingleton;

public class Logger {
  public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
