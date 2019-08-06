import java.util.*;

public class Task2 {

    public static Map<String, List<String>> phoneBook = new HashMap<>();
    private  ArrayList<String> listNumbers;
    private  List<String> Ivanov = Arrays.asList("+8 800 2000 500","+8 800 200 600");
    private  List<String> Petrov = Arrays.asList("+8 800 2000 700");
    private  List<String> Sidorov = Arrays.asList("+8 800 2000 800","+8 800 2000 900","+8 800 2000 000");

    {
        phoneBook.put("Иванов И.И.",Ivanov);
        phoneBook.put("Петров П.П.",Petrov);
        phoneBook.put("Сидоров С.С.",Sidorov);
    }

    public List<String> printResponse(String fio){

        if (fio == null){
            System.out.println("Введите ФИО.");
            return null;
        }

        if (!fio.equals("")) {
            List<String> numbers = phoneBook.get(fio);
            if (numbers != null){
                for (String element: numbers) {
                    System.out.println(element);
                }
                return numbers;
            }else {
                System.out.println("такого ФИО в БД нет.");
                return null;
            }
        }else {
            System.out.println("Введите ФИО.");
            return null;
        }

    }

}
