public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Yüksel", 1500,45,2015);
        Employee e2 = new Employee("Engin", 980,35, 2009);
        Employee e3 = new Employee("Kemal", 2000,45, 1985);
        System.out.println(e1.toString());
        System.out.println("----------------------------------------------------------");
        System.out.println(e2.toString());
        System.out.println("----------------------------------------------------------");
        System.out.println(e3.toString());
    }
}