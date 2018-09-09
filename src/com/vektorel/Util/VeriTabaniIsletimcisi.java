package com.vektorel.Util;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class VeriTabaniIsletimcisi<T> implements ICRUD<T>{

	private Session ss;
	private Transaction tt;
	@Override
	public void Kaydet(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sil(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> Listele(T t) {
		// TODO Auto-generated method stub
		return null;
	}

}
