class Emp{
public int isPresent=1,WagePerHr=20,fullDayHr=8,halfDayHr=4,checkPresent,totalSalary=0;
public int check,checkFullTime=1,totalTime=0;
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
		totalTime=totalTime+8;
		check=1;
		System.out.println("Full Time");
	}else{
	check=0;
		 totalTime=totalTime+4;
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

	//         if(check==1)
         switch(check){
	case 1:
		totalSalary=totalSalary+(fullDayHr*WagePerHr);
               System.out.println("Your total salary "+totalSalary);
         break;
         case 0:
		 totalSalary=totalSalary+(halfDayHr*WagePerHr);
               System.out.println("Your total Salary "+totalSalary);
         break;
	default:
		System.out.println("Your total Salary "+totalSalary);
	
	}

}




}
class EmpWageComputation {
	public static void main(String[] args)
	{
	//public int totalTime=0;

		Emp obj=new Emp();
		for(int i=1;i<=20;i++)
		{
		  if(obj.totalTime<=100)
                {
		System.out.println("Day "+i);
	//	Emp obj=new Emp();
		obj.random();
		obj.isPresentOrAbsent();
		obj.checkPartOrFullTime();
		obj.dailyWage();
		}else{
		break;
		}
		}
	}

}

