package Seminar_2;

public class Rabbit  extends herbivores implements Runable{
    public Rabbit(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "i`m rabbit "+ super.toString()+ " My speed is " + speedOfRun();

    }

    public String say(){
        return"asfas";
    }

    @Override
    public int speedOfRun(){
        return 25;
    }

}
