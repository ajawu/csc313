class Ruler{
    public double length;
    public double breadth;
}

public class RulerDemo{
    static public void rulerModification(Ruler obj){
        obj.length = 50;
        obj.breadth = 5;
        System.out.println("Length of ruler: " + obj.length);
        System.out.println("Breadth of ruler: " + obj.breadth);
    }
    public static void main(String[] args) {
        Ruler demoObject = new Ruler();
        rulerModification(demoObject);
    }
}