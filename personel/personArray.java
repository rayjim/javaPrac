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
	public String getLast()
	{	return lastName;
	}
	String getFirst()
	{
		return firstName;
	}
	int getAge()
	{
		return age;
	}
}
class pArray{
	
	//This is the main class for the human records

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
                System.out.println("There are "+elemNum+" records!!");
		System.out.println("The records are shown below:");
		int in;
		for(in = 0; in<elemNum;in++)
		personArray[in].display();
		System.out.println("_____________________________________________________");
	}

	boolean delete (String lastname)
	{
	//Delete the first person appeared in the database
	  	int in, out;
		for(out = 0; out<elemNum;out++)
		{
		 if(lastname.equals(personArray[out].getLast()))
			break;
		}
		if(out==elemNum) {
			System.out.println("No match can be founded!");
			return false;
		}
		for(in= out; in<elemNum+1; in++)
		{
		 personArray[in]=personArray[in+1];
		}
		elemNum--;// this is forgotten and important mistatkes
		System.out.println("the element "+lastname+" is deleted, successful!!!!!!!!!!!!!!!!");
		return true;
		
	}

	//Search algorithms for all the person with the same last name
	public person find(String lastname)
	{	
		int in,out;
		for (out = 0; out<elemNum;out++)
		{
			if(lastname.equals(personArray[out].getLast()))
			{
		 		System.out.println(lastname+"is found!!");
				return personArray[out];
			}
		}
		System.out.println("Cannot find the record");
		return null;

}
        public boolean swap(person p1, person p2)
        {
                
                person pm;              //middle repference for swap
                pm = p1;
                p1 = p2;
                p2 = pm;
                return true;
            }
        public boolean bubSort()
        {       
               int out,in;
               person pm;              //middle repference for swap
               for (out = elemNum-1;out>-1;out--)
               {     for (in = 0; in < out; in++)
                     if(personArray[in].getLast().compareTo(personArray[in+1].getLast())>0)
                   {
//Unfortunatly, we cannot pass the value to change the contents.
                    pm = personArray[in];
                    personArray[in] = personArray[in+1];
                    personArray[in+1] = pm;
                       
                       }}
            
                return true;            
            }
            public boolean selSort()
            {
               int out, in,max;
                person pm;
                for(out = 0; out <elemNum; out++)
                {
                    max = out;
                    for(in = out+1; in<elemNum; in++)
                        {
                            if(personArray[in].getLast().compareTo(personArray[max].getLast())>0)
                                max = in;
                            }
                            if(max!=out)
                            {
                            pm = personArray[out];
                            personArray[out] = personArray[max];
                            personArray[max] = pm;
                            }
                    }
                    return true;
                }

}


class personApp{
	public static void main(String[] args)
	{
		int maxNum = 100;

		pArray arr ;
		arr = new pArray(maxNum);

		arr.insert("Bao","Bao",20);
		arr.insert("Nishikaze","dfond",30);
		arr.insert("Ted","dodnd",34);
		arr.insert("Shibata","Tadashi",60);
		arr.insert("Yamashita","aITA",42);
		arr.insert("Morishita","Fdnd",10);
		arr.insert("Demes","Kond",20);
		arr.insert("Kim","Shiwan",34);
		arr.insert("Kan","Junji",33);
		arr.display();
		arr.delete("fuck");
		arr.delete("Kan");

                arr.bubSort();
                arr.display();
                arr.selSort();
                arr.display();
	}

}



