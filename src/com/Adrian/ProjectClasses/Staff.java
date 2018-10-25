package com.Adrian.ProjectClasses;

public class Staff extends User {
    private Role role;
    public  Staff(Long idUser, String userName, String userSurname ,
                  String phone , String email, Address userAddress,Role role){
        super(idUser,userName, userSurname , phone , email, userAddress);
        this.role = role;
    }

    public void setRole(Role role) {
        this.role = role;
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

    public  Address getStaffAddress(){
        return  super.getUserAddress ();
    }

    public Role getRole(){
        return this.role;
    }

}
