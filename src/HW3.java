import java.util.Scanner;

public class HW3 {
    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int length = sc.nextInt(); //вводим размер массива из консоли
        int [] Mas = new int [length]; //объявляем массив Mas введенного размера

        for (int i = 0; i<length; i++){
            System.out.println("Введите число массива:");
            Mas [i] = sc.nextInt();
        } //ввели из консоли каждый элемент массива

        int MinM = Mas [0]; //присвоили переменной MinM значение первого элемента массива
        for (int i = 0; i<length; i++){
            if (Mas [i] <= MinM)
                MinM = Mas [i];
        } // определили наименьший элемент массива (сравнением каждого элемента с Min: если верно, обновляем Min)
        System.out.println("Наименьшее число в массиве: " + MinM);

        int MaxM = Mas [0];
        for (int i=0; i<length; i++){
            if (Mas[i]>=MaxM)
                MaxM = Mas [i];
        } // определили наибольший элемент массива (сравнением каждого элемента с Max: если верно, обновляем Max)
        System.out.println("Наибольшее число в массиве: " + MaxM);

        int Repeat = 0;
        for (int i=0; i<length; i++){
            if (Mas[i] == 5)
                Repeat ++;
        }
        System.out.println("Количество повторений числа 5 в массиве: " + Repeat);

        for (int k=0; k<length; k++){
            for (int j=1; j<length; j++){
                if (Mas [j-1]>Mas[j]){
                    int Temp = Mas [j-1];
                    Mas[j-1]=Mas[j];
                    Mas [j] = Temp;
                }
            }
        } //Отсортивали массив по возрастанию
        System.out.print("Отсортированный массив: ");
        for (int Ma : Mas) {
            System.out.print(Ma + "; ");
        }
    }
}
