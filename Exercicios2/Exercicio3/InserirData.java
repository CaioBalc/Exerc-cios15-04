package Exercicio3;

public class InserirData {
    public static void main(String[] args) {
        Data data1 = new Data(10, 3, 2021);
        Data data2 = new Data(15, 6, 2022);
        Data data3 = new Data(20, 9, 2023);
        Data data4 = new Data(25, 12, 2024);

        System.out.println("Datas:");
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
        System.out.println("Data 3: " + data3);
        System.out.println("Data 4: " + data4);

        System.out.println("\nData 1 vem antes de Data 2: " + data1.vemAntes(data2));
        System.out.println("\nData 2 vem antes de Data 1: " + data2.vemAntes(data1));

        System.out.println("\nData 1 vem antes de Data 3: " + data1.vemAntes(data3));
        System.out.println("\nData 3 vem antes de Data 1: " + data3.vemAntes(data1));

        System.out.println("\nData 1 vem antes de Data 4: " + data1.vemAntes(data4));
        System.out.println("\nData 4 vem antes de Data 1: " + data4.vemAntes(data1));
    }
}