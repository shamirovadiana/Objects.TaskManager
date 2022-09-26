import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название задачи и время на ее выполнение: ");
        String input = scanner.nextLine();
        int startPos = input.indexOf("starts at");
        String startTimeString = input.substring(startPos + 10, startPos + 13);
        System.out.println(startTimeString);
        startTimeString = startTimeString.trim();
        System.out.println(startTimeString);
        int startTime = Integer.parseInt(startTimeString);
        int endPos = input.indexOf("ends at");
        String endTimeString = input.substring(endPos + 8, endPos + 10);
        endTimeString = endTimeString.trim();
        int endTime = Integer.parseInt(endTimeString);
        int diff = 0;
        if (endTime >= startTime) {
            diff = endTime - startTime;
            System.out.println("На задачу потребуется: " + diff + " ч.");
        } else {
            System.out.println("Формат введенных данных неверный");
        }

    }
}
