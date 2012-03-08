import java.io.*;
import java.lang.*;
public class peopleArray{
public class People {
        private String lastName;
        private String firstName;
        private int age;
        People(String last, String first, int age)
        {
                lastName=last;
                firstName=first;
                this.age= age;
            }
        void display()
        {
                System.out.println("Last name: "+lastName+" First name: "+firstName+" Age: "+age);
            }
        String getLast()
        {
            return lastName;

            }

    
    }

public class humanResource{
        private int elemNum;
        private People[] peoples;
        
        humanResource(int max)
        {
            peoples = new People[max];
            elemNum = 0;
            
            }
    
    }
}
