package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double a = 0.0;
        if(salary <= 10000){
            a = salary - salary * 0.15;
            System.out.println(a);
        } else if (salary > 10000 && salary <= 20000) {
            a = salary - salary * 0.18;
            System.out.println(a);
        }else if (salary > 20000){
            a = salary - salary * 0.20;
            System.out.println(a);
        }else{
            System.out.println("wrong input!");
        }
    }
}
