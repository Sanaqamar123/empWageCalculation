import java.util.*;

public class empWageCalculation {

        public static final int PartTime=1;
        public static final int FullTime=2;

        private final String company_name;
        private final int wagePerHour;
        private final int workingDays;
        private final int maxHoursInMonth;
        private int totalWage;

        empWageCalculation(String company_name,int wagePerHour,int workingDays,int maxHoursInMonth)
        {
        	this.company_name=company_name;
        	this.wagePerHour=wagePerHour;
        	this.workingDays=workingDays;
        	this.maxHoursInMonth=maxHoursInMonth;
        }
        public void setTotalEmpWage(int totalWage)
        {
        	this.totalWage=totalWage;
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
                HashMap<Integer,String> store=new  HashMap<Integer,String>();
                store.put(totalWage,company_name);
                Set set = store.entrySet();
                Iterator itobj = set.iterator();
                while(itobj.hasNext()) {
                	Map.Entry mapobj=(Map.Entry)itobj.next();
                	System.out.println("Total Wage : "+mapobj.getKey()+" Company Name : "+mapobj.getValue());

                }
                Set<Integer> keySet = store.keySet();
                ArrayList<Integer> listOfKeys=new ArrayList<Integer>(keySet);
                Collection<String> values=store.values();
                ArrayList<String> listOfValues=new ArrayList(values);
                System.out.println("Total wages : "+listOfKeys);
                System.out.println("Company name :"+listOfValues);

        }

        public int getTotalWage() {
    		return totalWage;
    }

        public String toString() {
        	return "\nTotal employee wage for Company "+company_name+" is "+totalWage;
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
                String company_name=se.nextLine();
                Company[i] = new empWageCalculation(company_name,wage_per_day,working_days,max_hours_in_month);
                Company[i].computeEmpWage();
                System.out.println(Company[i]);
                System.out.println("Total wage for "+company_name+" : "+Company[i].getTotalWage());
        }
        sc.close();
        se.close();
        }
}
