package com.solvd.connectionpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConnectionPoolExample {

    public static void main(String[] args) {
        int poolSize = 5;
        ConnectionPool connectionPool = ConnectionPool.lazyInitialize(poolSize);

        ExecutorService threadPool = Executors.newFixedThreadPool(7);

        try {
            for (int i = 0; i < 5; i++) {
                threadPool.execute(new ConnectionUserTask(connectionPool, i + 1));
            }

            for (int i = 0; i < 2; i++) {
                threadPool.execute(new ConnectionUserTask(connectionPool, i + 6));
            }
        } finally {
            // Shutdown the thread pool once all tasks are submitted
            threadPool.shutdown();

            try {
                // Wait for all threads to finish
                threadPool.awaitTermination(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ConnectionUserTask implements Runnable {
        private final ConnectionUser connectionUser;
        private final int taskId;

        public ConnectionUserTask(ConnectionPool connectionPool, int taskId) {
            this.connectionUser = new ConnectionUser(connectionPool);
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " started");
            connectionUser.useConnection();
            System.out.println("Task " + taskId + " completed");
        }
    }

    static class ConnectionUser {
        private final ConnectionPool connectionPool;

        public ConnectionUser(ConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
        }

        public void useConnection() {
            try {
                MyConnection connection = connectionPool.getConnection();
                System.out.println("Task is using connection: " + connection);
                // Simulate some work with the connection
                Thread.sleep(1000);
                connectionPool.releaseConnection(connection);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
