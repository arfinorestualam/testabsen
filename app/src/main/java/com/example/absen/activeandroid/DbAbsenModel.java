package com.example.absen.activeandroid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "AbsenModel")
public class DbAbsenModel extends Model {

    @Column
    String username;
    @Column
    Double password;
    @Column
    String status;


    public Double getPassword() {
        return password;
    }

    public void setPassword(Double password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DbAbsenModel() {
    }

    public DbAbsenModel(String username, Double password, String status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }
}
