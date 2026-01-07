// Book: Let Us Java
// Chapter 2 – Question A
// Problem: Calculate gross salary of an employee

class Ch2QA{
    public static void main(String args[]){
        System.out.println("Salary details of Ramesh");
    
        int baseSalary = 25_000;
        
        float da = baseSalary * 0.4f;
        float hra = baseSalary *  0.2f;

        float gross_salary = baseSalary + da + hra;

        System.out.println("Basic Salary : "+baseSalary);
        System.out.println("Dearness Allowance : " + da);
        System.out.println("House Rent Allowance : "+hra);
        System.out.println("Gross Salary : "+ gross_salary);
    }
}
