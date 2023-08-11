package Seminar_2;

public class Duck extends herbivores implements Flyable,Runable{
    public Duck(String nickname){
        super(nickname);

    }
    public String toString() {
        return "i`m duck "+ super.toString()+ " My speed is " + speedOfRun() + " fly " +speedOfFly();
    }

    public String say(){
        return "Кря кря ";
    }

    @Override
    public int speedOfRun(){
        return 3;
    }

    @Override
    public int speedOfFly(){
        return 30;
    }
}
