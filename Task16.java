package homework3;

//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

public class Task16 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 76, 3};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}





