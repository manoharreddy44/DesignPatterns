package StructuralDesignPatterns.DecoratorPattern.BeforeDecorator;

class MilkCoffee extends SimpleCoffee {
    public String getDescription() { return "Simple Coffee + Milk"; }
    public double getCost() { return 6.0; }
}
