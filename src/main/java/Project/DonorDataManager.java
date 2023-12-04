/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DonorDataManager implements Serializable {
    private ArrayList<ArrayList<Donor>> allDonorData;

    public DonorDataManager() {
        allDonorData = new ArrayList<>();
    }

    public void addDonorList(ArrayList<Donor> donorList) {
        allDonorData.add(donorList);
    }

    public ArrayList<ArrayList<Donor>> getAllDonorData(){
        return allDonorData;
    }
    
    public void printAllDonorData(){
        System.out.println("All donor data");
        for(ArrayList<Donor> donorList:allDonorData){
            for(Donor donor : donorList){
            System.out.println("Donor ID "+ donor.getDonorId());
            System.out.println("Name "+ donor.getName());
            System.out.println("FatherName "+ donor.getFatherName());
            System.out.println("MotherName "+ donor.getMotherName());
            System.out.println("DOB "+ donor.getDOB());
            System.out.println("MobileNo "+ donor.getMobileNo());
            System.out.println("Gender "+ donor.getGender());
            System.out.println("Email "+ donor.getEmail());
            System.out.println("BloodGroup "+ donor.getBloodGroup());
            System.out.println("City "+ donor.getCity());
            }
        }
    }
}
