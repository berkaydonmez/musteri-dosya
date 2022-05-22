package com.berkaydonmez.musteridosya.service;

import java.util.List;

import com.berkaydonmez.musteridosya.entity.Dosya;

public interface DosyaService {

	public void dosyaYukle(byte[] file, String dosyaAdi, int musteriId);
	public void dosyaGuncelle(byte[] file, int dosyaId);
	public void dosyaSil(Dosya dosya);
	public List<Dosya> dosyaGetir();
	
}
