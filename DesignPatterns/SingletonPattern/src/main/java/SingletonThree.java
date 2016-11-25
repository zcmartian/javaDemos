/**
 * Created by mars on 16/11/25.
 */
public class SingletonThree {
    private SingletonThree() {
    }

    public static SingletonThree getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static SingletonThree instance = new SingletonThree();
    }

    public String info() {
        return this.toString();
    }
}
