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
    private boolean gender;
    private Date doB;
    private String nid;
    private String passportNo;
    private String address;
    private String mobile;
    private Date bookingDate;
    private double bookingMoney;
   
    Category category;
    public java.sql.Date get;

    public Pilgrim() {
    }

    public Pilgrim(int id, int accNo, String pilgrimName, String fatherNamer, String motherName, boolean gender, Date doB, String nid, String passportNo, String address, String mobile, Date bookingDate, double bookingMoney, Category category, java.sql.Date get) {
        this.id = id;
        this.accNo = accNo;
        this.pilgrimName = pilgrimName;
        this.fatherNamer = fatherNamer;
        this.motherName = motherName;
        this.gender = gender;
        this.doB = doB;
        this.nid = nid;
        this.passportNo = passportNo;
        this.address = address;
        this.mobile = mobile;
        this.bookingDate = bookingDate;
        this.bookingMoney = bookingMoney;
        this.category = category;
        this.get = get;
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

    public String getPilgrimName() {
        return pilgrimName;
    }

    public void setPilgrimName(String pilgrimName) {
        this.pilgrimName = pilgrimName;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDoB() {
        return doB;
    }

    public void setDoB(Date doB) {
        this.doB = doB;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public void setCategory(Category category) {
        this.category = category;
    }

    public java.sql.Date getGet() {
        return get;
    }

    public void setGet(java.sql.Date get) {
        this.get = get;
    }

    @Override
    public String toString() {
        return "Pilgrim{" + "id=" + id + ", accNo=" + accNo + ", pilgrimName=" + pilgrimName + ", fatherNamer=" + fatherNamer + ", motherName=" + motherName + ", gender=" + gender + ", doB=" + doB + ", nid=" + nid + ", passportNo=" + passportNo + ", address=" + address + ", mobile=" + mobile + ", bookingDate=" + bookingDate + ", bookingMoney=" + bookingMoney + ", category=" + category + ", get=" + get + '}';
    }

}
