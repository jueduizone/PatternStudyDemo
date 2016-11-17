package DesignPattern.CreationalPattern.Factory.simple;

import DesignPattern.CreationalPattern.Factory.simple.Phone;
import DesignPattern.CreationalPattern.Factory.simple.PhoneFactory;

/**
 * User: JamieXu
 * Time: 2016/11/16 上午12:47
 */
public class test {
    public static void main(String[] args) {
//        Phone phone = PhoneFactory.createPhone("MZNote");
        Phone phone = PhoneFactory.createPhoneByClass("DesignPattern.CreationalPattern.Factory.simple.MiPhone");
        phone.make();
        phone.test();
    }
}
