import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        startTask1();
        startTast2();

    }
    public static void startTask1(){
        String ip1 = null ;
        String ip2 = null ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("IP from: ");
        try {
            ip1 = br.readLine();
            System.out.print("IP to: ");
            ip2 = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Task1 task1 = new Task1(ip1,ip2);

        try {
            System.out.println(task1.printAndCheckRange().size());
        } catch (NullPointerException e) {
            Start.startTask1();
        }
    }

    public static void startTast2(){
        Task2 task2 = new Task2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введиет ФИО в формете *Фамилия И.О.*");
        String fio = sc.nextLine();
        List<String> numbers = task2.printResponse(fio);
        if (numbers == null) return;

        for (String element : numbers) {
            System.out.println(element);
        }
    }
}
