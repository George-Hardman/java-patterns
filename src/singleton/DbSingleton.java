package singleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    /**
     * Private access here prevents it being created
     */
    private DbSingleton(){
        if (instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance(){
        if (instance == null){
            synchronized (DbSingleton.class){
                if (instance == null){
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
