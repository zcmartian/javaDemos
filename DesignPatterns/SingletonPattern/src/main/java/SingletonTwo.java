/**
 * Created by mars on 16/11/25.
 */
public class SingletonTwo {
    private static SingletonTwo instance = null;

    private SingletonTwo() {}

    public String info() {
        return this.toString();
    }

    public static SingletonTwo getInstance() {
        if (instance == null) {
            synchronized (SingletonTwo.class) {
                if (instance == null) {
                    instance = new SingletonTwo();
                }
            }
        }
        return instance;
    }
}
