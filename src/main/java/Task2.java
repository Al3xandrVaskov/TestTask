import java.util.*;

public class Task2 {

    public static Map<String, ArrayList<String>> phoneBook = new HashMap<>();
    private  ArrayList<String> listNumbers;
    private  List<String> Ivanov = Arrays.asList("+8 800 2000 500","+8 800 200 600");
    private  List<String> Petrov = Arrays.asList("+8 800 2000 700");
    private  List<String> Sidorov = Arrays.asList("+8 800 2000 800","+8 800 2000 900","+8 800 2000 000");

    private void init(){
        listNumbers = new ArrayList<>(Ivanov);
        phoneBook.put("Иванов И.И.",listNumbers);
        listNumbers = new ArrayList<>(Petrov);
        phoneBook.put("Петров П.П.",listNumbers);
        listNumbers = new ArrayList<>(Sidorov);
        phoneBook.put("Сидоров С.С.",listNumbers);
    }

    public ArrayList<String> printResponse(String fio){

        init();

        if (fio == null){
            System.out.println("Введите ФИО.");
            return null;
        }

        if (!fio.equals("")) {
            ArrayList<String> numbers = phoneBook.get(fio);
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
