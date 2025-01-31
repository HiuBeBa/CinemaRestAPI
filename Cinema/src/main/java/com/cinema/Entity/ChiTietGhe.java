package com.cinema.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ChiTietGhe")
public class ChiTietGhe{
	@Id
	@Column(name = "Ma_CTGhe")
	private Integer maCTGhe;

	@Column(name = "Ma_Phong")
	private String maPhong;
	@ManyToOne
	@JoinColumn(name = "Ma_Ghe")
	private Ghe ghe;
}
