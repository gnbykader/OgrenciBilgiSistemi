
public class Course {
	String name;
	String code;
	String prefix;
	Teacher courseTeacher;
	int note;
	int viva;
	
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.viva = 0;
	}
	
	public void addteacher(Teacher t) {
		if (this.prefix.equals(t.branch)) {
			this.courseTeacher = t;
			System.out.println("Islem Basarili");
		}
		else {
			System.out.println(t.name+" Akademisyeni bu dersi veremez.");
		}
	}
	public void printTeacher() {
		if (courseTeacher != null) {
			System.out.println(this.name+" dersinin Akedemisyeni: "+courseTeacher.name);
		}
		else {
			System.out.println(this.name+" dersine akedemisyen atanmamistir.");
		}
	}


}
