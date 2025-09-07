//Clients should not be forced to depend on methods they do not use.
//That means → Instead of having fat interfaces with many methods, we should split them into smaller, specific interfaces.




package SOLIDPrinciples.InterfaceSegregationPrinciple.BeforeISP;

interface Bird {
    void fly();
    void swim();
    void run();
}
