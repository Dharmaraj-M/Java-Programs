package com.trustrace;

class Coffee {
    boolean state = false;
    synchronized void getCoffee() {
        while (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Coffee Collected...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Coffee Consumed...");
        state = false;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        notify();
    }
    synchronized void makeCoffee() {
        while (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        state = true;
        System.out.println("Coffee Produced...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        notify();
    }
}

class CoffeeMachine implements Runnable {
    Coffee coffee;
    CoffeeMachine(Coffee coffee) {
        this.coffee = coffee;
        new Thread(this, "CoffeeMachine").start();
    }
    public void run() {
        while(true) {
            coffee.makeCoffee();
        }
    }
}

class Waiter implements Runnable {
    Coffee coffee;
    Waiter(Coffee coffee) {
        this.coffee = coffee;
        new Thread(this, "Waiter").start();
    }
    public void run() {
        while(true) {
            coffee.getCoffee();
        }
    }
}

class CoffeeShopSimulation {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        new CoffeeMachine(coffee);
        new Waiter(coffee);
    }
}
