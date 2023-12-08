package com.solvd.connectionpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {
    private static final int POOL_SIZE = 5;
    private final BlockingQueue<MyConnection> pool;
    private static ConnectionPool instance;

    private ConnectionPool() {
        pool = new LinkedBlockingQueue<>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            pool.add(new MyConnection());
        }
    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }

    // Correct the lazyInitialize method
    public static ConnectionPool lazyInitialize(int poolSize) {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool(poolSize);
                }
            }
        }
        return instance;
    }

    // Add a constructor that accepts poolSize
    private ConnectionPool(int poolSize) {
        pool = new LinkedBlockingQueue<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            pool.add(new MyConnection());
        }
    }

    public MyConnection getConnection() throws InterruptedException {
        return pool.take();
    }

    public void releaseConnection(MyConnection connection) throws InterruptedException {
        pool.put(connection);
    }
}
