class Emp{
public int isPresent=1,WagePerHr=20,fullDayHr=8,halfDayHr=4,checkPresent,totalSalary=0;
public int check,checkFullTime=1;
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
        check=2; 
	}

}
void checkPartOrFullTime()
{
	if(checkPresent==1)
	{
	random();
         if(randomV==checkFullTime)
         {
		check=1;
		System.out.println("Full Time");
	}else{
	check=0;
		System.out.println("Part Time");
	}
	}
		//random();
		
                //totalSalary=fullDayHr*WagePerHr;
               //System.out.println("Your salary "+totalSalary);
	         //if(randomV==1

}

void dailyWage()
{

         if(check==1)
         {
		totalSalary=fullDayHr*WagePerHr;
               System.out.println("Your salary "+totalSalary);
         }
         else if(check==0){
		 totalSalary=halfDayHr*WagePerHr;
               System.out.println("YOur Salary "+totalSalary);
         }else{
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
		obj.checkPartOrFullTime();
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

