package com.backend.service;
 
import com.backend.entity.Login;
import com.backend.entity.Orders;
import com.backend.entity.Planitem;
import com.backend.entity.Salechance;
import com.backend.entity.Baseinfo;
import com.backend.entity.Contactinfo;
import com.backend.entity.Customername;
import com.backend.entity.Customerinfo;
import com.backend.mapper.UserMapper;
import com.backend.entity.Users;
import com.backend.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.*;
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public Login Sel(){
        return userMapper.Sel();
    }

    public List<Login> Findall(){
        return userMapper.Findall();
    }

    public Users GetLoginUser(String username) {
        return userMapper.GetLoginUser(username);
    }

    public Users GetUserBaseInfo(String username) {
        return userMapper.GetUserBaseInfo(username);
    }

    public Users SetNewPwd(String username, String pwd) {
        return userMapper.SetNewPwd(username, pwd);
    }
    
    public Users SetBaseInfo(String username, String phone, String email, String realName) {
        return userMapper.SetBaseInfo(username, phone, email, realName);
    }

    public List<Salechance> GetYinXiao(String customer, String creater, Integer allocate) {
        return userMapper.GetYinXiao(customer, creater, allocate);
    }

    public List<Salechance> GetYinXiao1(String customer, Integer allocate) {
        return userMapper.GetYinXiao1(customer, allocate);
    }

    public List<Salechance> GetYinXiao2(String creater, Integer allocate) {
        return userMapper.GetYinXiao2(creater, allocate);
    }

    public List<Salechance> GetYinXiao3(Integer allocate) {
        return userMapper.GetYinXiao3(allocate);
    }

    public void SetYinXiao(Map saleitem) {
        userMapper.SetYinXiao(saleitem);
    }

    public void SetYinXiao2(Map saleitem) {
        userMapper.SetYinXiao2(saleitem);
    }

    public void AddYinXiao(Map additem) {
        userMapper.AddYinXiao(additem);
    }
    public void DeleteYinXiao(Integer id) {
        userMapper.DeleteYinXiao(id);
    }
    public List<Salechance>Getkhkf(String customer, String creator, String exploit, String username) {
        return userMapper.Getkhkf(customer, creator, exploit, username);
    }

    public List<Salechance> Getkhkf1(String customer, String exploit, String username ) {
        return userMapper.Getkhkf1(customer, exploit, username);
    }

    public List<Salechance> Getkhkf2(String creator, String exploit, String username ) {
        return userMapper.Getkhkf2(creator, exploit, username);
    }
    public List<Salechance> Getkhkf3(String exploit, String username ) {
        return userMapper.Getkhkf3(exploit, username);
    }


    public void AddPlan(Map addplan) {
        userMapper.AddPlan(addplan);
    }
    public List<Planitem> Getitems(Integer id) {
        return userMapper.Getitems(id);
    }

    public void Deleteplan(Integer id) {
        userMapper.Deleteplan(id);
    }
    public void DeleteCustomer(Integer id) {
        userMapper.DeleteCustomer(id);
    }

    public void Setplan(Map modifyItem) {
        userMapper.Setplan(modifyItem);
    }
    public List<Salechance> GetAllYinXiao() {
        return userMapper.GetAllYinXiao();
    }
    public List<Salechance> GetSelectedYinXiao(String allocator) {
        return userMapper.GetSelectedYinXiao(allocator);
    }
    public void SetExploitStatus(String id, String exploitStatus) {
        userMapper.SetExploitStatus(id, exploitStatus);
    }
    public void AddKeHu(Map newCustomer) {
        userMapper.AddKeHu(newCustomer);
    }

    public void AddNewKehu(Map newCustomer) {
        userMapper.AddNewKehu(newCustomer);
    }


    public List<Customerinfo> GetAllCustomers(){
        return userMapper.GetAllCustomers();
    }
    public List<Customerinfo> GetSelectedCustomer(String customer, String creator, String searchStatus) {
        return userMapper.GetSelectedCustomer(customer, creator, searchStatus);
    }
    public List<Customerinfo> GetSelectedCustomer1(String customer, String searchStatus) {
        return userMapper.GetSelectedCustomer1(customer, searchStatus);
    }
    public List<Customerinfo> GetSelectedCustomer2(String creator, String searchStatus) {
        return userMapper.GetSelectedCustomer2(creator, searchStatus);
    }
    public List<Customerinfo> GetSelectedCustomer3(String searchStatus) {
        return userMapper.GetSelectedCustomer3(searchStatus);
    }

    public void SetCustomer(Map formData) {
        userMapper.SetCustomer(formData);
    }

    public void AddnewContact(Map newContact) {
        userMapper.AddnewContact(newContact);
    }

    public List<Contactinfo> GetAllContacts(Integer id) {
        return userMapper.GetAllContacts(id);
    }
    public void DeleteContact(Integer id) {
        userMapper.DeleteContact(id);
    }
    public void SetContact(Map contactItem) {
        userMapper.SetContact(contactItem);
    }
    public List<Orders> GetAllorder(String customerId) {
        return userMapper.GetAllorder(customerId);
    }

    public void AddAorder(Map neworder){
        userMapper.AddAorder(neworder);
    }

    public void DeleteAorder(Integer id) {
        userMapper.DeleteAorder(id);
    }

    public void SetOrderItem(Map orderitem) {
        userMapper.SetOrderItem(orderitem);
    }

    public void SetYongHu(Map useritem) {
        userMapper.SetYongHu(useritem);
    }

    public List<Orders>GetAllorders() {
        return userMapper.GetAllorders();
    }

    public List<Orders> GetSelectedOrders(String customer, String creator, String searchStatus) {
        return userMapper.GetSelectedOrders(customer, creator, searchStatus);
    }
    public List<Orders> GetSelectedOrders1(String customer, String searchStatus) {
        return userMapper.GetSelectedOrders1(customer, searchStatus);
    }
    public List<Orders> GetSelectedOrders2(String creator, String searchStatus) {
        return userMapper.GetSelectedOrders2(creator, searchStatus);
    }

    public List<Orders> GetSelectedOrders3(String searchStatus) {
        return userMapper.GetSelectedOrders3(searchStatus);
    }






    public List<Contactinfo> GetAllContactinfos() {
        return userMapper.GetAllContactinfos();
    }

    public List<Users> GetAllusers() {
        return userMapper.GetAllusers();
    }

    public List<Users> GetSelectedUser(String user, String depart) {
        return userMapper.GetSelectedUser(user, depart);
    }

    public List<Users> GetSelectedUser1(String depart) {
        return userMapper.GetSelectedUser1(depart);
    }






    public void AddAuser(Map newuser) {
        userMapper.AddAuser(newuser);
    }

    public void DeleteAuser(Integer id) {
        userMapper.DeleteAuser(id);
    }

    public List<Permission> GetSelectedPermission(String role) {
        return userMapper.GetSelectedPermission(role);
    }

    public void SetPermission(Map submitData) {
        userMapper.SetPermission(submitData);
    }

    public void AddUser(String newrole) {
        userMapper.AddUser(newrole);
    }

    public List<Permission> GetAllroles() {
        return userMapper.GetAllroles();
    }

    public void DeleteArole(String role) {
        userMapper.DeleteArole(role);
    }

    public void SetNewRole(String rolepre, String roleafter) {
        userMapper.SetNewRole(rolepre, roleafter);
    }

    public void SetNewUser(String rolepre, String roleafter) {
        userMapper.SetNewUser(rolepre, roleafter);
    }


}