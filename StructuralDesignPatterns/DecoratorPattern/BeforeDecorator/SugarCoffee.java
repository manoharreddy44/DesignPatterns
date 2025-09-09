package StructuralDesignPatterns.DecoratorPattern.BeforeDecorator;

class SugarCoffee extends SimpleCoffee {
    public String getDescription() { return "Simple Coffee + Sugar"; }
    public double getCost() { return 5.5; }
}
