package ta;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.opencsv.exceptions.CsvValidationException;


public class Employee {

	private String _employeeNo;
	private String _employeeName;
	private String _employeeLastName;
	private String _employeeAddress;
	 private float _totalhour;
	 private float _hourlyRate;
	
	public String GetEmployeeNo(){
		return _employeeNo;
	}
	public String GetEmployeeName(){
		return _employeeName;
	}
	public String GetEmployeeLastName(){
		return _employeeLastName;
	}
	public String GetEmployeeAddress(){
		return _employeeAddress;
	}
	public Float GetTotalhour(){
		return _totalhour;
	}
	public float GetHourlyRate(){
		return _hourlyRate;
	}
	
		
	public void SetEmployeeNo(String EmployeeNo){
		_employeeNo = EmployeeNo;
	}
	public void SetEmployeeName(String EmployeeName){
		_employeeName = EmployeeName;
	}
	public void SetEmployeeAddress(String EmployeeAddress){
		_employeeAddress = EmployeeAddress;
	}
	public void SetTotalhour(Float Totalhour){
		_totalhour = Totalhour;
	}
	public void SetHourlyRate (float HourlyRate){
		_hourlyRate = HourlyRate;
	}
	public Float ComputeAverageHour(){
		return (_totalhour) ;
	}
	
	public void ReadEmployee(String employeeNoToSearch) throws FileNotFoundException, IOException, CsvValidationException{
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Chang\\Desktop\\TA extension\\MotorPH.csv"));
		String [] headers = reader.readNext();
		
		String [] employeeRecord;
		while ((employeeRecord = reader.readNext()) != null) {
			if(employeeRecord[0].equals(employeeNoToSearch)) {
				_employeeNo = employeeRecord[0];
				_employeeName = employeeRecord[2];
				_employeeLastName = employeeRecord[1];
				_employeeAddress = employeeRecord[4];
				_hourlyRate =Float.valueOf( employeeRecord[18]);
				break; 
			}
			
			
		}
		
	}
}