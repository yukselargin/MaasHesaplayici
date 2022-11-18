 public class Employee {
    String name;
    int workHours;
    int hireYear;
    int year =2021;
    double salary;
    double tax;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public String toString(){
        return
                "\nAdı                                  = " +this.name +
                "\nMaaşı                                = " +this.salary +
                "\nÇalışma Saati                        = " +this.workHours +
                "\nBaşlangıç Yılı                       = " +this.hireYear +
                "\nVergi                                = " +tax() +
                "\nBonus                                = " +bonus() +
                "\nMaaş Artışı                          = " +raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte Maaş  = " +(this.salary - tax() + bonus()) +
                "\nToplam Maaş                          = " +(this.salary+ raiseSalary());
    }
    double tax (){
        if(salary>1000){
            return salary*0.03;
        }
        return 0;
    }
    int bonus(){
         if(this.workHours>40){
             return(workHours-40)*30;
         }
         return 0;
    }
    double raiseSalary(){
        if ((year-hireYear)<10){
            return this.salary*0.05;
        }
        else if((year-hireYear)>=10 && (year-hireYear)<20){
            return this.salary*0.10;
        }
        else if((year-hireYear)>=20){
            return this.salary*0.15;
        }
        return 0;
    }
}
