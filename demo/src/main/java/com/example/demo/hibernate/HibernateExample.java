package com.example.demo.hibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HibernateExample {


    @ResponseBody
    @RequestMapping("husers")
    public String users(){

        Session session = factory.openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            // do some work

            tx.commit();
        }
        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

    }


}
