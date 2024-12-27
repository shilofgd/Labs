package Lab10m;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, "Vasiliy", LocalDate.of(2021, 9, 12), "DELIVERED", 2999),
                new Order(2, "Mariya", LocalDate.of(2021, 9, 14), "PENDING", 1499),
                new Order(3, "Nikolay", LocalDate.of(2021, 9, 14), "SHIPPED", 999),
                new Order(4, "Ilya", LocalDate.of(2021, 9, 15), "PENDING", 749),
                new Order(5, "Metrofan", LocalDate.of(2021, 9, 15), "SHIPPED", 200)
        );

        LocalDate date1 = LocalDate.of(2021, 9, 13);
        List<Order> dateSort = orders.stream()
                .filter(n -> n.getOrderDate().isAfter(date1))
                .collect(Collectors.toList());
        System.out.println("Заказы после определённой даты:");
        dateSort.forEach(System.out::println);

        List<Order> statusSort = orders.stream()
                .filter(n -> n.getStatus().equals("SHIPPED"))
                .collect(Collectors.toList());
        System.out.println("Заказы со статусом SHIPPED:");
        statusSort.forEach(System.out::println);

        Map<String, Long> statusCount = orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus, Collectors.counting()));
        statusCount.forEach((status, count) -> System.out.println(status + ": " + count));

        List<Order> amountSort = orders.stream()
                .filter(n -> n.getAmount() > 500)
                .collect(Collectors.toList());
        System.out.println("Заказы стоимостью больше 500:");
        amountSort.forEach(System.out::println);

        Optional<String> maxOrder = orders.stream()
                .max(Comparator.comparing(Order::getAmount))
                .map(Order::getCustomerName);
        maxOrder.ifPresent(customer -> System.out.println("Клиент с наибольшим заказом: " + customer));
    }
}
