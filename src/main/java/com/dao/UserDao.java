package com.dao;

import com.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
   @Select("select * from user")
    public List<User> findAll();
   @Insert("insert into user (name,password) values(#{name},#{password})")
   public void save(User user);
}
