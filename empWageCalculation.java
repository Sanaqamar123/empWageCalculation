import java.util.*;

public class empWageCalculation {

        public static final int PartTime=1;
        public static final int FullTime=2;

        private final String name;
        private final int wagePerHour;
        private final int workingDays;
        private final int maxHoursInMonth;
        private int totalWage;

        empWageCalculation(String name,int wagePerHour,int workingDays,int maxHoursInMonth)
        {
        	this.name=name;
        	this.wagePerHour=wagePerHour;
        	this.workingDays=workingDays;
        	this.maxHoursInMonth=maxHoursInMonth;
        }

        Scanner sc = new Scanner(System.in);

        public void computeEmpWage() {

                int WorkHours=0, totalHours=0, days=0;

                while(totalHours <= maxHoursInMonth && days < workingDays) {

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
                }

                totalWage=totalHours*wagePerHour;

        }
        public String toString() {
        	return "\nTotal employee wage for Company "+name+" is "+totalWage;
        }

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner se = new Scanner(System.in);
        System.out.print("How Many Company's wages you want to calculate  : ");
        int n = sc.nextInt();
        empWageCalculation Company[] = new empWageCalculation[n];

        for (int i = 0; i < n; i++) {

                System.out.println("\nEnter wage per day : ");
                int wage_per_day = sc.nextInt();

                System.out.println("\nTotal working days : ");
                int working_days = sc.nextInt();

                System.out.println("\nMaximum hours in a month");
                int max_hours_in_month = sc.nextInt();

                System.out.println("\nCompany name:");
                String name=se.nextLine();
                Company[i] = new empWageCalculation(name,wage_per_day,working_days,max_hours_in_month);
                Company[i].computeEmpWage();
                System.out.println(Company[i]);
        }
        sc.close();
        se.close();
        }
}
