
public class Main {

	public static void main(String[] args) {
		Course mat = new Course("Matematik", "MAT101", "MAT");
		Course fizik = new Course("Fizik", "FZK101", "FZK");
		Course kimya = new Course("Kimya", "KMY101", "KMY");
		
		Teacher t1 = new Teacher("Ahmet Tas", "90550000000", "MAT");
		Teacher t2 = new Teacher("Fatma Aliye", "90554000010", "FZK");
		Teacher t3 = new Teacher("Mustafa Ari", "90555000120", "KMY");
		
		mat.addteacher(t1);
		fizik.addteacher(t2);
		kimya.addteacher(t3);
		
		Student s1 = new Student("Kader", 4, "140144015", mat, fizik, kimya, mat, fizik, kimya);
		s1.addBulkExamNote(50, 89, 97, 76, 67, 78);
		s1.isPass();
		
		Student s2 = new Student("Mert", 4, "2211133", mat, fizik, kimya, mat, fizik, kimya);
		s2.addBulkExamNote(35, 45, 67, 78,23, 101);
		s2.isPass();
		
		Student s3 = new Student("Merve", 4, "221121312", mat, fizik, kimya, mat, fizik, kimya);
		s3.addBulkExamNote(0, 23, 101, 12, 0, 78);
		s3.isPass();



	}

}
