package com.vektorel.Models;

public class tblurun {
	
	private String ad;
	private String tur;
	private String aciklama;
	private String resimurl;
	private long fiyat;
	private long adet;
	
	public void toplamfiyathesapla() {
		long toplamfiyat = fiyat*adet;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public String getResimurl() {
		return resimurl;
	}
	public void setResimurl(String resimurl) {
		this.resimurl = resimurl;
	}
	public long getFiyat() {
		return fiyat;
	}
	public void setFiyat(long fiyat) {
		this.fiyat = fiyat;
	}
	public long getAdet() {
		return adet;
	}
	public void setAdet(long adet) {
		this.adet = adet;
	}

}
