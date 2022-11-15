package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Easy extends Main {

    public static void getAList() {
        for (Employee employee1 : employees) {
            if (employee1 != null) {
                System.out.println(employee1);
            }
        }
    }

    public static int sumSalary() {
        int sum = 0;
        for (Employee employee1 : employees) {
            if (employee1!=null) {
                sum += employee1.getSalary();
            }
        }
        return sum;
    }

    public static String minSalary() {
        int minSumma = Integer.MAX_VALUE;
        String employeeMinSumma = null;
        for (Employee employee1 : employees) {
            if (employee1!=null && employee1.getSalary() < minSumma) {
                minSumma = employee1.getSalary();
                employeeMinSumma = employee1.getFullName();
            }

        }
        return employeeMinSumma;
    }

    public static String maxSalary() {
        int maxSumma = Integer.MIN_VALUE;
        String employeeMaxSumma = null;
        for (Employee employee1 : employees) {
            if (employee1!=null && employee1.getSalary() > maxSumma) {
                maxSumma = employee1.getSalary();
                employeeMaxSumma = employee1.getFullName();
            }
        }
        return employeeMaxSumma;
    }

    public static double averageSalary() {
        double sum = 0;
        double averageSumma=0;
        int counter=0;
        for (Employee employee1 : employees) {
            if (employee1!=null) {
                sum += employee1.getSalary();
                counter++;
            }
        }
        if (counter!=0) {
            averageSumma = sum / counter;
        } else System.out.println("Извините, но кажется у вас не осталось сотрудников");
        return averageSumma;
    }

    public static void ollEmployee() {
        System.out.println("Полный список сотрудников: ");
        for (Employee employee1 : employees) {
            if (employee1!=null) {
                String ollEmployees = employee1.getFullName();
                System.out.println(ollEmployees);
            }
        }
    }

}
