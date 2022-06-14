package com.backend.mapper;
 
import com.backend.entity.Login;
import com.backend.entity.Planitem;
import com.backend.entity.Baseinfo;
import com.backend.entity.Contactinfo;
import com.backend.entity.Customername;
import com.backend.entity.Salechance;
import com.backend.entity.Customerinfo;
import com.backend.entity.Orders;
import com.backend.entity.Users;
import com.backend.entity.Permission;
import org.apache.ibatis.annotations.Select;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;
 
import java.util.*;
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {
    Login Sel();
    List<Login> Findall();
    Users GetLoginUser(String username);
    Users GetUserBaseInfo(String username);
    Users SetNewPwd(String username, String pwd);
    Users SetBaseInfo(String username, String phone, String email, String realName);
    List<Salechance> GetYinXiao(String customer, String creater, Integer allocate);
    List<Salechance> GetYinXiao1(String customer, Integer allocate);
    List<Salechance> GetYinXiao2(String creater, Integer allocate);
    List<Salechance> GetYinXiao3(Integer allocate);

    Salechance SetYinXiao(Map saleitem);
    Salechance SetYinXiao2(Map saleitem);


    Salechance AddYinXiao(Map additem);
    Salechance DeleteYinXiao(Integer id);
    List<Salechance> Getkhkf(String customer, String creator, String exploit, String username);
    List<Salechance> Getkhkf1(String customer, String exploit, String username);
    List<Salechance> Getkhkf2(String creator, String exploit, String username);
    List<Salechance> Getkhkf3(String exploit, String username);


    void AddPlan(Map addplan);
    List<Planitem> Getitems(Integer id);
    void Deleteplan(Integer id);
    void Setplan(Map modifyItem);
    List<Salechance> GetAllYinXiao();
    List<Salechance> GetSelectedYinXiao(String allocator);
    void SetExploitStatus(String id, String exploitStatus);
    void AddKeHu(Map newCustomer);
    void AddNewKehu(Map newCustomer);

    List<Customerinfo> GetAllCustomers();


    List<Customerinfo> GetSelectedCustomer(String customer, String creator, String searchStatus);
    List<Customerinfo> GetSelectedCustomer1(String customer, String searchStatus);
    List<Customerinfo> GetSelectedCustomer2(String creator, String searchStatus);
    List<Customerinfo> GetSelectedCustomer3(String searchStatus);



    void DeleteCustomer(Integer id);
    void SetCustomer(Map formData);
    void AddnewContact(Map newContact);
    List<Contactinfo> GetAllContacts(Integer id);
    void DeleteContact(Integer id);
    void SetContact(Map contactItem);
    List<Orders> GetAllorder(String customerId);
    void AddAorder(Map neworder);
    void DeleteAorder(Integer id);
    void SetOrderItem(Map orderitem);
    List<Orders> GetAllorders();
    List<Orders> GetSelectedOrders(String customer, String creator, String searchStatus);
    List<Orders> GetSelectedOrders1(String customer, String searchStatus);
    List<Orders> GetSelectedOrders2(String creator, String searchStatus);
    List<Orders> GetSelectedOrders3(String searchStatus);



    List<Contactinfo> GetAllContactinfos();
    List<Users> GetAllusers();
    List<Users> GetSelectedUser(String user, String depart);
    List<Users> GetSelectedUser1(String depart);





    void AddAuser(Map newuser);
    void DeleteAuser(Integer id);
    void SetYongHu(Map useritem);
    List<Permission> GetSelectedPermission(String role);
    void SetPermission(Map submitData);
    void AddUser(String newrole);
    List<Permission> GetAllroles();
    void DeleteArole(String role);
    void SetNewRole(String rolepre, String roleafter);
    void SetNewUser(String rolepre, String roleafter);
;}

