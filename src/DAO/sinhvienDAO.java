package DAO;

import java.util.Scanner;

import model.sinhvien;

public class sinhvienDAO implements DAOinterface<sinhvien> {
	Scanner sc = new Scanner(System.in);
	public static sinhvienDAO getInstance(){
		return new sinhvienDAO();
	}
	
	@Override
	public void checEmpty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void check(sinhvien t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(sinhvien t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkByName(sinhvien t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printPointHightoLow(sinhvien t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public sinhvien fillInFo() {
		System.out.println("Họ tên: ");
		String hoVaTen = sc.nextLine();
		System.out.println("Mã SV: ");
		String maSV =sc.nextLine();
		System.out.println("Năm Sinh: ");
		int	namSinh = sc.nextInt();
		System.out.println("Điểm TB: ");
		double diemTB =sc.nextDouble();
		
		sinhvien sv = new sinhvien(maSV, hoVaTen, namSinh, diemTB);
		return sv;
	}

}
