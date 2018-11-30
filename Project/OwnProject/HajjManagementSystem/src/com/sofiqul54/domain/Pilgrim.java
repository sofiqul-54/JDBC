package com.sofiqul54.domain;

import java.util.Date;

/**
 *
 * @author Md. Sofiqul Islam; J2EE (Round - 37); IDB-BISEW.
 */
public class Pilgrim {

    private int id;
    private int accNo;
    private String pilgrimName;
    private String fatherNamer;
    private String motherName;
    private String gender;
    private Date doB;
    private int nid;
    private int passportNo;
    private Date pIsuueDate;
    private Date pExpiryDate;
    private String presentAddress;
    private String permanentAddress;
    private Date bookingDate;
    private double bookingMoney;
   
    Category category;

    public Pilgrim() {
    }

    public Pilgrim(int id, int accNo, String name, String fatherNamer, String motherName, String gender, Date doB, int nid, int passportNo, Date pIsuueDate, Date pExpiryDate, String presentAddress, String permanentAddress, Date bookingDate, double bookingMoney, Category catagory) {
        this.id = id;
        this.accNo = accNo;
        this.pilgrimName = name;
        this.fatherNamer = fatherNamer;
        this.motherName = motherName;
        this.gender = gender;
        this.doB = doB;
        this.nid = nid;
        this.passportNo = passportNo;
        this.pIsuueDate = pIsuueDate;
        this.pExpiryDate = pExpiryDate;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.bookingDate = bookingDate;
        this.bookingMoney = bookingMoney;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return pilgrimName;
    }

    public void setName(String name) {
        this.pilgrimName = name;
    }

    public String getFatherNamer() {
        return fatherNamer;
    }

    public void setFatherNamer(String fatherNamer) {
        this.fatherNamer = fatherNamer;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDoB() {
        return doB;
    }

    public void setDoB(Date doB) {
        this.doB = doB;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public int getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(int passportNo) {
        this.passportNo = passportNo;
    }

    public Date getpIsuueDate() {
        return pIsuueDate;
    }

    public void setpIsuueDate(Date pIsuueDate) {
        this.pIsuueDate = pIsuueDate;
    }

    public Date getpExpiryDate() {
        return pExpiryDate;
    }

    public void setpExpiryDate(Date pExpiryDate) {
        this.pExpiryDate = pExpiryDate;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public double getBookingMoney() {
        return bookingMoney;
    }

    public void setBookingMoney(double bookingMoney) {
        this.bookingMoney = bookingMoney;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category catagory) {
        this.category = catagory;
    }

    @Override
    public String toString() {
        return "Pilgrim{" + "id=" + id + ", accNo=" + accNo + ", name=" + pilgrimName + ", fatherNamer=" + fatherNamer + ", motherName=" + motherName + ", gender=" + gender + ", doB=" + doB + ", nid=" + nid + ", passportNo=" + passportNo + ", pIsuueDate=" + pIsuueDate + ", pExpiryDate=" + pExpiryDate + ", presentAddress=" + presentAddress + ", permanentAddress=" + permanentAddress + ", bookingDate=" + bookingDate + ", bookingMoney=" + bookingMoney + ", catagory=" + category + '}';
    }

    
}
