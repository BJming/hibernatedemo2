package com.bjm.DAO;

import com.bjm.pojo.HibernateUtil;
import com.bjm.pojo.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by bjming on 17-2-9.
 */
public class UserDAOImpl implements UserDAO{
    //添加用户
    public Boolean save(User user) {
        Boolean result=false;
        Session session = HibernateUtil.getsession();//生成session实例
        Transaction tx = session.beginTransaction();//创建Transcation实例
        try{
            session.save(user);
            tx.commit();
            result=true;
        }catch(Exception e) {
            e.printStackTrace();
            tx.rollback();
        }finally {
            HibernateUtil.closeSession();
        }
        return result;
    }
    //根据用户标识查找指定用户
    public User findyById(int id) {
        User user = null;
        Session session = HibernateUtil.getsession();
        Transaction tx=session.beginTransaction();
        try{
            user=(User)session.get(User.class, id);
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            HibernateUtil.closeSession();
        }
        return user;
    }
    //删除用户
    public Boolean delete(User user) {
        Boolean result =false;
        Session session = HibernateUtil.getsession();
        Transaction tx=session.beginTransaction();
        try{
            session.delete(user);
            tx.commit();
            result=true;
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            HibernateUtil.closeSession();
        }
        return result;
    }
    //修改用户信息
    public void update(User user) {
        Session session=HibernateUtil.getsession();
        Transaction tx=session.beginTransaction();
        try{
            session.update(user);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            HibernateUtil.closeSession();
        }
    }
}
