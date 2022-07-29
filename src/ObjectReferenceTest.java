public class ObjectReferenceTest {

public void modify(Balloon balloon){

    balloon.setColor("Red");

    balloon=new Balloon("White");
    balloon.setColor("green");
}


    public static void main(String[] args) {

    ObjectReferenceTest o=new ObjectReferenceTest();
    Balloon balloon=new Balloon("Yellow");

        System.out.println(balloon.getColor());
        o.modify(balloon);


        System.out.println(balloon.getColor());

    }

}


class Balloon{

    String color;

    public Balloon(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}