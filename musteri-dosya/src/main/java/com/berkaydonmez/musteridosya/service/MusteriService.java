package com.berkaydonmez.musteridosya.service;

import java.util.List;

import com.berkaydonmez.musteridosya.entity.Musteri;

public interface MusteriService {

	public void musteriEkleGuncelle(Musteri musteri);
	public void musteriSil(Musteri musteri);
	public List<Musteri> musteriGetir();
}
