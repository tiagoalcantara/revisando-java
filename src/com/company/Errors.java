package com.company;

import java.util.Random;

class MyException extends Error {
    public MyException(){
        super("Meu erro customizado...");
    }
}

public class Errors {
    public static void throwsError() throws Exception{
        System.out.println("Estou tentando meu melhor");
        Random rand = new Random();
        int generatedNumber = rand.nextInt(3);

        if(generatedNumber == 0) {
            throw new Exception("Exceção genérica");
        } else if (generatedNumber == 1) {
            throw new MyException();
        } else {
            System.out.println(5/0);
        }

        System.out.println("Mas não é o suficiente");
    }

    public static void main(String[] args) {
        try {
            throwsError();
        } catch(MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Deu ruim essa conta ai");
        } catch (Exception e) {
            System.out.println("Genérica...");
            System.out.println(e.getMessage());
        }
    }
}
