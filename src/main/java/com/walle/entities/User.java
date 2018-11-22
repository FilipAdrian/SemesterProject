package com.walle.entities;

public class User extends Client {
    private String password;
    private String login;
    private Integer role;

    public User() {};

    public User(Integer idUser, String name, String surname,
                 String phone, String email, Integer country ,String address) {
        super (idUser, name, surname, phone, email, country , address);
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getRole() {
        return this.role;
    }

    @Override
    public String toString() {
        return "User{" + super.toString ()+
                "role=" + role +
                '}';
    }
}
