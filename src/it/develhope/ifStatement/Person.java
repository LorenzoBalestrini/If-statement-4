package it.develhope.ifStatement;

public class Person {

    public int age;

    public Person(){
       double random = Math.floor(Math.random()*(80-5+1)+5);
        this.age = (int) random;
    }

    public String getLifeStage(){
        if(age <=12){
            return "the person is a child";
        } else if(age >= 13 && age <= 19){
            return "the person is a teen";
        } else if (age >= 20 && age <= 59){
            return "the person is an adult";
        }else{
            return "the person is a senior adult";
        }
    }

}
