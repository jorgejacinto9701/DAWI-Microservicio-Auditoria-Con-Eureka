package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Auditoria;
import com.example.demo.repository.AuditoriaRepository;

@Service
public class AuditoriaServiceImpl implements AuditoriaService{

	@Autowired
	private AuditoriaRepository auditoriaRepository;
	
	@Override
	public Auditoria save(Auditoria auditoria) {
		return auditoriaRepository.save(auditoria);
	}
	
	@Override
	public List<Auditoria> listAllAuditorias() {
		return auditoriaRepository.findAll();
	}
}
