package DesignPattern.StructuralPattern.Adapter;

/**
 * 笔记本
 * User: JamieXu
 * Time: 2016/11/23 下午2:24
 */
public class Notebook {
    public static void main(String[] args) {
        ChargeJack chargeJack = new ChargeJack();
        Socket socket = new Adapter(chargeJack);
        socket.output();

        Socket socket1 = new AdapterExtends();
        socket1.output();
    }
}
