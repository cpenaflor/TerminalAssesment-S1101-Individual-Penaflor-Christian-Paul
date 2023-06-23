package milestone1;

import java.util.Scanner;



public class MotorPH {

	public static void main(String[] args) {
        Scanner strScanner = new Scanner(System.in);
        Scanner fltScanner = new Scanner(System.in);
        
        System.out.println("WELCOME TO MOTORPH PAYROLL SYSTEM");
        System.out.println("by: Christian Paul Penaflor");
        System.out.println("-----------------------------------------");
        
        EmployeeData _employee = new EmployeeData();
        System.out.print("Enter Employee No: ");
        _employee.SetEmployeeNo(strScanner.nextLine());

        System.out.print("Enter Employee Name: ");
        _employee.SetEmployeeName(strScanner.nextLine());

        System.out.print("Enter Total Hour: ");
        _employee.SetTotalhour(fltScanner.nextFloat());
 

        System.out.print("Enter Hourly Rate: ");
        _employee.SetHourlyRate(fltScanner.nextFloat());

        float ave = _employee.ComputeAverageHour();
        float hr = _employee.GetHourlyRate();
        String employeeno = _employee.GetEmployeeNo();
        String employeename = _employee.GetEmployeeName();
        System.out.println("-----------------------------------------");
        System.out.println("-----MOTORPH PAYSLIP-----");
        System.out.println("Employee No.:		" + employeeno);
        System.out.println("Employee Name.:		" + employeename);
        System.out.println("Employee Total Hour:	" + ave);
        System.out.println("Employee Hourly Rate:	" + hr);
        System.out.println("Total Salary:		" + ave * hr);
        System.out.println("-----------------------------------------");
        System.out.println("Deductions");

//PAGIBIG 
        double salary = ave * hr;
        double employeEContributionRatePAGIBIG;
        double employeRContributionRatePAGIBIG;
              
        if (salary >= 1000 && salary <= 1500) {
            employeEContributionRatePAGIBIG = 0.01;
            employeRContributionRatePAGIBIG = 0.02;
        } else if (salary > 1500) {
            employeEContributionRatePAGIBIG = 0.02;
            employeRContributionRatePAGIBIG = 0.02;
        } else {
            employeEContributionRatePAGIBIG = 0.0;
            employeRContributionRatePAGIBIG = 0.0;
        }
        
        double employeEContributionPercent = salary * employeEContributionRatePAGIBIG;
        double employeRContributionPercent = salary * employeRContributionRatePAGIBIG;
        double pagibigdeduction = employeEContributionPercent + employeRContributionPercent;
        if (pagibigdeduction > 100) {
        	pagibigdeduction = 100;            
        }
        System.out.println("Pagibig:		" + pagibigdeduction);
       
//PHILHEALTH  
        double phPremiumRate = 0.03;
        double philhealthdeduction = salary * phPremiumRate;
        if (salary >= 0.00 && salary <= 10000) {
        	philhealthdeduction = 300;
        } else if (salary >= 10000.01 && salary <= 59999.99) {
        	philhealthdeduction = Math.min(1800, salary * phPremiumRate);
        } else if (salary >= 60000) {
        	philhealthdeduction = 1800;
        }
        double philhealthdeduction50percent = philhealthdeduction / 2;    //Because the employee share 50%
        System.out.print("Philhealth:		" + philhealthdeduction50percent + (" Employer Share 50%: ") );
        System.out.print(philhealthdeduction50percent);
        System.out.println(" Total Philhealth: " + philhealthdeduction);
        
    
//SSS 
        double sssdeduction = salary ;
        if (salary < 3250) {
        	sssdeduction = 135;
        } else if (salary <= 3750) {
        	sssdeduction = 157.50;
        } else if (salary <= 4250) {
        	sssdeduction = 180.00;
        } else if (salary <= 4750) {
        	sssdeduction = 202.50;
        } else if (salary <= 5250) {
        	sssdeduction = 225.00;
        } else if (salary <= 5750) {
        	sssdeduction = 247.50;
        } else if (salary <= 6250) {
        	sssdeduction = 270.00;
        } else if (salary <= 6750) {
        	sssdeduction = 292.50;
        } else if (salary <= 7250) {
        	sssdeduction = 315.00;
        } else if (salary <= 7750) {
        	sssdeduction = 337.50;
        } else if (salary <= 8250) {
        	sssdeduction = 360.00;
        } else if (salary <= 8750) {
        	sssdeduction = 382.50;
        } else if (salary <= 9250) {
        	sssdeduction = 405.00;
        } else if (salary <= 9750) {
        	sssdeduction = 427.50;
        } else if (salary <= 10250) {
        	sssdeduction = 450.00;
        } else if (salary <= 10750) {
        	sssdeduction = 472.50;
        } else if (salary <= 11250) {
        	sssdeduction = 495.00;
        } else if (salary <= 11750) {
        	sssdeduction = 517.50;
        } else if (salary <= 12250) {
        	sssdeduction = 540.00;
        } else if (salary <= 12750) {
        	sssdeduction = 562.50;
        } else if (salary <= 13250) {
        	sssdeduction = 585.00;
        } else if (salary <= 13750) {
        	sssdeduction = 607.50;
        } else if (salary <= 14250) {
        	sssdeduction = 630.00;
        } else if (salary <= 14750) {
        	sssdeduction = 652.50;
        } else if (salary <= 15250) {
        	sssdeduction = 675.00;
        } else if (salary <= 15750) {
        	sssdeduction = 697.50;
        } else if (salary <= 16250) {
        	sssdeduction = 720.00;
        } else if (salary <= 16750) {
        	sssdeduction = 742.50;
        } else if (salary <= 17250) {
        	sssdeduction = 765.00;
        } else if (salary <= 17750) {
        	sssdeduction = 787.50;
        } else if (salary <= 18250) {
        	sssdeduction = 810.00;
        } else if (salary <= 18750) {
        	sssdeduction = 832.50;
        } else if (salary <= 19250) {
        	sssdeduction = 855.00;
        } else if (salary <= 19750) {
        	sssdeduction = 877.50;
        } else if (salary <= 20250) {
        	sssdeduction = 900.00;
        } else if (salary <= 20750) {
        	sssdeduction = 922.50;
        } else if (salary <= 21250) {
        	sssdeduction = 945.00;
        } else if (salary <= 21750) {
        	sssdeduction = 945.00;
        } else if (salary <= 22250) {
        	sssdeduction = 990.00;
        } else if (salary <= 22750) {
        	sssdeduction = 1012.50;
        } else if (salary <= 23250) {
        	sssdeduction = 1035.00;
        } else if (salary <= 23750) {
        	sssdeduction = 1057.50;
        } else if (salary <= 24250) {
        	sssdeduction = 1080.00;
        } else if (salary <= 24750) {
        	sssdeduction = 1102.50;
        } else {
        	sssdeduction = 1125.0;
        }
               
        System.out.println("SSS Contribution:	" + sssdeduction);
        
//Withholding Tax        
        double tax3 = pagibigdeduction + philhealthdeduction50percent + sssdeduction;
        double taxableIncome = salary - tax3;
        double withholdingtax = 0;

        if (taxableIncome <= 20832) {
        	withholdingtax = 0;
        } else if (taxableIncome <= 33333) {
        	withholdingtax = (taxableIncome - 20833) * 0.20;
        } else if (taxableIncome <= 66667) {
        	withholdingtax = 2500 + (taxableIncome - 33333) * 0.25;
        } else if (taxableIncome <= 166667) {
        	withholdingtax = 10833 + (taxableIncome - 66667) * 0.30;
        } else if (taxableIncome <= 666667) {
        	withholdingtax = 40833.33 + (taxableIncome - 166667) * 0.32;
        } else {
        	withholdingtax = 200833.33 + (taxableIncome - 666667) * 0.35;
        }

        System.out.println("Withholding Tax:	" + withholdingtax);
        
//GROSS PAY     	
        double deductions = pagibigdeduction + philhealthdeduction50percent + sssdeduction + withholdingtax;
        double gross = salary - deductions;
        
        System.out.println("Total Deductions:	" + deductions);
        System.out.println("-----------------------------------------");
        System.out.println("Gross Pay:		" + gross);
        
        
	}
}