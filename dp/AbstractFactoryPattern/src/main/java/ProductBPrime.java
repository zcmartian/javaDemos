/**
 * Created by mars on 16/12/7.
 */
public class ProductBPrime implements ProductB {
    public void operation1() {
        System.out.println(this.getClass().getName() + "operation1 operating...");
    }

    public void operation2() {
        System.out.println(this.getClass().getName() + "operation2 operating...");
    }
}
