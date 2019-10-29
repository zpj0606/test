package com.kgc.contactprovider.service.impl;

import com.kgc.bean.Contact;
import com.kgc.contactprovider.dao.ContactDao;
import com.kgc.contactprovider.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactDao cd;
    @Override
    public List<Contact> queryAllContact() {
        return cd.queryAllContact();
    }

    @Override
    public List<Contact> queryContactByName(String cname) {
        return cd.queryContactByName(cname);
    }

    @Override
    public Contact queryContactById(Integer id) {
        return cd.queryContactById(id);
    }

    @Override
    @Transactional
    public int addContact(String cname, String mobile, String qq, String email, String address) {
        return cd.addContact(cname,mobile,qq,email,address);
    }

    @Override
    public int updateContact(Integer id, String cname, String mobile, String qq, String email, String address) {
        return cd.updateContact(id,cname,mobile,qq,email,address);
    }
}
