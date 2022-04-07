package _07_abstract_class_and_interface.practice.animal_and_interface_edible.animals;

import _07_abstract_class_and_interface.practice.animal_and_interface_edible.edible.Edible;

public class Chicken extends Animals implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
