import com.bjm.DAO.UserDAO;
import com.bjm.DAO.UserDAOImpl;
import com.bjm.pojo.User;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by bjming on 17-2-9.
 */
public class testUserDao {
    @Before
    public void setUp() throws Exception{

    }
    @Test
    public void testSave(){
        UserDAO userdao =new UserDAOImpl();
        try{
            User u= new User();
//            u.setId(1);
            u.setName("bjm2");
            u.setPassword("123456");
            u.setType("admin");
            userdao.save(u);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
//    @Test
//    public void testDelete(){
//        UserDAO userdao = new UserDAOImpl();
//        try {
//            User u = new User();
//            u.setId(0);
//            userdao.delete(u);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
