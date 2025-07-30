package practise;

public class gradecalculation3 {

	public static void main(String[] args) {
		int totalstudents =90;
		int boys = 45;
		int gradeAstudents = totalstudents *50 / 100;
		int boyswithgradeA = 20;
		
		int girlswithgradeA = gradeAstudents - boyswithgradeA;
		
		System.out.println("Total number of girls getting grade A are:" + girlswithgradeA);

	}

}
