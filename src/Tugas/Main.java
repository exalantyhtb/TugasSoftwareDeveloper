package Tugas;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Exalanty Hutabarat
 */
public class Main {
    
    static List<Integer> getList(String nums) {
        
        List<Integer> numbers = new ArrayList<>();
        String[] _split = nums.split(" ");
        for (String s : _split) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
    
    static int[] getAscending(List<Integer> numbers) {
        
        Integer urutan = numbers.size();
        int[] array = new int[urutan];
        List<Integer> _numbers = numbers.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < urutan; i++) {
            array[i] = numbers.get(i);
        }
        Arrays.sort((array));
        for (int index : array) {
//            System.out.println(index);
        }
        return array;

    }

    static Double getAverage(List<Integer> numbers) {
        
        Integer rata = 0;
        for (Integer number : numbers) {
            rata += number;
        }
        return rata / (numbers.size() * 1.0);
    }
    
    static Double getMedian(List<Integer> numbers) {
        
        Integer b = numbers.size();
        List<Integer> _numbers = numbers.stream().sorted().collect(Collectors.toList());
        if (b % 2 == 0) {
            Integer n_awal = b / 2;
            Integer n_akhir = (b / 2) + 1;
            return (_numbers.get(n_awal - 1) + _numbers.get(n_akhir - 1)) / (2 * 1.0);
        }
        Integer posisi = (b + 1) / 2;
        return _numbers.get(posisi - 1) * 1.0;
    }

    static Integer getTimes(List<Integer> numbers) {
        
        Integer hasil = 1;
        for (Integer number : numbers) {
            hasil *= number;
        }
        return hasil;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka yang Anda inginkan!");
        List<Integer> nums = getList(scan.nextLine());
        System.out.println("Urutan bilangan : " + Arrays.toString(getAscending(nums)));
        System.out.println("Rata rata :  " + getAverage(nums).toString());
        System.out.println("Nilai tengah : " + getMedian(nums).toString());
        System.out.println("Hasil Kali : " + getTimes(nums).toString());
        
    }
    
}
