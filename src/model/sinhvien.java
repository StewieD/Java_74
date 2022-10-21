package model;

import java.io.Serializable;
import java.util.Objects;

public class sinhvien implements Comparable<sinhvien>, Serializable{
	private String maSV;
	private String hoVaTen;
	private int namSinh;
	private double diemTB;
	public sinhvien(String maSV, String hoVaTen, int namSinh, double diemTB) {
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	@Override
	public String toString() {
		return "sinhvien [maSV=" + maSV + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTB=" + diemTB + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sinhvien other = (sinhvien) obj;
		return  Objects.equals(maSV, other.maSV);
	}
	@Override
	public int compareTo(sinhvien o) {
		return this.maSV.compareTo(o.maSV);
	}	
}
