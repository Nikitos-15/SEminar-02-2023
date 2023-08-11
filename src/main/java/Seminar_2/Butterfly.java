package Seminar_2;

public class Butterfly extends herbivores implements Flyable{
    public Butterfly(String nickname){
        super(nickname);

    }
    public String toString() {
        return "i`m Butter "+ super.toString()+ " My speed is " + speedOfFly();
    }

    public String say(){
        return "жух ";
    }

    @Override
    public int speedOfFly(){
        return 10;
    }
}
