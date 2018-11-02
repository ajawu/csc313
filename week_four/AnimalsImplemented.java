class Animal{
    private String type;
    private String sound;

    public void sound(){
        System.out.println("Animals have different sounds");
    }
}

class Goat extends Animal{
    public void sound(){
        System.out.println("Goats bleat");
    }
}

class Frog extends Animal{
    public void sound(){
        System.out.println("Frog Croaks");
    }
}