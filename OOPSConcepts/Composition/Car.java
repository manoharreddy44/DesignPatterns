//Stronger form ofAggregation -> part canoot exist without the whole.
//If the container is destroyed, contained onjects are destroyed too.

package OOPSConcepts.Composition;

class Car {
    private Engine engine; // Composition

    Car() {
        this.engine = new Engine(); // created inside
    }

    void start() {
        engine.start();
        System.out.println("Car is running");
    }
}
