public class empWageCalculation {

  	public static final int PartTime=8;
	public static final int FullTime=8;
	public static final int WagePerHour=20;
	public static final int WorkingDays=20;
	public static final int MaxHoursInMonth=100;
	//refactoring the code of employee wage computaton problem
	public static int refactorEmpWageProblem() {
		int WorkHours=0, totalHours=0, days=0;
		while(totalHours <= MaxHoursInMonth && days < WorkingDays) {
			days++;
			int choice = (int)Math.floor(Math.random()*10)%3;
			switch(choice) {
			case 1 :
				WorkHours=8;
				break;

			case 2 :
				WorkHours=8;
				break;
			default :
				WorkHours=0;
			}
			totalHours+=WorkHours;
			System.out.println("Day : "+days+"Hours :"+totalHours);
		}
		int totalWage=totalHours*WagePerHour;
		System.out.println("Total employee Wage : "+totalWage);
		return totalWage;
	}
	public static void main(String[] args) {
		refactorEmpWageProblem();
	}
}
