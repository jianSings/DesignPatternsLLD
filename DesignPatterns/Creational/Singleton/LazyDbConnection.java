package DesignPatternsLLD.DesignPatterns.Creational.Singleton;

public class LazyDbConnection {
    private static LazyDbConnection lazyDbConnection;

    private LazyDbConnection() {
        System.out.println("initiating lazy db connection");
    }

    public static LazyDbConnection getInstance() {
        if (lazyDbConnection == null) {
            lazyDbConnection = new LazyDbConnection();
        }
        return lazyDbConnection;
    }
}
