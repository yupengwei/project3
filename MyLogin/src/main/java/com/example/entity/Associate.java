package com.example.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Associate{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String username;
    private String usertele;
    private String cartype;
    private String carnumber;
    private String drivername;
    private String drivertele;
    private String time;
    private String paymoney;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertele() {
        return usertele;
    }

    public void setUsertele(String usertele) {
        this.usertele = usertele;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getDrivertele() {
        return drivertele;
    }

    public void setDrivertele(String drivertele) {
        this.drivertele = drivertele;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(String paymoney) {
        this.paymoney = paymoney;
    }

    @Override
    public String toString() {
        return "Associate{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", usertele='" + usertele + '\'' +
                ", cartype='" + cartype + '\'' +
                ", carnumber='" + carnumber + '\'' +
                ", drivername='" + drivername + '\'' +
                ", drivertele='" + drivertele + '\'' +
                ", time='" + time + '\'' +
                ", paymoney='" + paymoney + '\'' +
                '}';
    }
}
