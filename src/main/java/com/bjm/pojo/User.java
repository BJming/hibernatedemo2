package com.bjm.pojo;

import javax.persistence.*;

/**
 * Created by bjming on 17-2-9.
 */

@Entity
@Table(name="user")
public class User implements java.io.Serializable{
    //User 属性
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true, unique = true)
    private int id;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String type;

    //默认构造方法
    public User() {

    }
    //Get&&Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}