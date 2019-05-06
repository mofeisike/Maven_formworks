package com.mofei;

/**
 * @author mofeiske
 * @Description: ${todo}
 * @Date: Create in 2019/5/6 11:18
 */
public class test {

    public static void main(String[] args) {
        Dao dao = new Dao();
        String s = dao.addDao();
        Service service = new Service();
        String s1 = service.addService();
        System.out.println(s+" "+s1);
    }
}
