package com.vektorel.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.Dal.tblurundao;
import com.vektorel.Models.tblurun;

@ManagedBean(name="indexBean")
@SessionScoped
public class indexBean {
	

	tblurundao db = new tblurundao();
	private List<tblurun> liste = new ArrayList<>();
	
	public void sayfasec(int id) {
		
		switch (id) {
		case 1:
			
			break;

		default:
			break;
		}
	}
	
	public List<tblurun> getListe() {
		return liste;
	}
	public void setListe(List<tblurun> liste) {
		this.liste = liste;
	}
	

}
