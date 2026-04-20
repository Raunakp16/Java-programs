class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running...");
        for (int i = 1;i<=5;i++){
            System.out.println(" Value of i : " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args){
        // Creating object of the thread class
        MyThread t1 = new MyThread();

        //Starting the thread
        t1.start();

        System.out.println("Main thread is running ");
    }
}
