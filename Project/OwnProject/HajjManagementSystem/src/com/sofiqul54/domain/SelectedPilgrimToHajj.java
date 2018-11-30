
package com.sofiqul54.domain;

import java.util.Date;

/**
 *
 * @author Md. Sofiqul Islam; J2EE (Round - 37); IDB-BISEW.
 */
public class SelectedPilgrimToHajj {
    private int id;
    private int accNo;
    private String pilgrimName;
    private String fatherNamer;
    private String motherName;
    private String gender;
    private Date doB;
    private int nid;
    Pilgrim pilgrim;

    public SelectedPilgrimToHajj() {
    }

    public SelectedPilgrimToHajj(int id, int accNo, String name, String fatherNamer, String motherName, String gender, Date doB, int nid, Pilgrim pilgrim) {
        this.id = id;
        this.accNo = accNo;
        this.pilgrimName = name;
        this.fatherNamer = fatherNamer;
        this.motherName = motherName;
        this.gender = gender;
        this.doB = doB;
        this.nid = nid;
        this.pilgrim = pilgrim;
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

    public Pilgrim getPilgrim() {
        return pilgrim;
    }

    public void setPilgrim(Pilgrim pilgrim) {
        this.pilgrim = pilgrim;
    }

    @Override
    public String toString() {
        return "SelectedPilgrimToHajj{" + "id=" + id + ", accNo=" + accNo + ", name=" + pilgrimName + ", fatherNamer=" + fatherNamer + ", motherName=" + motherName + ", gender=" + gender + ", doB=" + doB + ", nid=" + nid + ", pilgrim=" + pilgrim + '}';
    }
    
    
    
}
