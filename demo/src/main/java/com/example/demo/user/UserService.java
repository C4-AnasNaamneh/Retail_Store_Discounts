package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class UserService {

    private List <User> userList = new ArrayList<>(Arrays.asList(

            new User("1","anas",UserType.EMPLOYEE,0,700,0),
            new User("2","farhan",UserType.CUSTOMER,0,900,0),
            new User("3","Jouza",UserType.EMPLOYEE,0,650.50,0),
            new User("4","omar",UserType.CUSTOMER,0,300.20,0)

    ));


    public List <User> getAllUsers(){

         userList.stream().forEach((element)->{
               element.setDiscount( element.getType());
               element.setNetAmount(element.getTotal());
         });

        return userList;

        }



    public Stream<User> getUserById(String id) {
        userList.stream().forEach((element)->{
            element.setDiscount( element.getType());
            element.setNetAmount(element.getTotal());
        });

        return  userList.stream().filter((element)-> element.getId().equals(id));
   }
}
