package com.berkaydonmez.musteridosya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "KULLANICI")
@Data
public class Kullanici {
    @Id 
	@Column(name = "KULLANICIID")
	private int kullaniciId;
	@Column(name = "KULLANICIADI")
	private String kullaniciAdi;
	@Column(name = "KULLANICISIFRE")
	private String kullaniciSifre;

}
