package dayTwo.ClassificationOfAnimals;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Created by student on 28-Jun-16.
 */
public class Animal {

    private String animalName;
    private boolean femaleAndMale;
    private int age;
    private boolean herbivore;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  Animal(){}
    public Animal (String animalName, int age, boolean femaleAndMale, boolean herbivore){
        this.animalName = animalName;
        this.age = age;
        this.femaleAndMale = femaleAndMale;
        this.herbivore = herbivore;
    }


    @Override
    public String toString()
    {
        return "\nAnimal Name:  " + animalName + " " + age + "\nFemale and Male species available? :" + femaleAndMale + "\nIs a Herbivore? :" + herbivore;
    }
}
