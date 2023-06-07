package com.example.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "nickname")
    private String nickname;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "phone")
    private String phone;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(nullable = true, name = "profileimgURL")
    private String profileimgURL;

    @Column(nullable = false, name = "temperature")
    private double temperature;

    public User(Integer userID, String name, String nickname, String email, String phone, String password, String profileimgURL, double temperature){
        this.userID = userID;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this. phone = phone;
        this.password = password;
        this.profileimgURL = profileimgURL;
        this.temperature = temperature;
    }

    public void update(String nickname, String profileimgURL) {
        this.nickname = nickname;
        this.profileimgURL = profileimgURL;
    }
}
