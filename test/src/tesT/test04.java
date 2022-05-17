package tesT;

public class test04 {

	public static void main(String[] args) {
		
		int a[] = {98, 70, 45, 60, 83};
		int myRank[] = new int[5];
		
		for(int i=0; i<a.length; i++) {
		    myRank[i] = 1;
			for(int j=0; j<a.length;j++) {
				if(a[i] < a[j])
					myRank[i] +=1;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("점수:"+ a[i] + "\t"+"등수:"+myRank[i]);
		}

	}

}
