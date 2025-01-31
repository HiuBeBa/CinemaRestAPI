package com.cinema.Entity;

import java.util.Date;
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
@Table(name = "nhan_vien")
public class NhanVien {
	@Id
    @Column(name = "Ma_NV")
    private String maNV;
    @Column(name = "Ho_Ten")
    private String hoTen;
    @Column(name = "Gioi_Tinh")
    private Boolean GioiTinh;
    @Column(name = "Mat_Khau")
    private String matKhau;
    @Column(name = "Ngay_Sinh")
    private Date ngaySinh;
    @Column(name = "So_DT")
    private String soDT;
    @ManyToOne
    @JoinColumn(name = "Ma_CV")
    private ChucVu chucVu;
}
