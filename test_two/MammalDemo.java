class Mammal{
    String body_cover = "fur";
    int number_of_legs = 4;
    public void produceSound(){
        System.out.println("Animals produce different sounds");
    }
}

class Lion extends Mammal{
    public void produceSound(){
        System.out.println("Lion roars");
    }
}

class Human extends Mammal{
    String body_cover = "hair";
    int number_of_legs = 2;
    public void produceSound(){
        System.out.println("Humans make different sounds such as whistling, talking and drumming");
    }
}

public class MammalDemo{
    public static void main(String[] args) {
        System.out.println("Animals produce different sounds");
        System.out.println();
        Lion simba = new Lion();
        System.out.println("Lion Class");
        System.out.println("Body Cover: " + simba.body_cover);
        System.out.println("No of legs: " + simba.number_of_legs);
        simba.produceSound();

        System.out.println();
        Human ko = new Human();
        System.out.println("Human Class");
        System.out.println("Body Cover: " + ko.body_cover);
        System.out.println("No of legs: " + ko.number_of_legs);
        ko.produceSound();
    }
}