package id.ac.undiksha.www;

import id.ac.undiksha.siak.entities.Mahasiswa;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNama("Adi");
		mhs1.setAlamat("Singaraja");
		System.out.println(mhs1.getNama());
		
		Mahasiswa mhs2 = new Mahasiswa(
				"budi",
				"Denpasar", 
				"123456789",
				true,
				"ilmu komputer",
				"teknik informatika",
				"FTK"
				);
		
		mhs2.printAllInfo();
	}

}
