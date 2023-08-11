package Seminar_2;

public abstract class Predactor extends Animal{

    public Predactor(String nickname){
        super(nickname);
    }

    public String feed(){
        return "meet" ;
    }
}
