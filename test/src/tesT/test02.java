package tesT;

public class test02 {

	public static void main(String[] args) {
		
		
        int A[]={98,70,45,60,83};
        int sum=0;
        double avg=0;
        int max=0;
        int min=999;
        int n= A.length;
        for (int i=0; i<n;i++){
            sum += A[i];
            
            if(A[i] > max) max = A[i];
            if(A[i] < min) min = A[i];
        }
        
        avg = (double)sum / A.length;
        System.out.println("총점="+ sum);
        System.out.println("평균="+ avg);
        System.out.println("최고점수="+ max);
        System.out.println("최저점수="+ min);
    }
}
		
		
		

