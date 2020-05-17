package com.example.demo.DAO;

import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeRepo implements FakeRepoInterface {

    //
    private static Map<Integer, User> array;


    static{
        array=new HashMap<Integer, User>(){
            {
                put(1,new User(1001, "Mbajwana", "Mkhize"));

                put(2,new User(1002, "Sbusiso" , "Mhlongo"));

                put(3,new User(1003, "Xolani","Sbiya" ));
                put(4,new User(1004, "Ayabonga","Zungu"));

                put(5,new User(1005,"Nomfundo","Ngwenya" ));
            }
        };
    }

    @Override
    public void insertUser(long id, String name, String surname) {
        // Add the user
        array.put((int) id , (User) array);
    }

    @Override
    public String findUserById(long id) {
        // find object by value
        return "Hello " + array.get((int) id).getName()+" " + array.get((int) id).getSurname();
    }

    @Override
    public void deleteUser(long id) {
        // removes object's values or entities
        String name = array.get((int) id).getName()+" " + array.get((int) id).getSurname();
        array.remove((int)id);
        System.out.println("User "+ name + " deleted");
    }
}