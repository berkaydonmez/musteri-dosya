package com.berkaydonmez.musteridosya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berkaydonmez.musteridosya.entity.Dosya;
import com.berkaydonmez.musteridosya.repository.DosyaRepository;
import com.berkaydonmez.musteridosya.service.DosyaService;

@Service
public class DosyaServiceImpl implements DosyaService{

	@Autowired
	DosyaRepository dosyaRepository;
	
	@Override
	public void dosyaYukle(byte[] file, String dosyaAdi, int musteriId) {
		Dosya dosya = new Dosya();
		dosya.setDosya(file);
		dosya.setDosyaAdi(dosyaAdi);
		dosya.setMusteriId(musteriId);
		dosyaRepository.save(dosya);
	}

	@Override
	public void dosyaGuncelle(byte[] file, int dosyaId) {
		Dosya dosya = new Dosya();
		dosya.setDosya(file);
		dosya.setDosyaId(dosyaId);
		dosyaRepository.save(dosya);
	}

	@Override
	public void dosyaSil(Dosya dosya) {
		dosyaRepository.delete(dosya);
		
	}

	@Override
	public List<Dosya> dosyaGetir() {
		return dosyaRepository.findAll();
	}

}
