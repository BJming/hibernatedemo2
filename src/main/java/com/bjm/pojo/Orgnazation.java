package com.bjm.pojo;

import java.sql.Date;

/**
 * Created by bjming on 17-3-7.
 */
public class Orgnazation {
    private Long id;
    private String name;
    private Date createDate;
    private Date editDate;
    private Date endDate;
    private String telphone;
    private String address;
    private String fullName;
    private Long parent_id;
    private String isDelete;

    public Orgnazation(Long id, String name, Date createDate, Date editDate,Date endDate, String telphone, String address, String fullName, Long parent_id, String isDelete ){
        this.id=id;
        this.name=name;
        this.createDate=createDate;
        this.editDate=editDate;
        this.endDate=endDate;
        this.address=address;
        this.telphone=telphone;
        this.fullName=fullName;
        this.parent_id=parent_id;
        this.isDelete=isDelete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
}
