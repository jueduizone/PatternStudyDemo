package DesignPattern.CreationalPattern.Factory.simple;

/**
 * User: JamieXu
 * Time: 2016/11/16 上午12:44
 */
public class PhoneFactory {
    //通过参数匹配,不推荐，拓展性低
    public static Phone createPhone(String brand) {
        Phone phone = null;
        if ("MZ".equals(brand)) {
            phone = new MZPhone();
        } else if ("Mi".equals(brand)) {
            phone = new MiPhone();
        }
        return phone;
    }

    //通过类名(推荐,实际开发中类名可以在配置文件中以KV形式存储,调用时只需传key取class值)
    public static Phone createPhoneByClass(String className) {
        Phone phone = null;
        try {
            phone = (Phone) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return phone;
    }
}
