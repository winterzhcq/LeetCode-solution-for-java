class Foo {
    public Semaphore SemFrist = new Semaphore(0);
    public Semaphore semTwo = new Semaphore(0);
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        SemFrist.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        SemFrist.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        semTwo.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        semTwo.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}