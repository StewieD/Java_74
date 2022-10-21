package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

import model.sinhvien;

public class ViDuDocDoiTuong {
	public static void main(String[] args) {
		File file = new File("C:\\Java_73\\file.txt");
		try {
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			List<sinhvien> listSV = null;
			while (true) {
				sinhvien sv = (sinhvien) ois.readObject();
				if (sv != null) {
					listSV.add(sv);
				} else if(sv==null) {
					break;
				}
			}
			ois.close();
			for (sinhvien sinhvien : listSV) {
				System.out.println(sinhvien);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
