package com.zhiyou100.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class ChargeManager {
    private Integer id;

    private String medicalRecord;

    private Integer payItemsId;

    private Double chargeMoney;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date chargeTime;
    
    private RegistrationInfor regis;
    
    private PayItems pay;
    
    private String name;
    
    
    
    

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RegistrationInfor getRegis() {
		return regis;
	}

	public void setRegis(RegistrationInfor regis) {
		this.regis = regis;
	}

	public PayItems getPay() {
		return pay;
	}

	public void setPay(PayItems pay) {
		this.pay = pay;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord == null ? null : medicalRecord.trim();
    }

    public Integer getPayItemsId() {
        return payItemsId;
    }

    public void setPayItemsId(Integer payItemsId) {
        this.payItemsId = payItemsId;
    }

    public Double getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(Double chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    

	public Date getChargeTime() {
		return chargeTime;
	}

	public void setChargeTime(Date chargeTime) {
		this.chargeTime = chargeTime;
	}

	@Override
	public String toString() {
		return "ChargeManager [id=" + id + ", medicalRecord=" + medicalRecord + ", payItemsId=" + payItemsId
				+ ", chargeMoney=" + chargeMoney + ", chargeTime=" + chargeTime + ", regis=" + regis + ", pay=" + pay
				+ ", name=" + name + "]";
	}

	

	

	
    
}