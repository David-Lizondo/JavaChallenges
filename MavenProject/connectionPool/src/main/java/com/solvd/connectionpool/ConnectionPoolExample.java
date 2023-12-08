package com.solvd.connectionpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConnectionPoolExample {

    public static void main(String[] args) {
        int poolSize = 5;
        ConnectionPool connectionPool = ConnectionPool.lazyInitialize(poolSize);

        ExecutorService threadPool = Executors.newFixedThreadPool(7);

        try {
            for (int i = 0; i < 5; i++) {
                threadPool.execute(new ConnectionUserTask(connectionPool));
            }

            for (int i = 0; i < 2; i++) {
                threadPool.execute(new ConnectionUserTask(connectionPool));
            }
        } finally {
            // Shutdown the thread pool once all tasks are submitted
            threadPool.shutdown();
        }
    }

    static class ConnectionUserTask implements Runnable {
        private final ConnectionUser connectionUser;

        public ConnectionUserTask(ConnectionPool connectionPool) {
            this.connectionUser = new ConnectionUser(connectionPool);
        }

        @Override
        public void run() {
            connectionUser.useConnection();
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
                // Use the connection (perform database operations)
                connectionPool.releaseConnection(connection);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
