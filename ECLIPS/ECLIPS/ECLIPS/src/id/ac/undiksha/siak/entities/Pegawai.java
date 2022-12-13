package id.ac.undiksha.siak.entities;

public class Pegawai {
	private String nip;
	private String nama;
	private Boolean jenisKelamin;//0 Laki-laki 1 perempuan
	private String alamat;
	private String jabatan;
	private String unit;
	
	public Pegawai(String nip, String nama, Boolean jenisKelamin, String alamat, String jabatan, String unit) {
		super();
		this.nip = nip;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
		this.jabatan = jabatan;
		this.unit = unit;
	}
	
	public Pegawai() {
		this.setNip("<NIP belum diisi>"); 
		this.setNama("<nama belum diisi>"); 
		this.setAlamat("<alamat belum diisi>"); 
		this.setJabatan("<jabatan belum diisi>"); 
		this.setUnit("<unit belum diisi>"); 
	}
	
	public void printAllInfo() {
		System.out.println("NIP: "		+ this.getNip());
		System.out.println("Nama: "		+ this.getNama());
		System.out.println("Alamat: "	+ this.getAlamat());
		System.out.println("Jabatan: "	+ this.getJabatan());
		System.out.println("Unit: "	+ this.getUnit());
		System.out.println("Jenis Kelamin: " +
				(jenisKelamin ? "Laki-laki" : "Perempuan")
		);
	}
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public Boolean getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(Boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}
