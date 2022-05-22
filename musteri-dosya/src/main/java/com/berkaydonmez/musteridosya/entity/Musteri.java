package com.berkaydonmez.musteridosya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "MUSTERI")
@Data
public class Musteri {
    @Id
    @SequenceGenerator(name="seq",sequenceName="musteri_seq", initialValue = 1, allocationSize = 1)        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
	@Column(name = "MUSTERI_ID")
	private int musteriId;
	@Column(name = "MUSTERIADSOYAD")
	private String kullaniciAdSoyad;
	@Column(name = "EMAIL")
	private String eMail;

}
