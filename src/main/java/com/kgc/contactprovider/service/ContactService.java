package com.kgc.contactprovider.service;

import com.kgc.bean.Contact;

import java.util.List;

public interface ContactService {
    //查询所有联系人
    public List<Contact> queryAllContact();
    //按照姓名模糊查询联系人
    public List<Contact> queryContactByName(String cname);
    //按照联系人id查询联系人
    public Contact queryContactById(Integer id);
    //添加联系人
    public int addContact(String cname, String mobile, String qq, String email, String address);
    //修改联系人
    public int updateContact(Integer id, String cname, String mobile, String qq, String email, String address);
}
