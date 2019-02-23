package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
@NamedQuery(name = "Jobinfo.findAllData", query = "select u.tokenid,u.user from Jobinfo u")
,@NamedQuery(name = "Jobinfo.findByUser", query = "select u.tokenid,u.user from Jobinfo u where u.user=:user")
})
public class Jobinfo implements Serializable{
	@Id

	
    @Column(name = "tokenid")
    public String tokenid;
    
    @Column(name = "user")
    public String user;
    
   // @Column(name = "update_dt")
    //public Date update_dt;


	public String getTokenid() {
		return tokenid;
	}

	public void setTokenid(String tokenid) {
		this.tokenid = tokenid;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

//	public Date getUpdate_dt() {
//		return update_dt;
//	}

//	public void setUpdate_dt(Date update_dt) {
//		this.update_dt = update_dt;
//	}    
    
}
