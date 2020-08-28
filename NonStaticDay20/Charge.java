public class Charge {
	private int EMP_RATE_PER_HRS;
	private int NUM_OF_WORKING_DAYS;
	private int MAX_HRS_IN_MONTH;
	public Charge(final int EMP_RATE_PER_HRS,final int NUM_OF_WORKING_DAYS,final int MAX_HRS_IN_MONTH)
	{
        this.EMP_RATE_PER_HRS = EMP_RATE_PER_HRS;
	this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
	this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
	public static void main(String[] args) {
		Charge obj1 = new Charge(10,10,100);
	obj1.calDailyEmpWage();
	}

	/**
	 * calculate employee daily wages based on type of employee 
	 */
	public void calDailyEmpWage() {
		int totalWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while(totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS){
			totalWorkingDays++;

			final int empHrs = getEmpHrs();
			final int empWage = empHrs*EMP_RATE_PER_HRS;
			totalEmpHrs+=empHrs;
			totalWage+=empWage;
			System.out.println("Emp DAY : "+totalWorkingDays+" wages : "+empWage);
		}
		System.out.println("Total emp wage : "+ totalWage);
	}

	/**
	 * Get employee hours. 
	 * @return employee hrs
	 */
	public int getEmpHrs() {

		final int isFullTime = 1;
		final int isPartTime = 2;
		int empHrs = 0;

		//get random value
		final double randomValue = Math.floor(Math.random()*10)%3;

		switch((int)randomValue) {

			case isFullTime:
				empHrs = 8;
				System.out.println("Emp is present for full time.");
				break;
			case isPartTime:
				empHrs = 4;
				System.out.println("Emp is present for part time.");
				break;
			default:
				System.out.println("Emp is absent");
				break;
		}
		return empHrs;
	}
}
