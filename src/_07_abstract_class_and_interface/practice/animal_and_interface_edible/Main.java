package _07_abstract_class_and_interface.practice.animal_and_interface_edible;

import _07_abstract_class_and_interface.practice.animal_and_interface_edible.animals.Animals;
import _07_abstract_class_and_interface.practice.animal_and_interface_edible.animals.Chicken;
import _07_abstract_class_and_interface.practice.animal_and_interface_edible.animals.Tiger;
import _07_abstract_class_and_interface.practice.animal_and_interface_edible.edible.Apple;
import _07_abstract_class_and_interface.practice.animal_and_interface_edible.edible.Fruit;
import _07_abstract_class_and_interface.practice.animal_and_interface_edible.edible.Orange;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animals item : animals) {
            System.out.println(item.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
