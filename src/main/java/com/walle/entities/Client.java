package com.walle.entities;

public class Client {
        private Integer id;
        private String name;
        private String surname;
        private String phone;
        private String email;
        private Country country;
        private String address;
        private Type type;

        public  Client(){}

        public Client(Integer id, String name, String surname
                ,String phone , String email, Country country,
                    String address ){
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.phone = phone;
            this.email = email;
            this.country = country;
            this.address = address;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public void setType(Type type) {
            this.type = type;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }


        public Type getType() {
            return type;
        }

        public Country getCountry() {
            return country;
        }

        public String getAddress() {
            return address;
        }


        public void setCountry(Country country) {
            this.country = country;
        }

        public void setAddress(String address) {
            this.address = address;
        }


        @Override
        public String toString() {
            return "Client{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", phone='" + phone + '\'' +
                    ", email='" + email + '\'' +
                    ", country=" + country +
                    ", address='" + address + '\'' +
                    ", type=" + type +
                    '}';
        }


}