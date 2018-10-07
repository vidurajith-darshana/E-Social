package com.esocial.entity;

import javax.persistence.*;

@Entity
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int userDetailId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

    private String fname;
    private String lname;
    private String profileImg;
    private String gender;
    private String birthday;
    private String joinDay;
    private String email;
    private String mobNumber;
    private String address;
    private String hometown;
    private String country;
    private String education;
    private String jobField;
    private String position;
    private String company;

    public UserDetail() {
    }

    public UserDetail(User user, String fname, String lname, String profileImg, String gender, String birthday, String joinDay, String email, String mobNumber, String address, String hometown, String country, String education, String jobField, String position, String company) {
        this.user = user;
        this.fname = fname;
        this.lname = lname;
        this.profileImg = profileImg;
        this.gender = gender;
        this.birthday = birthday;
        this.joinDay = joinDay;
        this.email = email;
        this.mobNumber = mobNumber;
        this.address = address;
        this.hometown = hometown;
        this.country = country;
        this.education = education;
        this.jobField = jobField;
        this.position = position;
        this.company = company;
    }

    public UserDetail(int userDetailId,User user, String fname, String lname, String profileImg, String gender, String birthday, String joinDay, String email, String mobNumber, String address, String hometown, String country, String education, String jobField, String position, String company) {
        this.userDetailId=userDetailId;
        this.user = user;
        this.fname = fname;
        this.lname = lname;
        this.profileImg = profileImg;
        this.gender = gender;
        this.birthday = birthday;
        this.joinDay = joinDay;
        this.email = email;
        this.mobNumber = mobNumber;
        this.address = address;
        this.hometown = hometown;
        this.country = country;
        this.education = education;
        this.jobField = jobField;
        this.position = position;
        this.company = company;
    }

    public int getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(int userDetailId) {
        this.userDetailId = userDetailId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getJoinDay() {
        return joinDay;
    }

    public void setJoinDay(String joinDay) {
        this.joinDay = joinDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJobField() {
        return jobField;
    }

    public void setJobField(String jobField) {
        this.jobField = jobField;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "userDetailId=" + userDetailId +
                ", user=" + user +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", profileImg='" + profileImg + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", joinDay='" + joinDay + '\'' +
                ", email='" + email + '\'' +
                ", mobNumber='" + mobNumber + '\'' +
                ", address='" + address + '\'' +
                ", hometown='" + hometown + '\'' +
                ", country='" + country + '\'' +
                ", education='" + education + '\'' +
                ", jobField='" + jobField + '\'' +
                ", position='" + position + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
