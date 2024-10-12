package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "auditoria")
public class Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAuditoria;
	
	@Column(name = "tipoBaseDatos", nullable = false, length = 100)
	private String tipoBaseDatos;
	
	@Column(name = "baseDeDatos", nullable = false, length = 200)
	private String baseDeDatos;
	
	@Column(name = "tabla", nullable = false, length = 100)
	private String tabla;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;
	
	
}
