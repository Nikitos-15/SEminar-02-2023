package Seminar_3OOP;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
       User user1 = new User("Petr", "Petrov",32 );
        User user2 = new User("Ivan", "Ivanov",24 );
        User user3 = new User("Anna", "Anina",44 );
        User user4 = new User("Step", "Shilov",64 );
        User user5 = new User("Niki", "Sokol",45 );
        User user6 = new User("Ben", "India",42 );
        User user7 = new User("Alex", "Pid",23 );


       Personal personal = new Personal(List.of(user1,user2, user3,user4, user5, user6, user7));
     //  for (User user : personal){
      //     System.out.println(user);
       //}

       List<User> users = personal.toList();
        Collections.sort(users);
//       for (User user : users){
//            System.out.println(user);
//        }


        User boss = new User("Will","Smith", 68);
        User Ctc = new User("Antosha", "Shimol", 63 );
        User cec = new User("Joel", "Dinas", 45);
        User Manager1 = new User("Jane", "Air", 23);
        User Manager2 = new User("Bella","Green",30);
        User Manager3 = new User("Alex","Bright", 20);
        Personal managers1 = new Personal(List.of(Manager1,Manager2));
        Personal managers2 = new Personal(List.of(Manager3));
        Personal Shef = new Personal(List.of(cec,Ctc));
        boss.setPersonal(Shef);
        cec.setPersonal(managers1);
        Ctc.setPersonal(managers2);

        Company company = new Company (boss);
        for (User user: company){
            System.out.println(user);
        }
    }
}
