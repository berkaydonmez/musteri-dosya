package com.berkaydonmez.musteridosya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berkaydonmez.musteridosya.entity.Kullanici;

public interface KullaniciRepository extends JpaRepository<Kullanici, Integer>{

	Kullanici findByKullaniciAdi(String kullaniciAdi);
}
