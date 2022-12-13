package id.ac.undiksha.siak.entities;

public class Dosen {
	private String nip;
	private String nama;
	private Boolean jenisKelamin;//0 Laki-laki 1 perempuan
	private String alamat;
	private String jabatan;
	private String prodi;
	private String jurusan;
	private String fakultas;
	
	
	public Dosen(String nip, String nama, Boolean jenisKelamin, String alamat, String jabatan, String prodi, String jurusan, String fakultas) {
		super();
		this.nip = nip;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
		this.jabatan = jabatan;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}
	
	public Dosen() {
		this.setNip("<NIP belum diisi>"); 
		this.setNama("<nama belum diisi>"); 
		this.setAlamat("<alamat belum diisi>"); 
		this.setJabatan("<jabatan belum diisi>"); 
		this.setProdi("<prodi belum diisi>"); 
		this.setJurusan("<jurusan belum diisi>"); 
		this.setFakultas("<fakultas belum diisi>"); 
	}
	
	public void printAllInfo() {
		System.out.println("NIP: "		+ this.getNip());
		System.out.println("Nama: "		+ this.getNama());
		System.out.println("Alamat: "	+ this.getAlamat());
		System.out.println("Jabatan: "	+ this.getJabatan());
		System.out.println("Prodi: "	+ this.getProdi());
		System.out.println("Jurusan: "	+ this.getJurusan());
		System.out.println("Fakultas: "	+ this.getFakultas());
		
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
	public String getProdi() {
		return prodi;
	}
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getFakultas() {
		return fakultas;
	}
	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
	
	

}
