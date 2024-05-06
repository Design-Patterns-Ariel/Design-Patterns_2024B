package Threads;

public class TwoThread {

    public static void main(String[] args) {

        Server p = new Server();
        p.start();

        Thread t = new Thread(new printThread());
        t.start();

        while (true)
            System.out.println("Hello");


    }
}

class printThread implements Runnable{

    @Override
    public void run() {
        while(true)
            System.out.println("run from print-Thread");
    }
}


class Server extends Thread{

    @Override
    public void run() {
        while(true)
            System.out.println("run from Server");
    }
}