package DesignPatternsLLD.DesignPatterns.Creational.Singleton;

public class DoubleLockingDbConnection {
    private static DoubleLockingDbConnection doubleLockingDbConnection;

    private DoubleLockingDbConnection() {
        System.out.println("Inside Double locking Db Connection");
    }

    public static DoubleLockingDbConnection getInstance() {
        if (doubleLockingDbConnection == null) {
            synchronized (DoubleLockingDbConnection.class) {
                if (doubleLockingDbConnection == null) {
                    doubleLockingDbConnection = new DoubleLockingDbConnection();
                }
            }
        }
        return doubleLockingDbConnection;
    }
}
