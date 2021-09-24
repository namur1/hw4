package com.company;

public class Main {

    public static void main(String[] args) {


        AllowAndForbid( -10, generateRandomAge());

        AllowAndForbid( -19, generateRandomAge());

        AllowAndForbid( 19, generateRandomAge());

        AllowAndForbid( -13, generateRandomAge());

        AllowAndForbid( 28, generateRandomAge());

        generateRandomAge();

    }

    public static int AllowAndForbid( int temperature, int rand) {
        if ((rand < 45 && temperature < 30) && (temperature > -21 && rand > 19)) {
            // ( f + t ) * ( t + f) = t * t = t
            System.out.println("Можно идти гулять");
        } else {
            home();
        }
        if (rand < 21 && temperature > 0 && temperature < 29) {
            System.out.println("Можно идти гулять");
        } else {
            home();
        }
        if (rand > 45 && temperature > -11 && temperature < 26) {
            System.out.println("Можно идти гулять");
            emptyline();
        } else {
            home();
            emptyline();
        }
        return temperature;
    }

    public static void home() {
        System.out.println("Оставайтесь дома");
    }

    public static void emptyline() {
        System.out.println();
        // Я это написал для того, что бы не сливались 5 различных данных
    }
    public static int generateRandomAge(){
        int min = 0;
        int max = 101;
        int randomage = min + (int) (Math.random() * max);
        System.out.println(randomage);
        return randomage;
    }
}
