package com.cinema.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "the_loai")
public class TheLoaiPhim {
	@Id
    @Column(name = "Ma_The_Loai")
    private String maTheLoai;
    @Column(name = "Ten_The_Loai")
    private String tenTheLoai;
}
