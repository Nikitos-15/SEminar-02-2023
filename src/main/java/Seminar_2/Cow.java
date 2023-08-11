package Seminar_2;

public class Cow  extends herbivores implements Runable{
    public Cow(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "i`m Cow " + super.toString() + " My speed is " + speedOfRun();

    }

    public String say(){
        return"my my";
    }
    @Override
    public int speedOfRun(){
        return 5;
    }

}