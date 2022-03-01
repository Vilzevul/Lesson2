package ru.skypro;

public class Main<arr> {
    static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        // write your code here

        employee[0] = new Employee("Иван", "Иванович", "Иванов", 1, 54_200.55);
        employee[1] = new Employee("Петр", "Иванович", "Петров", 2, 44_985.37);
        employee[2] = new Employee("Мария", "Семеновна", "Петрова", 3, 47_230.34);
        employee[3] = new Employee("Семён", "Владимирович", "Смирнов", 4, 68_978.91);
        employee[4] = new Employee("Екатерина", "Владимировна", "Синица", 4, 67_545.05);
        employee[5] = new Employee("Владимир", "Витальевич", "Гребнев", 3, 57_496);
        employee[6] = new Employee("Леонид", "Эдуардович", "Рева", 5, 78_654.66);
        employee[7] = new Employee("Марина", "Алексеевна", "Савченко", 5, 68_052.78);
        employee[8] = new Employee("Кристина", "Олеговна", "Вишневская", 2, 46_258.2);
        employee[9] = new Employee("Алексей", "Александрович", "Васильев", 1, 55_679.43);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
        System.out.println("Сумма затрат на зарплаты составила " + summa(employee) + " рублей");
        System.out.println("Максимальная зарплата " + maxSalary(employee) + " рублей");
        System.out.println("Минимальная зарплата " + minSalary(employee) + " рублей");
        System.out.println("Средняя зарплата " + midSalary(employee) + " рублей");
        names(employee);
    }

    static double summa(Employee[] emp) {
        double sum = 0d;
        for (Employee num : emp) {
            sum = sum + num.getSalary();
        }
        return sum;
    }

    static double minSalary(Employee[] emp) {
        double zp;
        zp = emp[0].getSalary();
        for (Employee a : emp) {
            if (zp > a.getSalary()) {
                zp = a.getSalary();
            }
        }
        return zp;
    }

    static double maxSalary(Employee[] emp) {
        double s = 0d;
        for (Employee a : emp) {
            if (s < a.getSalary()) {
                s = a.getSalary();
            }
        }
        return s;
    }

    static double midSalary(Employee[] emp) {
        double sum = 0d;
        double middle = 0d;
        for (Employee a : emp) {
            sum = sum + a.getSalary();
        }
        middle = sum / emp.length;
        return middle;
    }

    static void names(Employee[] emp) {
        for (Employee a : emp) {
            System.out.println(a.getLastName() + " " + a.getName() + " " + a.getPatronymic());
        }
    }
}