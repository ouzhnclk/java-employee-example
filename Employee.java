package Employee_Example;
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        double amountOfTax=0;
        if(this.salary>1000){
            amountOfTax=this.salary*0.03;
        }
        return amountOfTax;
    }
    double bonus(){
        double amountOfBonus=0;
        if(this.workHours>40){
            amountOfBonus=(this.workHours-40)*30;
        }
        return amountOfBonus;
    }
    double raiseSalary(){
        int totalYear=2021-this.hireYear;
        double amountOfRaise;
        if(totalYear<10){
            amountOfRaise=this.salary*0.05;  
        }
        else if(totalYear>=10 && totalYear<20){
            amountOfRaise=this.salary*0.1;
        }
        else{
            amountOfRaise=this.salary*0.15;
        }
        return amountOfRaise;
    }
        void info(){
        double amountOfTax=tax();
        double amountOfBonus=bonus();
        double amountOfRaise=raiseSalary();
        System.out.println("Employee Information");
        System.out.println("Adı:\t\t\t"+this.name);
        System.out.println("Maaşı:\t\t\t"+this.salary);
        System.out.println("Çalışma Saati:\t\t"+this.workHours);
        System.out.println("Başlangıç Yılı:\t\t"+this.hireYear);
        System.out.println("Vergi:\t\t\t"+amountOfTax);
        System.out.println("Bonus:\t\t\t"+amountOfBonus);
        System.out.println("Maaş Artışı:\t"+amountOfRaise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş:"+(this.salary+amountOfBonus-amountOfTax));
        System.out.println("Toplam Maaş:\t\t"+(this.salary+amountOfRaise));

    }

}
