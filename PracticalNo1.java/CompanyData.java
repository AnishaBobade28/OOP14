/*Aim: PracticalNo.1
  Author: Anisha Bobade
  Version: 1.0
  Date: 30 Jan 2024
*/




class PracticalNo1
{
public static void main(String []argv)
{
    CompanyData SBJIT = new CompanyData("Anisha Bobade",19,"Female",14);
    SBJIT.display();
}
}


class CompanyData
{
String name;
int age;
String gender;
int empid;

CompanyData()
{
      System.out.println("Inside Default Constructor");
}

CompanyData(String nm,int ag, String gen, int em)

{
        System.out.println("Inside Parametrised Constructor");


        this.name=nm;
        this.age=ag;
        this.gender=gen;
        this.empid=em;
}


public void display()

{
           System.out.println("Name-"+this.name +"Age-"+this.ag +"Gender-"+this.gender +"Empid-"+this.empid);




}

}