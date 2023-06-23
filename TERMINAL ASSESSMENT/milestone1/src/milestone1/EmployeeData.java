package milestone1;

public class EmployeeData {

	 private String _employeeNo;
	 private String _employeeName;
	 private float _totalhour;
	 private float _hourlyRate;

	public String GetEmployeeNo(){
		return _employeeNo;
	}
	public String GetEmployeeName(){
		return _employeeName;
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
	public void SetTotalhour(Float Totalhour){
		_totalhour = Totalhour;
	}
	public void SetHourlyRate (float HourlyRate){
		_hourlyRate = HourlyRate;
	}
	public Float ComputeAverageHour(){
		return (_totalhour) ;

	   }

}