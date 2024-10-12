package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Auditoria;

public interface AuditoriaService {

	public abstract Auditoria save(Auditoria auditoria);
	public abstract List<Auditoria> listAllAuditorias();
}
