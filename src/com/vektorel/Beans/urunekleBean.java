package com.vektorel.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.Dal.tblurundao;
import com.vektorel.Models.tblurun;

@ManagedBean(name="urunekleBean")
@SessionScoped
public class urunekleBean {

	tblurundao db = new tblurundao();
	List<tblurun> urunlistesi = new ArrayList<>();
	private tblurun urun = new tblurun();
	public void Kaydet() {
		
	db.Kaydet(urun);	
	}
	
	public tblurun getUrun() {
		return urun;
	}
	public void setUrun(tblurun urun) {
		this.urun = urun;
	}

	
	
}
