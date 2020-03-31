// -*- coding: utf-8 -*-
//Created on Sat Mar 31 18:04:52 2020
//
//@author: vishesh

class Demo
{
    int x;
    boolean flag = false;

    public synchronized void put(int x)
    {
        while(flag)
        {
        try {wait();}
        catch(Exception e) {}
        }
        System.out.println("Produced = "+x);
        this.x = x;
        flag = true;
        notify();
    }

    public synchronized void get()
    {
            while(!flag)
            {
            try {wait();} catch(Exception e) {}
            }
            System.out.println("Consumed = "+x);
            flag = false;
            notify();
    }
}

class producer implements Runnable
{
    Demo D;
    public producer(Demo D) {
        this.D = D;
        Thread t1 = new Thread(this, "Producer");
        t1.start();
    }
    public void run(){
        int i = 1;
        while(true) {
            D.put(i++);
            try {Thread.sleep(1000);} catch(Exception e) {}
        }
    }
}



class consumer implements Runnable{

    Demo D;

    public consumer(Demo D) {
        this.D = D;
        Thread t2 = new Thread(this, "Consumer");
        t2.start();

    }

    public void run() {
        while(true) {
            D.get();
            try {Thread.sleep(1000);} catch(Exception e) {}
        }



    }
}



 class threadDemo
{
    public static void main(String[] args)
    {
        Demo D = new Demo();
        new producer(D);
        new consumer(D);
    }
}