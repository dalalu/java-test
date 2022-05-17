package tesT;

public class test03 {

	public static void main(String[] args) {
			
				int hakJum = 100; char myGrade;
				
				switch(hakJum/10)
				
	{
					case 10:
					case 9:
						myGrade = 'A';
						break;
					case 8:
						myGrade = 'B';
						break;
					case 7:
						myGrade = 'C';
						break;
					case 6:
						myGrade = 'D';
						break;
					default:
						myGrade = 'F';
	}
				System.out.println("학생의 학점은" + myGrade + "학점입니다.");
	}
	}


