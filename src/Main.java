import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 ----------------------");
        DayOfWeek day = DayOfWeek.Sunday;
        System.out.println("Today is " + day);

        System.out.println("Task 2 ----------------------");
        for (DayOfWeek days : DayOfWeek.values()) {
            System.out.println(days);
        }

        System.out.println("Task 3 ----------------------");
        DayOfWeek day1 = DayOfWeek.Tuesday;
        DayOfWeek day2 = DayOfWeek.Wednesday;

        if (day1 == day2) {    // Porownujemy Tuesday i Wednesday
            System.out.println("Same days");
        } else {
            System.out.println("Not same days");
        }

        System.out.println("Task 4 ----------------------");
        switch (day) {        // Wybiera case na podstawie Task 1
            case Monday:
                System.out.println("Beginning of the week");
                break;
            case Tuesday:
            case Wednesday:
            case Thursday:
                System.out.println("Mid of the week");
                break;

            case Friday:
            case Saturday:
            case Sunday:
                System.out.println("Weekend");
                break;
        }
        System.out.println("Task 5 ----------------------");
        DayOfWeek day3 = DayOfWeek.Wednesday;
        DayOfWeek day4 = DayOfWeek.Sunday;

        System.out.println(day3 + " is weekend ? " + day3.isWeekend());
        System.out.println(day4 + " is weekend ? " + day4.isWeekend());

        System.out.println("Task 6 ----------------------");
        for (Month month : Month.values()) {
            System.out.println(month + " has " + month.getDays() + " days");
        }

        System.out.println("Task 7 ----------------------");
        for (Month month : Month.values()) {
            System.out.println(month);
        }
        System.out.println("Task 8 ---------------------");
        Month month1 = Month.MARCH;
        Month month2 = Month.JANUARY;

        if (month1.compareTo(month2) < 0) {
            System.out.println(month1 + " is before " + month2);
        } else if (month1.compareTo(month2) > 0) {
            System.out.println(month1 + " is after " + month2);
        } else {
            System.out.println("Same months");
        }

        System.out.println("Task 9 ---------------------");
        for (Month month : Month.values()) {
            System.out.println(month);
        }
        System.out.println("Task 10 --------------------");
        Person person1 = new Person("Christian", DayOfWeek.Tuesday);
        person1.showDayOff();
        System.out.println("Task 11 --------------------");
        Month[] months = {Month.JANUARY, Month.FEBRUARY, Month.DECEMBER, Month.MARCH};

        int totalDays = 0;

        for (Month month : months) {
            System.out.println(month);
            totalDays += month.getDays();
        }
        System.out.println("Total days: " + totalDays);
        System.out.println("Task 12 --------------------");
        for (Currency currency : Currency.values()) {
            System.out.println(currency);
        }
        System.out.println("Task 13 --------------------");
        int x = 27;
        int y = 9;
        for (Operation operation : Operation.values()) {
            System.out.println(operation + ": " + operation.calculate(x, y));
        }
        System.out.println("Task 14 --------------------");
        OrderStatus status1 = OrderStatus.NEW;
        OrderStatus status2 = OrderStatus.SHIPPED;
        OrderStatus status3 = OrderStatus.DELIVERED;
        OrderStatus status4 = OrderStatus.CANCELLED;

        System.out.println(status1 + " is active? " + status1.isActive());
        System.out.println(status2 + " is active? " + status2.isActive());
        System.out.println(status3 + " is active? " + status3.isActive());
        System.out.println(status4 + " is active? " + status4.isActive());

        System.out.println("Task 15 --------------------");
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }
        System.out.println("Task 16 --------------------");
        Logger.INSTANCE.log("TEST");

        System.out.println("Task 17 --------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję: START, STOP, EXIT");
        String input = scanner.nextLine().toUpperCase();
        try {
            MenuOption option = MenuOption.valueOf(input);
            option.execute();
        } catch (IllegalArgumentException e) {
            System.out.println("Nieprawidłowa opcja!");
        }
        System.out.println("Task 18 --------------------");
        Product[] products = {
                new Product("Bread", Category.FOOD),
                new Product("Laptop", Category.ELECTRONICS),
                new Product("Hoodie", Category.CLOTHING),
                new Product("Cheese", Category.FOOD)
        };

        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Task 19 --------------------");
        int z = 12;
        int t = 4;

        for (Calculation calculation : Calculation.values()) {
            System.out.println(calculation.calculate(z, t));
        }
        System.out.println("Task 20 --------------------");
        DayOfWeek dayTest = DayOfWeek.Wednesday;
        DayOfWeek dayTest2 = DayOfWeek.Wednesday;

        boolean result1 = (dayTest == dayTest2);
        boolean result2 = (dayTest.equals(dayTest2));

        System.out.println("No equals ==: " + result1);
        System.out.println("Equals() : " + result2);
    }
}
