package id.ac.undiksha.www;

import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa(
				"budi",
				"Denpasar", 
				"123456789",
				true,
				"ilmu komputer",
				"teknik informatika",
				"FTK"
				);

		
		Dosen dos1 = new Dosen(
				"1221111",
				"Agus",
				true,
				"singaraja",
				"Koorprodi",
				"TRPL",
				"Teknologi Industri",
				"FTK"
				);
		
		Pegawai pgw1 = new Pegawai(
				"233882828",
				"Govinda",
				true,
				"Singaraja",
				"Satpam",
				"No Info"
				);
		mhs1.printAllInfo();
		System.out.println("\n");
		dos1.printAllInfo();
		System.out.println("\n");
		pgw1.printAllInfo();
		
	}

}
