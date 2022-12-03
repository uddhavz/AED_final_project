/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Emp;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rajsarode
 */
public class Configuration {
     public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Emp emp = system.getEmpDirectory().createEmp("RRH");
        //Employee employee1 = system.getEmployeeDirectory().createEmployee("mee");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", emp, new SystemAdminRole());
        //UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("gautham", "gautham", emp, new SystemAdminRole());
        
        return system;
    }
}
