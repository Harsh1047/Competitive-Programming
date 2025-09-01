public class Practice_OOPS {
    static class Employee{

        int salary;
        String name;

        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
    }
    static class square{
        int side;
        public int area(){
            return side*side;
        }
    }
    public static void main(String[] args) {
        Employee xyz = new Employee();
        xyz.name = "xyz";
        xyz.salary = 25000;
        System.out.println(xyz.name);
        System.out.println(xyz.salary);
        square sq = new square();
        sq.side = 5;
        System.out.println(sq.area());

    }
}
