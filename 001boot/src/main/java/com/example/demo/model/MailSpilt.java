package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MailSpit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailSpilt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String first;
	String Second;

}
