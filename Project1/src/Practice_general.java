
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen{
    public void write(){
        System.out.println("Writing");
    };
    public void refill(){
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }

}
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface BasicHuman{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicHuman{
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
    void greet(){
        System.out.println("Greeting");
    }
}

public class Practice_general {
    public static void main(String[] args) {
//        fountainPen Pen = new fountainPen();
//        Pen.refill();
        Human human = new Human();
        human.sleep();
        human.bite();
    }
}
