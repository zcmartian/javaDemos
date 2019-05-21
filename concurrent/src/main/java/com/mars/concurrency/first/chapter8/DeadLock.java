package com.mars.concurrency.first.chapter8;

public class DeadLock {

    private final Object lock = new Object();
    /**
     * 规避死锁： 不要出现多个锁重叠关系
     */
    private OtherService otherService;

    public DeadLock(OtherService otherService) {
        this.otherService = otherService;
    }

    public void m1() {
        synchronized (lock) {
            System.out.println("m1");
            otherService.s1();
        }
    }

    public void m2() {
        synchronized (lock) {
            System.out.println("m2");
        }
    }
}