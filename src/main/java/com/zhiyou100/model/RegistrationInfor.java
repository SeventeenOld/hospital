package com.zhiyou100.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class RegistrationInfor {
    private String medicalRecord;

    private String name;

    private Integer certificateType;

    private String idNum;

    private String socialSafeNum;

    private String phone;

    private Integer selfPaying;

    private Integer sex;

    private String career;

    private String earlyAppointment;

    private String doctorName;

    private String status;

    private String noted;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date time;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startTime;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endTime;
    
	private String sectionName;

    private Integer age;

    private Double registrationFee;

	public String getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(String medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(Integer certificateType) {
		this.certificateType = certificateType;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getSocialSafeNum() {
		return socialSafeNum;
	}

	public void setSocialSafeNum(String socialSafeNum) {
		this.socialSafeNum = socialSafeNum;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSelfPaying() {
		return selfPaying;
	}

	public void setSelfPaying(Integer selfPaying) {
		this.selfPaying = selfPaying;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getEarlyAppointment() {
		return earlyAppointment;
	}

	public void setEarlyAppointment(String earlyAppointment) {
		this.earlyAppointment = earlyAppointment;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNoted() {
		return noted;
	}

	public void setNoted(String noted) {
		this.noted = noted;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(Double registrationFee) {
		this.registrationFee = registrationFee;
	}

	@Override
	public String toString() {
		return "RegistrationInfor [medicalRecord=" + medicalRecord + ", name=" + name + ", certificateType="
				+ certificateType + ", idNum=" + idNum + ", socialSafeNum=" + socialSafeNum + ", phone=" + phone
				+ ", selfPaying=" + selfPaying + ", sex=" + sex + ", career=" + career + ", earlyAppointment="
				+ earlyAppointment + ", doctorName=" + doctorName + ", status=" + status + ", noted=" + noted
				+ ", time=" + time + ", startTime=" + startTime + ", endTime=" + endTime + ", sectionName="
				+ sectionName + ", age=" + age + ", registrationFee=" + registrationFee + "]";
	}
 
    

}