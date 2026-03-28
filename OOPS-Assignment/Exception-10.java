class ThreadPrioritySystem {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread 1"));
        Thread t2 = new Thread(() -> System.out.println("Thread 2"));
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}