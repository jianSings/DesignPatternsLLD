package DesignPatternsLLD.DesignPatterns.Creational.Singleton;

public class EagerDbConnection {
    private static EagerDbConnection eagerDbConnection = new EagerDbConnection();

    private EagerDbConnection() {
        System.out.println("Initialized Eager Db Connection");
    }

    public static EagerDbConnection getInstance() {
        return eagerDbConnection;
    }
}
