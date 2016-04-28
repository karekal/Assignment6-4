
public class Student {
String name;
int roll,reg;
public Student(String name,int roll,int reg){
	this.name=name;
	this.roll=roll;
	this.reg=reg;
}
public float markToGrade(double mark){
	float gradepoint;
	if(mark>=80 && mark<=100)
		gradepoint=(float)4.0;
	else if(mark>=75 && mark<=79)
		gradepoint=(float)3.75;
	else if(mark>=50 && mark<=74)
		gradepoint=(float)2.75;
	else if(mark>=35 && mark<=49)
		gradepoint=(float)2.00;
	else
		gradepoint=(float)0.00;
	return gradepoint;
}
}
