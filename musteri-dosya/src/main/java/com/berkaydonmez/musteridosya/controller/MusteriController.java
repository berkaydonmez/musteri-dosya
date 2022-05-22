package com.berkaydonmez.musteridosya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berkaydonmez.musteridosya.entity.Musteri;
import com.berkaydonmez.musteridosya.service.MusteriService;

@RestController
@RequestMapping("/musteri")
public class MusteriController {

	@Autowired
	private MusteriService musteriService;
	
	@PostMapping("/ekle")
	public ResponseEntity<Musteri> musteriEkle(@RequestBody Musteri musteri) {
		musteriService.musteriEkleGuncelle(musteri);
		return ResponseEntity.ok(musteri);
	}

	@PostMapping("/guncelle")
	public ResponseEntity<Musteri> musteriGuncelle(@RequestBody Musteri musteri) {
		musteriService.musteriEkleGuncelle(musteri);
		return ResponseEntity.ok(musteri);
	}
	
	@DeleteMapping("/sil")
	public ResponseEntity<Musteri> musterisil(@RequestBody Musteri musteri) {
		musteriService.musteriSil(musteri);
		return ResponseEntity.ok(musteri);
	}
	
	@GetMapping("/getir")
	public ResponseEntity<List<Musteri>> musteriGetir() {
		
		return ResponseEntity.ok(musteriService.musteriGetir());
	}
	
}
