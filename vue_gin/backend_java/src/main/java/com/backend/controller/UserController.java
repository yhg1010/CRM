package com.backend.controller;
 
import com.backend.entity.Login;
import com.backend.entity.Baseinfo;
import com.backend.entity.Customername;
import com.backend.service.UserService;
import com.backend.entity.Salechance;
import com.backend.entity.Planitem;
import com.backend.entity.Customerinfo;
import com.backend.entity.Contactinfo;
import com.backend.entity.Orders;
import com.backend.entity.Users;
import com.backend.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.*;
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */
 
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
 
    @Autowired
    private UserService userService;
    //private YinxiaoService yinxiaoService;
 
    @RequestMapping("/getuser")
    public String GetUser(){
        return userService.Sel().toString();
    }

    @RequestMapping("/getall")
    public List<Login> Findall() {
        return userService.Findall();
    }

    @RequestMapping("/getUserById/{username}")
    public Users getUserById(@PathVariable String username) {
        System.out.println("--------------------------");
        System.out.println(username);
        return userService.GetLoginUser(username);
    }

    @RequestMapping("/getUserBaseInfo/{username}")
    public Users getUserBaseInfo(@PathVariable String username) {
        System.out.println(username);
        return userService.GetUserBaseInfo(username);
    }

    @RequestMapping("/setNewPwd/{username}/{pwd}")
    public Users setNewPwd(@PathVariable String username, @PathVariable String pwd) {
        System.out.println(username+" "+pwd);
        return userService.SetNewPwd(username, pwd);
    }
    @RequestMapping("/setBaseInfo/{username}/{phone}/{email}/{realName}")
    public Users setBaseInfo(@PathVariable String username, @PathVariable String phone, @PathVariable String email, @PathVariable String realName) {
        System.out.println(username+" "+phone+" "+email+" "+realName);
        return userService.SetBaseInfo(username, phone, email, realName);
    }

    @RequestMapping("/getYinXiao/{customer}/{creater}/{allocate}")
    public List<Salechance> GetYinXiao(@PathVariable String customer, @PathVariable String creater, @PathVariable Integer allocate){
        //System.out.println(customer+" "+creater+" "+allocate);
        if(!customer.equals("a")) {
            //System.out.println("ssssss");
            if(!creater.equals("b")) {
                return userService.GetYinXiao(customer, creater, allocate);
            }
            else {
                return userService.GetYinXiao1(customer, allocate);
            }
        }
        else {
            //System.out.println("ssssss");
            if(!creater.equals("b")) {
                return userService.GetYinXiao2(creater, allocate);
            }
            else {
                System.out.println("ssssss");
                return userService.GetYinXiao3(allocate);
            }
        }
        //return userService.GetYinXiao(customer, creater, allocate);
    }

    @RequestMapping("/setYinXiao")
    public void SetYinXiao(@RequestBody Map saleitem){
        System.out.println(saleitem);
        //System.out.println(saleitem);
        userService.SetYinXiao(saleitem);
    }

    @RequestMapping("/setYinXiao2")
    public void SetYinXiao2(@RequestBody Map saleitem){
        System.out.println(saleitem);
        //System.out.println(saleitem);
        userService.SetYinXiao2(saleitem);
    }


    @RequestMapping("/addYinXiao")
    public void AddYinXiao(@RequestBody Map additem) {
        System.out.println(additem);
        userService.AddYinXiao(additem);
    }
    @RequestMapping("/deleteYinXiao/{id}")
    public void DeleteYinXiao(@PathVariable Integer id) {
        userService.DeleteYinXiao(id);
    }
    @RequestMapping("/getkhkf/{customer}/{creator}/{exploit}/{username}")
    public List<Salechance> Getkhkf(@PathVariable String customer, @PathVariable String creator, @PathVariable String exploit, @PathVariable String username) {
        
        if(!customer.equals("a")) {
            System.out.println("saaaaaaaaaasssss");
            if(!creator.equals("b")) {
                return userService.Getkhkf(customer, creator, exploit, username);
            }
            else {
                return userService.Getkhkf1(customer, exploit, username);
            }
        }
        else {
            //System.out.println("ssssss");
            if(!creator.equals("b")) {
                return userService.Getkhkf2(creator, exploit, username);
            }
            else {
                System.out.println("ssssss");
                return userService.Getkhkf3(exploit, username);
            }
        }
        
        
        //return userService.Getkhkf(customer, creator, exploit, username);
    }

    @RequestMapping("/addPlan")
    public void AddPlan(@RequestBody Map addplan) {
        System.out.println(addplan);
        userService.AddPlan(addplan);
    }
    @RequestMapping("/getitems/{id}")
    public List<Planitem> Getitems(@PathVariable Integer id) {
        return userService.Getitems(id);
    }
    @RequestMapping("/deleteplan/{id}")
    public void Deleteplan(@PathVariable Integer id) {
        userService.Deleteplan(id);
    }

    @RequestMapping("/deleteCustomer/{id}")
    public void DeleteCustomer(@PathVariable Integer id) {
        userService.DeleteCustomer(id);
    }

    @RequestMapping("/setPlan")
    public void Setplan(@RequestBody Map modifyItem){
        System.out.println(modifyItem);
        //System.out.println(saleitem);
        userService.Setplan(modifyItem);
    }
    @RequestMapping("/getAllYinXiao")
    public List<Salechance> GetAllYinXiao() {
        return userService.GetAllYinXiao();
    }
    @RequestMapping("/getSelectedYinXiao/{allocator}")
    public List<Salechance> GetSelectedYinXiao(@PathVariable String allocator) {
        
        return userService.GetSelectedYinXiao(allocator);
    }









    @RequestMapping("/setExploitStatus/{id}/{exploitStatus}")
    public void SetExploitStatus(@PathVariable String id, @PathVariable String exploitStatus) {
        userService.SetExploitStatus(id, exploitStatus);
    }

    @RequestMapping("/addKeHu")
    public void AddKeHu(@RequestBody Map newCustomer) {
        userService.AddKeHu(newCustomer);
    }
    @RequestMapping("/addNewKehu")
    public void AddNewKehu(@RequestBody Map newCustomer) {
        userService.AddNewKehu(newCustomer);
    }



    @RequestMapping("/getAllCustomers")
    public List<Customerinfo> GetAllCustomers() {
        return userService.GetAllCustomers();
    }

    @RequestMapping("/getSelectedCustomer/{customer}/{creator}/{searchStatus}")
    public List<Customerinfo> GetSelectedCustomer(@PathVariable String customer, @PathVariable String creator, @PathVariable String searchStatus){
        
        if(!customer.equals("a")) {
            //System.out.println("ssssss");
            if(!creator.equals("b")) {
                return userService.GetSelectedCustomer(customer, creator, searchStatus);
            }
            else {
                return userService.GetSelectedCustomer1(customer, searchStatus);
            }
        }
        else {
            //System.out.println("ssssss");
            if(!creator.equals("b")) {
                return userService.GetSelectedCustomer2(creator, searchStatus);
            }
            else {
                System.out.println("ssssss");
                return userService.GetSelectedCustomer3(searchStatus);
            }
        }
        
        
        
        //return userService.GetSelectedCustomer(customer, creator, searchStatus);
    }

    @RequestMapping("/setCustomer")
    public void SetCustomer(@RequestBody Map formData) {
        System.out.println(formData);
        userService.SetCustomer(formData);
    }

    @RequestMapping("/addnewContact")
    public void AddnewContact(@RequestBody Map newContact) {
        userService.AddnewContact(newContact);
    }

    @RequestMapping("/getAllContacts/{id}")
    public List<Contactinfo> GetAllContacts(@PathVariable Integer id) {
        return userService.GetAllContacts(id);
    }

    @RequestMapping("/getAllContactinfos")
    public List<Contactinfo> GetAllContactinfos() {
        return userService.GetAllContactinfos();
    }

    @RequestMapping("/deleteContact/{id}")
    public void DeleteContact(@PathVariable Integer id) {
        userService.DeleteContact(id);
    }

    @RequestMapping("/setContact") 
    public void SetContact(@RequestBody Map contactItem) {
        userService.SetContact(contactItem);
    }
    @RequestMapping("/getAllorder/{customerId}")
    public List<Orders> GetAllorder(@PathVariable String customerId) {
        return userService.GetAllorder(customerId);
    }

    @RequestMapping("/addAorder")
    public void AddAorder(@RequestBody Map newOrder) {
        userService.AddAorder(newOrder);
    }

    @RequestMapping("/deleteAorder/{id}")
    public void DeleteAorder(@PathVariable Integer id) {
        userService.DeleteAorder(id);
    }

    @RequestMapping("/deleteAuser/{id}")
    public void DeleteAuser(@PathVariable Integer id) {
        userService.DeleteAuser(id);
    }

    @RequestMapping("/setOrderItem")
    public void SetOrderItem(@RequestBody Map orderitem) {
        userService.SetOrderItem(orderitem);
    }

    @RequestMapping("/setYongHu")
    public void SetYongHu(@RequestBody Map useritem) {
        userService.SetYongHu(useritem);
    }

    @RequestMapping("/getAllorders")
    public List<Orders> GetAllorders() {
        return userService.GetAllorders();
    }

    @RequestMapping("/getSelectedOrders/{customer}/{creator}/{searchStatus}")
    public List<Orders> GetSelectedOrders(@PathVariable String customer, @PathVariable String creator, @PathVariable String searchStatus) {
        if(!customer.equals("a")) {
            //System.out.println("ssssss");
            if(!creator.equals("b")) {
                return userService.GetSelectedOrders(customer, creator, searchStatus);
            }
            else {
                return userService.GetSelectedOrders1(customer, searchStatus);
            }
        }
        else {
            //System.out.println("ssssss");
            if(!creator.equals("b")) {
                return userService.GetSelectedOrders2(creator, searchStatus);
            }
            else {
                System.out.println("ssssss");
                return userService.GetSelectedOrders3(searchStatus);
            }
        }
    
        //return userService.GetSelectedOrders(customer, creator, searchStatus);
    }




    @RequestMapping("/getAllusers")
    public List<Users> GetAllusers() {
        return userService.GetAllusers();
    }

    @RequestMapping("/getSelectedUser/{user}/{depart}")
    public List<Users> GetSelectedUser(@PathVariable String user, @PathVariable String depart) {
        if(!user.equals("a")) {
            
                return userService.GetSelectedUser(user, depart);
            
        }
        else {
          
                return userService.GetSelectedUser1(depart);
            
            
        }
        
        //return userService.GetSelectedUser(user, depart);
    }
    





    @RequestMapping("/addAuser")
    public void AddAuser(@RequestBody Map newuser) {
        userService.AddAuser(newuser);
    }

    @RequestMapping("/getSelectedPermission/{role}")
    public List<Permission> GetSelectedPermission(@PathVariable String role) {
        return userService.GetSelectedPermission(role);
    }

    @RequestMapping("/setPermission")
    public void SetPermission(@RequestBody Map submitData) {
        userService.SetPermission(submitData);
    }

    @RequestMapping("/addUser/{newrole}")
    public void AddUser(@PathVariable String newrole) {
        userService.AddUser(newrole);
    }
    @RequestMapping("/getAllroles")
    public List<Permission> GetAllroles() {
        return userService.GetAllroles();
    }

    @RequestMapping("/deleteArole/{role}")
    public void DeleteArole(@PathVariable String role) {
        userService.DeleteArole(role);
    }

    @RequestMapping("/setNewRole/{rolepre}/{roleafter}") 
    public void SetNewRole(@PathVariable String rolepre, @PathVariable String roleafter) {
        userService.SetNewRole(rolepre, roleafter);
    }

    @RequestMapping("/setNewUser/{rolepre}/{roleafter}") 
    public void SetNewUser(@PathVariable String rolepre, @PathVariable String roleafter) {
        userService.SetNewUser(rolepre, roleafter);
    }

}