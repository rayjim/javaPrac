import java.io.*;
import java.lang.*;

class personArray
{
	
}


class person{
	private String lastName;
	private String firstName;
	private int age;
	person(String last, String first,int age )
	{
		lastName=last;
		firstName=first;
		this.age=age;
	}
	void display()
	{
		System.out.println("Last name: "+lastName+" Frist name: "+firstName+" age: "+age);
	
	}
	
}
class pArray{
	private int maxNum;
	private int elemNum;
	private person[] personArray;
	pArray(int max)
	{
		maxNum = max;
		personArray = new person[max];
		System.out.println("The system has the capacity of "+max);
		elemNum=0;
	}
	void insert(String lastName, String firstName, int age)
	{
	     if(elemNum<maxNum)
	     {
		personArray[elemNum]= new person(lastName,firstName,age);
		elemNum++;
		System.out.println("Last name: "+lastName+" Frist name: "+firstName+" age: "+age);
		System.out.println("Record has been inserted");
		System.out.println("_____________________________________________________");
		}
	     else
	     	System.out.println("The number of maximum records have been achieved!");

	}
	void display(){

		System.out.println("The records are shown below:");
		int in;
		for(in = 0; in<elemNum;in++)
		personArray[in].display();
		System.out.println("_____________________________________________________");
	}

}



class personApp{
	public static void main(String[] args)
	{
		pArray humanResource ;
		humanResource = new pArray(2);
		humanResource.insert("Ray","Bao",20);
		humanResource.insert("James","Bond",30);
		humanResource.display();
	
	}

}



