package obj;

public class Xe {
	private int  maXe;
	private String soKhung;
	private String soMay;
        private int maMauXe;

    public int getMaMauXe() {
        return maMauXe;
    }

    public void setMaMauXe(int maMauXe) {
        this.maMauXe = maMauXe;
    }
    
	public int getMaXe() {
		return maXe;
	}
	public void setMaXe(int maXe) {
		this.maXe = maXe;
	}
	public String getSoKhung() {
		return soKhung;
	}
	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}
	public String getSoMay() {
		return soMay;
	}
	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}

    public Xe(int maXe, String soKhung, String soMay,int maMauXe) {
        this.maXe = maXe;
        this.soKhung = soKhung;
        this.soMay = soMay;
        this.maMauXe = maMauXe;
    }

   

	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Xe [maXe=" + maXe + ", soKhung=" + soKhung + ", soMay=" + soMay + "]";
	}

}
