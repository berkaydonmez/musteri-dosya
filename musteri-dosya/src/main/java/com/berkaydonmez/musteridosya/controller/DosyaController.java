package com.berkaydonmez.musteridosya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.berkaydonmez.musteridosya.entity.Dosya;
import com.berkaydonmez.musteridosya.entity.Musteri;
import com.berkaydonmez.musteridosya.service.DosyaService;

@RestController
@RequestMapping("/dosya")
public class DosyaController {

	@Autowired
	DosyaService dosyaService;
	
    @PostMapping("/yukle/{musteriId}")
    public ResponseEntity<?> uploadFile(MultipartFile dosya, @PathVariable int musteriId) {
    	String dosyaAdi = dosya.getOriginalFilename();
    	    try {
    	    	byte[] bytea = dosya.getBytes();
    	    	dosyaService.dosyaYukle(bytea,dosyaAdi,musteriId);
    	    } catch (Exception e) {
    	      
    	    } 
    	    return ResponseEntity.ok("Dosya kaydedildi.");
    	  }
    
	@PostMapping("/guncelle/{dosyaId}")
	public ResponseEntity<?> dosyaGuncelle(MultipartFile dosya, @PathVariable int dosyaId) {
		String dosyaAdi = dosya.getOriginalFilename();
		try {
			byte[] bytea = dosya.getBytes();	
			dosyaService.dosyaGuncelle(bytea, dosyaId);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok("Dosya Guncellendi.");
	}
	
	@DeleteMapping("/sil")
	public ResponseEntity<Dosya> dosyaSil(@RequestBody Dosya dosya) {
		dosyaService.dosyaSil(dosya);
		return ResponseEntity.ok(dosya);
	}
	
	@GetMapping("/getir")
	public ResponseEntity<List<Dosya>> dosyaGetir() {
		
		return ResponseEntity.ok(dosyaService.dosyaGetir());
	}
    }





