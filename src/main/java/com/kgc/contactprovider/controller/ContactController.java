package com.kgc.contactprovider.controller;

import com.kgc.bean.Contact;
import com.kgc.contactprovider.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ContactService cs;

    @RequestMapping("queryAllContact")
    public List<Contact> queryAllContact(){
        return cs.queryAllContact();
    }

    @RequestMapping("queryContactByName")
    public List<Contact> queryContactByName(String cname){
        return cs.queryContactByName(cname);
    }

    @RequestMapping("queryContactById")
    public Contact queryContactById(Integer id){
        return cs.queryContactById(id);
    }

    @RequestMapping("addContact")
    public int addContact(String cname, String mobile, String qq, String email, String address){
        return cs.addContact(cname,mobile,qq,email,address);
    }

    @RequestMapping("updateContact")
    public int updateContact(Integer id, String cname, String mobile, String qq, String email, String address){
        return cs.updateContact(id,cname,mobile,qq,email,address);
    }
}
