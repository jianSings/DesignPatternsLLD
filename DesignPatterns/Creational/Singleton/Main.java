package DesignPatternsLLD.DesignPatterns.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        EagerDbConnection eagerDbConnection1 = EagerDbConnection.getInstance();
        System.out.println(eagerDbConnection1);
        EagerDbConnection eagerDbConnection2 = EagerDbConnection.getInstance();
        System.out.println(eagerDbConnection2);

        LazyDbConnection lazyDbConnection1 = LazyDbConnection.getInstance();
        System.out.println(lazyDbConnection1);
        LazyDbConnection lazyDbConnection2 = LazyDbConnection.getInstance();
        System.out.println(lazyDbConnection2);

        SyncDbConnection syncDbConnection1 = SyncDbConnection.getInstance();
        System.out.println(syncDbConnection1);
        SyncDbConnection syncDbConnection2 = SyncDbConnection.getInstance();
        System.out.println(syncDbConnection2);

        // Used in prod
        DoubleLockingDbConnection doubleLockingDbConnection1 = DoubleLockingDbConnection.getInstance();
        System.out.println(doubleLockingDbConnection1);
        DoubleLockingDbConnection doubleLockingDbConnection2 = DoubleLockingDbConnection.getInstance();
        System.out.println(doubleLockingDbConnection2);

    }
}
