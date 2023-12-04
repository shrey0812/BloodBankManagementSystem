/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Donor implements Serializable{
    private String donorId;
    private String name;
    private String fatherName;
    private String motherName;
    private String DOB;
    private String MobileNo;
    private String gender;
    private String email;
    private String bloodGroup;
    private String city;
    
    public Donor(String donorId, String name, String fatherName, String motherName, String DOB, String MobileNo, String gender, String email, String bloodGroup, String city){
    this.donorId=donorId;
    this.name=name;
    this.fatherName=fatherName;
    this.motherName= motherName;
    this.DOB= DOB;
    this.MobileNo= MobileNo;
    this.gender= gender;
    this.email=email;
    this.bloodGroup= bloodGroup;
    this.city= city;
}
    
    public String getDonorId(){
        return donorId;
    }
    
    public String getName(){
        return name;
    }
    public String getFatherName(){
        return fatherName;
    }
    public String getMotherName(){
        return motherName;
    }
    public String getDOB(){
        return DOB;
    }
    public String getMobileNo(){
        return MobileNo;
    }
    public String getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    }
    public String getBloodGroup(){
        return bloodGroup;
    }
    public String getCity(){
        return city;
    }
    
}
