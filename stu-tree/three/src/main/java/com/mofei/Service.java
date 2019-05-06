package com.mofei;

/**
 * @author mofeiske
 * @Description: ${todo}
 * @Date: Create in 2019/5/6 11:08
 */
public class Service {

    public String addService(){
        Dao dao = new Dao();
        String s = dao.addDao();
        return s;
    }


    public static void main(String[] args) {
        System.out.println(new Service().addService());

    }
}
