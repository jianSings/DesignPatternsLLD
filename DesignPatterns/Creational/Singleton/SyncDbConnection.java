package DesignPatternsLLD.DesignPatterns.Creational.Singleton;

public class SyncDbConnection {
    private static SyncDbConnection syncDbConnection;

    private SyncDbConnection() {
        System.out.println("Inside Sync Db Connection");
    }

    synchronized public static SyncDbConnection getInstance() {
        if (syncDbConnection == null) {
            syncDbConnection = new SyncDbConnection();
        }
        return syncDbConnection;
    }
}
