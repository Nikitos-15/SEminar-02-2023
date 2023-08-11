package Seminar_2;

public class Cat extends Predactor implements Runable {

     public Cat(String nickname){
         super(nickname);
     }
      public String toString(){
         return "I`m cat "+ super.toString() + " My speed is " + speedOfRun();
      }

    @Override
    public String say() {
        return  "мяу мяу ";
    }

    @Override
    public int speedOfRun(){
        return 15;
    }
}
