import java.util.*;
 class Student{
    String name;
    String rollno;
    float marks;
    public Student(String name,String rollno,float marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
public String getName()
{
	return name;
}
public String getRollNo()
{
	return rollno;
}
public float getMarks()
{
	return marks;
}
public static float avg(ArrayList<Student> arr)
{
	float sum=0;
	for(Student obj:arr)
	{
		sum=sum+(obj.getMarks());
	}
	return sum/(arr.size());

}
public static float Max(ArrayList<Student> arr)
{
	float max=0;
	for(Student obj:arr)
	{
		if(max<obj.getMarks()){
			max=obj.getMarks();
		}
	}
return max;
	
}
public static float Min(ArrayList<Student> arr)
{
	float min=arr.get(0).getMarks();
	for(Student obj:arr)
	{
		if(min>obj.getMarks()){
			min=obj.getMarks();
		}
	}
return min;
	

}


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> arr=new ArrayList<Student>();
        System.out.println("Number of Students you need to Enter: ");
        int n=sc.nextInt();
	if(n<=0)
	{
		System.out.println("Enter valid Number");
		System.exit(0);
	}
	System.out.println("-------------------------------------");
        System.out.println("Name\t|\tRollNo\t|\tMarks");
	System.out.println("-------------------------------------");
        for(int i=0;i<n;i++)
        {
            arr.add(new Student(sc.next(),sc.next(),sc.nextFloat()));
        }
	System.out.println("-------------------------------------");
	System.out.println();
	System.out.println("List of the Students");
	System.out.println("--------------------");
	System.out.println();
	System.out.print("Name\t|\tRollNo\t|\tMarks");
	System.out.println();
	System.out.println("-------------------------------------");
	//System.out.print("-----\t\t--------\t\t-------");
        for(Student obj:arr)
	{
		System.out.println(obj.getName()+"\t|\t"+obj.getRollNo()+"\t|\t"+obj.getMarks());
	}
	System.out.println("-------------------------------------");
	float average = avg(arr);
        float max = Max(arr);
        float min = Min(arr);
	
	System.out.println();
	System.out.println("List of Students Scored Highest Marks");
	System.out.println("-------------------------------------");
	System.out.print("Name\t|\tRollNo\t|\tMarks");
	System.out.println();
	System.out.println("-------------------------------------");
	for(Student obj:arr)
	{	if(max==obj.getMarks()){
		System.out.println(obj.getName()+"\t|\t"+obj.getRollNo()+"\t|\t"+obj.getMarks());
		}
	}
	System.out.println("-------------------------------------");
	System.out.println();
	System.out.println("List of Students Scored Lowest Marks");
	System.out.println("-------------------------------------");
	System.out.print("Name\t|\tRollNo\t|\tMarks");
	System.out.println();
	System.out.println("-------------------------------------");
	for(Student obj:arr)
	{	if(min==obj.getMarks()){
		System.out.println(obj.getName()+"\t|\t"+obj.getRollNo()+"\t|\t"+obj.getMarks());
		}
	}
	System.out.println("-------------------------------------");
	System.out.println();
	System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade: " + min);
        
    }

}