
public class FirstSemister extends Student implements Result{

	private String sub1,sub2;
	private float grade1,grade2,credit1,credit2;
	private double mark1,mark2;
	public FirstSemister(String name,int roll,int reg){
		super(name,roll,reg);
	}
	//override
	public void setMarks(double mark1,double mark2){
		this.mark1=mark1;
		this.mark2=mark2;
		this.grade1=markToGrade(mark1);
		this.grade2=markToGrade(mark2);
	}
	public float calculateGpa(){
		return (grade1*credit1+grade2*credit2)/(credit1+credit2);
	}
	public void getSubject(){
		sub1="introduction to computer system";
		sub2="Structured programming language";
		credit1=(float)2.0;
		credit2=(float)3.0;
	}
	public void showResult(){
		System.out.println("name:"+name+"\n roll:"+roll+"\n reg no:"+reg);
		System.out.println(sub1+"\n grade:"+grade1+"\n"+ sub2+"\n grade:"+grade2+"\n gpa"+calculateGpa());
	}
}
