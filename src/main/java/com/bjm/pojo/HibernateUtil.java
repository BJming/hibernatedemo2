package com.bjm.pojo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by bjming on 17-2-8.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    //创建线程局部变量threadLocal，用来保存Hibernate的session
    private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    //使用静态代码块初始化Hibernate
    static {
        try{
            Configuration cfg=new Configuration().configure();//读取配置文件hibernate.cfg.xml
            sessionFactory=cfg.buildSessionFactory();//创建SessionFactory
        }catch (Throwable e){
            throw new ExceptionInInitializerError(e);
        }
    }
    //获取SessionFactory实例
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    //获得ThreadLocal对象管理的session实例
    public static Session getsession() throws HibernateException{
        Session session = (Session)threadLocal.get();
        if(session == null || !session.isOpen()){
            rebuildSessionFactory();
        }
        //通过SessionFactory对象创建session对象
        session = (sessionFactory !=null)? sessionFactory.openSession():null;
        //将新打开的Session实例保存到线程局部变量threadLocal中
        threadLocal.set(session);
        return session;
    }

    //关闭session实例
    public static void closeSession() throws HibernateException{
        //从线程局部变量threadLocal中获取之前存入的session实例
        Session session=(Session) threadLocal.get();
        threadLocal.set(null);
        if(session != null){
            session.close();
        }
    }
    //重建SessionFactory
    public static void rebuildSessionFactory(){
        Configuration configuration=new Configuration();
        try{
            configuration.configure("/hibernate.cfg.xml");//读取配置文件hibernate.cfg.xml
            sessionFactory=configuration.buildSessionFactory();//创建SessionFactory
        }catch (Exception e){
            System.err.println("Error Creating SessionFactory");
            e.printStackTrace();
        }
    }
    //关闭缓存和连接池
    public static void shutdown(){
        getSessionFactory().close();
    }
}
