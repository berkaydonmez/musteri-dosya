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
@Table(name = "DOSYA")
@Data
public class Dosya {

	@Id
    @SequenceGenerator(name="seq",sequenceName="dosya_seq", initialValue = 1, allocationSize = 1)        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name = "DOSYA_ID")
	private int dosyaId;
	@Column(name = "DOSYA_ADI")
	private String dosyaAdi;
	@Column(name = "MUSTERI_ID")
	private int musteriId;
	@Column(name = "dosya")
	private byte[] dosya;
}
