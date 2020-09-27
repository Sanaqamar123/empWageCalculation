public class empWageCalculation {

	public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Calculation");

	double num1 = Math.floor(Math.random()*10)%2;

		if(num1 == 0) {
			System.out.println("Employee is present");
		}
		else
			System.out.println("Employee is absent");

	int WagePerHour=20;
	int FullDayHour=8;
	int WagePerDay=WagePerHour*FullDayHour;
	System.out.println("Wage Per day : "+WagePerDay);

	int PartTimeHour=8;
	int WagePartTimePerDay=WagePerHour*PartTimeHour;
	System.out.println("Part time wage per day : "+WagePartTimePerDay);

	int WorkHour=0;
	int choice = (int)(Math.floor(Math.random()*10)%3);
	switch(choice) {
	case 1:
		System.out.println("Employee is full time");
		WorkHour=8;
		break;

	case 2:
		System.out.println("Employee is part time");
		WorkHour=8;
		break;

	default :
		System.out.println("Employee absent");
		break;
	}

	int WorkingDayPerMonth=20;
	int TotalWagePerMonth=WorkingDayPerMonth*WagePerDay;
	System.out.println("Total wage per month : "+TotalWagePerMonth);

	int day=1;
	while(day <= WorkingDayPerMonth)
	{
		int Wage=WagePerDay*day;
		System.out.println("Wage for "+day+" : "+Wage);
		day=day+1;
	}

	}
}
