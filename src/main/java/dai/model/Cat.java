package main.java.company.model;
public class Cat extends Animal{
    public Cat(int age,double weight){
        super(age,weight);
    }
    public void meow(){
        System.out.println("喵喵喵~");
    }
}
