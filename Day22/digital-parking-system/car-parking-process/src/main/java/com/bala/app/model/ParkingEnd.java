package com.bala.app.model;

import java.time.LocalDateTime;
import java.time.temporal.Temporal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

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
    private LocalDateTime startTime;  //(Should always current time)
    private LocalDateTime endTime;   // ( End time)
    private int price;
    private String Status;  //(End)
    private String regNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getParkingNo() {
        return parkingNo;
    }

    public void setParkingNo(String parkingNo) {
        this.parkingNo = parkingNo;
    }

    public Temporal getStartTime() {
        return (Temporal) startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Temporal getEndTime() {
        return (Temporal) endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getRegNo(String regNo) {
        return this.regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    @Override
    public String toString() {
        return "ParkingEnd{" +
                "id=" + id +
                ", parkingNumber='" + parkingNo + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", price=" + price +
                ", status='" + Status + '\'' +
                ", registrationNumber='" + regNo + '\'' +
                '}';
    }

}