package Geekbrains.lesson_5.homework;


public class Dog extends Animals {

    private int Dogsvim = 10;
    private int Dogran = 400;
    private float Dogjump = 0.5f;
    public Dog(String name, int swim, int run, float jump) {
        super(name, swim, run,jump);
        System.out.print(name+" jump " +jump +" run "+run+" swim "+swim+" \n");
        if (swim <= Dogsvim && run <= Dogran && jump<=Dogjump) {
            loss = true;
        } else { loss = false; }
    }
    public Dog(String name, int swim, float jump, int run) {
        super(name, swim, run,jump);
        System.out.print(name+" jump " +jump +" run "+run+" swim "+swim+" \n");
        if (swim <= Dogsvim+10 && run <= Dogran+200 && jump<=Dogjump+0.4f) {
            loss = true;
        } else { loss = false; }
} }