package com.kgc.contactprovider.dao;

import com.kgc.bean.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ContactDao {
    //查询所有联系人
    public List<Contact> queryAllContact();
    //按照姓名模糊查询联系人
    public List<Contact> queryContactByName(String cname);
    //按照联系人id查询联系人
    public Contact queryContactById(Integer id);
    //添加联系人
    public int addContact(@Param("cname") String cname,
                          @Param("mobile") String mobile,
                          @Param("qq") String qq,
                          @Param("email") String email,
                          @Param("address") String address);
    //修改联系人
    public int updateContact(@Param("id") Integer id,
                             @Param("cname") String cname,
                             @Param("mobile") String mobile,
                             @Param("qq") String qq,
                             @Param("email") String email,
                             @Param("address") String address);
}
