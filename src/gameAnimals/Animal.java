package gameAnimals;

public class Animal {

    public static final int VISIBILITY = 2;  //видимость - кол-во клеток, не включая свою

    private int life = 2;

    private boolean tiredness = false;  //усталости нет

    public boolean isTiredness() {
        return tiredness;
    }

    public void setTiredness(boolean tiredness) {
        this.tiredness = tiredness;
    }


    public void hungry() {
        life--;
    }

    public void full(){
        life = 2;
    }

    public boolean checkDeath(){
        return life<=0;
    }

    public void recuperation(){  //восстановление сил
        tiredness = false;  //усталости нет
    }

}


