package com.berkaydonmez.musteridosya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berkaydonmez.musteridosya.entity.Musteri;
import com.berkaydonmez.musteridosya.repository.MusteriRepository;
import com.berkaydonmez.musteridosya.service.MusteriService;

@Service
public class MusteriServiceImpl implements MusteriService{

	@Autowired
	MusteriRepository musteriRepository;
	@Override
	public void musteriEkleGuncelle(Musteri musteri) {
		musteriRepository.save(musteri);
	}
	@Override
	public void musteriSil(Musteri musteri) {
		musteriRepository.delete(musteri);
		
	}
	@Override
	public List<Musteri> musteriGetir() {
		
		return musteriRepository.findAll();
	}
}
