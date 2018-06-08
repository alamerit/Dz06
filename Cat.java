package Geekbrains.lesson_5.homework;


public class Cat extends Animals {

    private int catsvim = 0;
    private int catran = 200;
    private int catjump= 2;
    public Cat(String name, int swim, int run,int jump) {
        super(name, swim, run,jump);
        System.out.print(name+" jump " +jump +" run "+run+" swim "+swim+" \n");
        if(swim<=catsvim&&run<=catran&&jump<=catjump ){
        loss = true; }
        else { loss= false;}


        }
        }









