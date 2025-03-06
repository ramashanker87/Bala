package com.bala.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ParkingEnd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   private String parkingNo;
    private Date startTime;  //(Should always current time)
    private Date endTime;   // ( End time)
    private int price;
    private String Status;  //(End)
    private String regNo;

//    public String getParkingNo() {
//        return parkingNo;
//    }
//
//    public void setParkingNo(String parkingNo) {
//        this.parkingNo = parkingNo;
//    }
//
//    public Date getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(Date startTime) {
//        this.startTime = startTime;
//    }
//
//    public Date getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(Date endTime) {
//        this.endTime = endTime;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getStatus() {
//        return Status;
//    }
//
//    public void setStatus(String status) {
//        Status = status;
//    }
//
//    public String getRegNo() {
//        return regNo;
//    }
//
//    public void setRegNo(String regNo) {
//        this.regNo = regNo;
//    }
}
