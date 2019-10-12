package com.zhiyou100.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Doctor {
    private Integer id;

    private String name;

    private Integer certificateType;

    private String idNum;

    private String phone;

    private String specialPlane;

    private Integer sex;

    private Integer age;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birther;

    private String email;

    private Integer sectionId;
    
    private Section section;

    private String education;

    private String noted;

    private Date time;
    

    public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        this.idNum = idNum == null ? null : idNum.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSpecialPlane() {
        return specialPlane;
    }

    public void setSpecialPlane(String specialPlane) {
        this.specialPlane = specialPlane == null ? null : specialPlane.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    

    public Date getBirther() {
		return birther;
	}

	public void setBirther(Date birther) {
		this.birther = birther;
	}

	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    

    public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getNoted() {
        return noted;
    }

    public void setNoted(String noted) {
        this.noted = noted == null ? null : noted.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", certificateType=" + certificateType + ", idNum=" + idNum
				+ ", phone=" + phone + ", specialPlane=" + specialPlane + ", sex=" + sex + ", age=" + age + ", birther="
				+ birther + ", email=" + email + ", sectionId=" + sectionId + ", section=" + section + ", education="
				+ education + ", noted=" + noted + ", time=" + time + "]";
	}

	public Doctor(String name) {
		super();
		this.name = name;
	}
	
	
	public Doctor() {
		super();
	}

	
	
    
    
    
}