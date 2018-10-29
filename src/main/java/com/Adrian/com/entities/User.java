package com.Adrian.com.entities;



public class User {
    private Long idUser;
    private String userName;
    private  String userSurname;
    private String phone;
    private String email;
    private Address userAddress;
    private Type type;

    public User(Long idUser, String userName, String userSurname
            ,String phone , String email, Address userAddress){
        this.idUser = idUser;
        this.userName = userName;
        this.userSurname = userSurname;
        this.phone = phone;
        this.email = email;
        this.userAddress = userAddress;

    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }

    public void setType(Type type){
        this.type=type;
    }

    public Long getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public Type getType() {
        return type;
    }
}
