class Emp{
public int isPresent=1,WagePerHr=20,fullDayHr=8,halfDayHr=4,checkPresent,totalSalary=0;
public double randomV;
void random()
{
	randomV=Math.floor(Math.random()*10)%2;
//	return randomV;
        System.out.println("random number" +randomV);
}
void isPresentOrAbsent()
{
	 if(randomV==isPresent)
         {
		checkPresent=1;
               System.out.println("present");
         }
         else{
		checkPresent=0;
               System.out.println("absent");
         }

}
void dailyWage()
{
         if(checkPresent==1)
         {
		totalSalary=fullDayHr*WagePerHr;
               System.out.println("Your salary "+totalSalary);
         }
         else{
               System.out.println("YOur Salary "+totalSalary);
         }

}




}
class EmpWageComputation {
	public static void main(String[] args)
	{
		Emp obj=new Emp();
		obj.random();
		obj.isPresentOrAbsent();
		obj.dailyWage();
//		int IsPresent=1;
		//double randomV=Math.floor(Math.random()*10)%2;
//		int ch
		//if(randomV==IsPresent)
		{
		//	System.out.println("present");
		}
		//else{
		//	System.out.println("absent");
	//	}

	}

}
