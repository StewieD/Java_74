package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import DAO.sinhvienDAO;
import model.sinhvien;

public class QuanLySVtest {
	public static void main(String[] args) {
		ArrayList<sinhvien> listSV = new ArrayList<sinhvien>();
		Scanner sc = new Scanner(System.in);
		sinhvien sv1 = new sinhvien(null, null, 0, 0);
		int choose = 0;
		do {
			System.out.println("Nhap từ 1 - 9: ");
			try {
				choose = sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
			}
			switch (choose) {
			case 1:
				try {
					sv1 = sinhvienDAO.getInstance().fillInFo();
				} catch (Exception e) {
					// TODO: handle exception
				}
				if (listSV.add(sv1) == true)
					;
				System.out.println("nhập thành công");
				break;
			case 2:
				for (sinhvien sinhvien : listSV) {
					System.out.println(sinhvien.toString());
				}

			case 3:
				if (listSV.isEmpty() == true)
					System.out.println("Empty");
				else
					System.out.println("Có chứa phần tử");
				break;

			case 4:
				System.out.println("Có chứa " + listSV.size() + (" phần tử."));
				break;

			case 5:
				listSV.clear();
				System.out.println("Removed all");
				break;
			case 6:
				System.out.println("Nhập mã SV cần tìm: ");
				String maSinhVien = sc.next();
				sinhvien sv = new sinhvien(maSinhVien, null, 0, 0);
				if (listSV.contains(sv) == true)
					System.out.println("Sinh viên có trong danh sách");
				else
					System.out.println("Không tìm thấy");
				break;
			case 7:
				System.out.println("Nhập mã SV cần xóa: ");
				String maSinhVien1 = sc.next();
				sinhvien sv3 = new sinhvien(maSinhVien1, null, 0, 0);
				if (listSV.contains(sv3) == true) {
					if (listSV.remove(sv3) == true)
						System.out.println("Đã xóa");
				} else {
					System.out.println("Không tìm thấy trong danh sách");
				}
				break;
			case 8:
				System.out.println("Nhập họ và tên SV cần tìm: ");
				String hoVaTen = sc.next();
				for (sinhvien sinhvien : listSV) {
					if (sinhvien.getHoVaTen().indexOf(hoVaTen) >= 0) {
						System.out.println(sinhvien);
					}
				}
			case 9:
				Collections.sort(listSV, new Comparator<sinhvien>() {

					@Override
					public int compare(sinhvien o1, sinhvien o2) {
						System.out.println("ĐÃ sắp xếp từ cao đến thấp bấm 2 để xem ds");
						if (o1.getDiemTB() > o2.getDiemTB()) {
							return -1;
						} else if (o1.getDiemTB() < o2.getDiemTB()) {
							return 1;
						} else {
							return 0;
						}
					}
				});
			case 10:
				try {
					File file = new File("C:\\Java_73\\file.txt");
					OutputStream os =new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(os);
					for (sinhvien sinhvien : listSV) {
						oos.writeObject(sinhvien);
						oos.flush();
						oos.close();
					}
				} catch (Exception e) {
				}
			case 11: 
				try {
					File file = new File("C:\\Java_73\\file.txt");
					InputStream is =new FileInputStream(file);
					ObjectInputStream ois = new ObjectInputStream(is);
					sinhvien sinhvien = null;
					while (true) {
						sinhvien = (sinhvien) ois.readObject();
						if(sinhvien!=null) {
							listSV.add(sinhvien);
							System.out.println(sinhvien);
						}else if(sinhvien==null) {
							break;
						}
					}
					ois.close();
				} catch (Exception e) {
				}
			}
		} while (choose != 0);
	}

}
