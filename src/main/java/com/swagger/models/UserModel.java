package com.swagger.models;

import java.util.List;

public class UserModel {

    private Integer id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Integer userStatus;

    public UserModel(List<String> dataUser) {
        this.id = Integer.valueOf(dataUser.get(0));
        this.userName = dataUser.get(1);
        this.firstName = dataUser.get(2);
        this.lastName = dataUser.get(3);
        this.email = dataUser.get(4);
        this.password = dataUser.get(5);
        this.phone = dataUser.get(6);
        this.userStatus = Integer.valueOf(dataUser.get(7));
    }

    public void setId(String id) {
        this.id = Integer.valueOf(id);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = Integer.valueOf(userStatus);
    }


    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getuserStatus() {
        return userStatus;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ",\"username\": \"" + userName + '\"' +
                ",\"firstName\": \"" + firstName + '\"' +
                ",\"lastName\": \"" + lastName + '\"' +
                ",\"email\": \"" + email + '\"' +
                ",\"password\": \"" + password + '\"' +
                ",\"phone\": \"" + phone + '\"' +
                ",\"userStatus\": " + userStatus +
                '}';
    }
}
