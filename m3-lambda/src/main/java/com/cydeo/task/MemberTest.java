package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {
        Person p1 =new Person("Mike",25,Gender.MALE);
        Person p2 =new Person("July",31,Gender.FEMALE);
        Person p3=new Person("Anna",15,Gender.FEMALE);
        Person p4 =new Person("Ozzy",37,Gender.MALE);

        List<Person> list = Arrays.asList(p1,p2,p3,p4);

        CheckMember check = c -> c.getGender() == Gender.MALE && c.getAge() >= 18 && c.getAge()<=25;
        print(list,check);




    }

    private static void print(List<Person> personList, CheckMember c){
        List<Person> result = new ArrayList<>();
        for (Person each : personList){
            if(c.check(each)){
                result.add(each);
            }
        }
        System.out.println(result);
    }
}
