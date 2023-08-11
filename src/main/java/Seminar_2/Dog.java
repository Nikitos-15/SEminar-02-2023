package Seminar_2;

public class Dog extends Predactor implements Runable {
    public Dog(String nickname) {
        super(nickname);
    }


    public String toString() {
        return "i`m dog "+ super.toString()+ " My speed is " + speedOfRun();
    }

    public String say(){
        return "гав гав";
    }

    @Override
    public int speedOfRun(){
        return 20;
    }
}
