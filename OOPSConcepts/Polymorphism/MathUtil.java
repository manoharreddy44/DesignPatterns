//Many forms: smae method name but different behaviors.
// Two types:
// compile-time (Overloading) -> same method, different parameters.
//Runtime (Overriding) -> child class changes parents method.

package OOPSConcepts.Polymorphism;

class MathUtil {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
