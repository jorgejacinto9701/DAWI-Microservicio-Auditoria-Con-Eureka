package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Auditoria;
import com.example.demo.service.AuditoriaService;

@RestController
@RequestMapping("/url/auditoria")
public class AuditoriaController {

	@Autowired
	private AuditoriaService auditoriaService;
	
	@GetMapping("/listar")
	public List<Auditoria> listarAuditorias() {
		return auditoriaService.listAllAuditorias();
	}
	
	@PostMapping("/registrar")
	public String guardarAuditoria(@RequestParam String tipoBaseDatos, 
								   @RequestParam String baseDeDatos, 
								   @RequestParam String tabla) {
		Auditoria obj = new Auditoria();
		obj.setTipoBaseDatos(tipoBaseDatos);
		obj.setBaseDeDatos(baseDeDatos);
		obj.setTabla(tabla);
		obj.setFechaRegistro(new Date());
		auditoriaService.save(obj);
		return "Auditoria registrada";
	}
	
}
