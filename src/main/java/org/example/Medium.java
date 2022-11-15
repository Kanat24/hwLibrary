package org.example;

public class Medium extends Main {
    public static void indexSalary() {
        int arg = 10;
        for (Employee employee1 : employees) {
            if (employee1 != null) {
                employee1.setSalary(employee1.getSalary() + employee1.getSalary() * arg / 100);
                System.out.println(employee1.getSalary());
            }
        }
    }

    public static void numberDepartamentOllSum(int departamentNumber) {
        int sum = 0;
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {
                sum += employee1.getSalary();
            }
        }
        System.out.println("Сумма зарплат по отделу " + departamentNumber + " равна " + sum);
    }

    public static String numberDepartamentMaxSum(int departamentNumber) {
        int maxSumma = Integer.MIN_VALUE;
        String employeeMaxSumma = null;
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {

                if (employee1.getSalary() > maxSumma) {
                    maxSumma = employee1.getSalary();
                    employeeMaxSumma = employee1.getFullName();
                }
            }
        }
        return employeeMaxSumma;

    }

    public static String numberDepartamentMinSum(int departamentNumber) {
        int minSumma = Integer.MAX_VALUE;
        String employeeMinSumma = null;
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {

                if (employee1.getSalary() < minSumma) {
                    minSumma = employee1.getSalary();
                    employeeMinSumma = employee1.getFullName();
                }
            }
        }
        return employeeMinSumma;

    }

    public static void averageSalaryDepartment(int departamentNumber) {
        double sum = 0;
        double averageSummaDepartament = 0;
        int counter = 0;
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {
                sum += employee1.getSalary();
                counter++;
                averageSummaDepartament = sum / counter;
            }
        }
        System.out.printf("%.2f %n", averageSummaDepartament);
    }

    public static void indexOllSalary(int departamentNumber, int arg) {
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {
                employee1.setSalary(employee1.getSalary() + employee1.getSalary() * arg / 100);
                System.out.println("Проиндексированная зарплата каждого сотрудника: " + employee1.getFullName() + " : " + employee1.getSalary());
            }
        }
    }

    public static void ollDepartamentEmployee(int departamentNumber) {
        System.out.println("Полный список сотрудников отдела " + departamentNumber + " :");
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {
                String ollEmployees = employee1.getFullName() + " " + employee1.getSalary() + " " + employee1.id;
                System.out.println(ollEmployees);
            }
        }
    }

    public static void salaryLessNumber(int number) {
        System.out.println("Сотрудники с зарплатой меньше " + number + " :");
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() < number) {
                System.out.println("id : " + employee1.id + "," + " fullName " + employee1.getFullName() + "," + " зарплата : " + employee1.getSalary());
            }

        }
    }

    public static void salaryMoreNumber(int number) {
        System.out.println("Сотрудники с зарплатой больше " + number + " :");
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() >= number) {
                System.out.println("id : " + employee1.id + "," + " fullName " + employee1.getFullName() + "," + " зарплата : " + employee1.getSalary());

            }
        }
    }
}