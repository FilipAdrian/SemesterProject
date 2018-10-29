package com.Adrian.com.entities;

public class Staff extends User {
    private Role role;

    public  Staff (Long idUser, String userName, String userSurname ,
                  String phone , String email, Address userAddress, Role role){
        super(idUser,userName, userSurname , phone , email, userAddress);
        this.role = role;
    }


    public void setRole(Role role) {
        this.role = role;
    }

    public void setIdStaff(Long idStaff){
        super.setIdUser (idStaff);
    }

    public void setStaffName(String staffName){
        super.setUserName (staffName);
    }

    public  void setStaffSurname(String staffSurname){
        super.setUserSurname (staffSurname);
    }

    public void setStaffPhone(String staffPhone){
        super.setPhone (staffPhone);
    }

    public  void setStaffEmail(String staffEmail){
        super.setEmail (staffEmail);
    }

    public  void  setStaffAddress(Address staffAddress){
        super.setUserAddress (staffAddress);
    }

    public  Long getIdStaff(){
        return super.getIdUser ();
    }

    public  String getStaffName(){
        return super.getUserName ();
    }

    public  String getStaffSurname(){
        return super.getUserSurname ();
    }

    public String getStaffPhone(){
        return super.getPhone ();
    }

    public String getStaffEmail(){
        return super.getEmail ();
    }

    public  Address getStaffAddress(){
        return  super.getUserAddress ();
    }

    public Role getRole(){
        return this.role;
    }

}
