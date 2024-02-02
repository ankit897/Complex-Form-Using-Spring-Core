package springmvc.dao;

import org.springframework.transaction.annotation.Transactional;
import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int saveUser(User user){
        return (Integer) this.hibernateTemplate.save(user);
    }
}