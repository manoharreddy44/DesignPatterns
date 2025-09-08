package CreationalDesignPatterns.Singleton.AfterSingleton;

class Logger {
    private static Logger instance;  // single instance

    private Logger() {
        // private constructor
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

// Eager Initialization
/*class Logger {
    private static final Logger instance = new Logger(); // created eagerly

    private Logger() {}

    public static Logger getInstance() {
        return instance;
    }
}
 */

 //Lazy Initialization
 /*
  * class Logger {
    private static volatile Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) { // Double-checked locking
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}
*/
