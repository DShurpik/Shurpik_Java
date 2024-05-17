import java.util.*;

public class Task {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();

        System.out.println("Задание 2");
        String task2Result = task2();
        System.out.println(task2Result);


        int[] testArray1 = createArrayFromRandomValues();
        int[] resTask3 = task3(testArray1);
        System.out.print("Элементы кратные 3: ");
        for (int i : resTask3) {
            System.out.print(i + " ");
        }

        int[] testArray2 = createArray();
        System.out.print("Элементы кратные 3: ");
        for (int i : testArray2) {
            System.out.print(i + " ");
        }


    }

    /** Составьте алгоритм, Если введенное число больше 7, то вывести “Привет” */

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        int digit;
        while (isTrue) {
            System.out.print("Введите число: ");
            try {
                digit = scanner.nextInt();
                if(digit > 7) {
                    System.out.println("Привет");
                }
                isTrue = false;
            } catch (InputMismatchException i) {
                System.out.println("Было введено не число. Введите число");
                scanner.nextLine();
            }
        }
    }

    /** Если введенное имя совпадает с “Вячеслав”, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени" */

     public static String task2() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Введите имя: ");
        name = scanner.next();
        return name.equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени";
    }

    /** На входе есть числовой массив, необходимо вывести элементы массива кратные 3 */

    public static int[] task3(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                list.add(array[i]);
            }
        }
        int[] intArray = list.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }

    public static int[] createArrayFromRandomValues() {
         int[] array = new int[randomInt()];
         for (int i = 0; i < array.length; i++) {
             array[i] = randomInt();
         }
         return array;
    }

    public static int[] createArray() {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
         int[] array = new int[scanner.nextInt()];
         for(int i = 0; i < array.length; i++) {
             System.out.print("Введите " + i + " эелемент массива: ");
             array[i] = scanner.nextInt();
         }
         return array;
    }

    private static int randomInt() {
        Random random = new Random();
        return random.nextInt(50);
    }
}
