package Seminar_2;

public abstract class herbivores extends Animal{

    public herbivores(String nickname) {
        super(nickname);

    }

    public String feed(){
        return "herb";
    }
}
