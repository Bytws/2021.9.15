package Exchange;

import java.util.concurrent.Exchanger;

public class Test {
    public static void main(String[] args) {

        Exchanger<String> ex = new Exchanger<>();
        new MyThreadA(ex).start();
        new MyThreadB(ex).start();

    }
}
