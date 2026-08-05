package org.tnsif.acc.c2tc.basic_java;
class Singleton {
    private static Singleton obj;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

    public void display() {
        System.out.println("Singleton Object Created");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.display();
    }
}