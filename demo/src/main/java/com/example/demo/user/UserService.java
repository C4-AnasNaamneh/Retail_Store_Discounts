package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List <User> userList = new ArrayList<>(Arrays.asList(

            new User(1L,"anas",UserType.EMPLOYEE,0,700,0),

            new User(2L,"farhan",UserType.CUSTOMER,0,900,0),
            new User(3L,"farhan",UserType.EMPLOYEE,0,600,0),
            new User(4L,"omar",UserType.CUSTOMER,0,300,0)

    ));


    public List <User> getAllUsers(){

         userList.stream().forEach((element)->{
           if (UserType.CUSTOMER == element.getType()){
               element.setDiscount(UserType.CUSTOMER);

           } else{
               element.setDiscount(UserType.EMPLOYEE);

           }

             element.setNetAmount(element.getTotal());
             //setTotal(element.getNetAmount());
             //userList.get(2).setDiscount(element.UserType);



         });


        return userList;

        }



//    public User getUserById(Long id) {
//
//    }
}
