
public class Student {
	String name;
	String stuNo;
	int classes;
	Course matematik;
	Course fizik;
	Course kimya;
	Course vivaMat;
	Course vivaKmy;
	Course vivaFzk;
	double avarage;
	boolean isPass;
	
	Student(String name, Integer classes, String stuNo, Course matematik, Course fizik, Course kimya, Course vivaMat, Course vivaFzk, Course vivaKmy){
		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.matematik = matematik;
		this.fizik = fizik;
		this.kimya = kimya;
		this.vivaMat = vivaMat;
		this.vivaFzk = vivaFzk;
		this.vivaKmy = vivaKmy;
		calcAvarage();
		this.isPass = false;
		
	}
	public void addBulkExamNote(int matematik, int vivaMat, int fizik, int vivaFzk, int kimya, int vivaKmy) {
		if (matematik>=0 && matematik<=100) {
			this.matematik.note = matematik;
		}
		if (fizik>=0 && fizik<=100) {
			this.fizik.note = fizik;
		}
		if (kimya>=0 && kimya<=100) {
			this.kimya.note = kimya;
		}
		if (vivaMat>=0 && vivaMat<=100) {
			this.matematik.viva = vivaMat;
		}
		if (vivaFzk>=0 && vivaFzk<=100) {
			this.fizik.viva = vivaFzk;
		}
		if (vivaKmy>=0 && vivaKmy<=100) {
			this.kimya.viva = vivaKmy;
		}
	}
	public void  isPass() {
		if (this.matematik.note == 0 || this.fizik.note == 0 || this.matematik.note == 0 || this.matematik.viva == 0 || this.fizik.viva == 0 || this.matematik.viva == 0 ) {
			System.out.println("-------------------------------");
			System.out.println("Notlar ve sozluler tam olarak girilmemis");
		}
		else {
			this.isPass = isCheckpass();
			printNote();
			System.out.println("Ortalama :"+this.avarage);
			if (this.isPass) {
				System.out.println("Sinifi Gecti.");
			}
			else {
				System.out.println("Sinifta Kaldi.");
			}
		}
		
	}
    public void  calcAvarage() {
		this.avarage = ((this.matematik.note*0.80 + this.vivaMat.viva*0.20 )+(this.fizik.note*0.80 + this.vivaFzk.viva*0.20 )+(this.kimya.note*0.80 + this.vivaKmy.viva*0.20))/3;
	}
    public boolean isCheckpass() {
    	calcAvarage();
		return this.avarage > 55;
    	
    }
    public void  printNote() {
		System.out.println("----------------------");
		System.out.println("Ogrenci: "+this.name);
		System.out.println("Metamtik Notu: "+this.matematik.note);
		System.out.println("Metamtik Sozlu Notu : "+this.vivaMat.viva);
		System.out.println("Fizik Notu: "+this.fizik.note);
		System.out.println("Fizik Sozlu Notu : "+this.vivaFzk.viva);
		System.out.println("Kimya Notu: "+this.kimya.note);
		System.out.println("Kimya Sozlu Notu : "+this.vivaKmy.viva);

	}

}
