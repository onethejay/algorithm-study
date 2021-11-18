package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        //데이터 배열 생성
        int[] arr = {5, 2, 3, 7, 1, 4};

        System.out.println("---- 버블 정렬 전 ----");
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");

        // 데이터 길이-1 만큼 반복
        for (int idx = 0; idx < arr.length; idx++) {  // idx는 0부터 5까지 반복한다.
            boolean swap = false;   //for 문을 벗어나기 위한 변수 선언

            //앞과 뒤의 데이터 비교 -  위의 for 문 한번이 끝나면 데이터 중에서 가장 큰 값이 뒤쪽에 위치하므로, 인덱스를 idx 만큼 감소시켜 불필요한 인덱스 탐색을 줄인다.
            for (int idx2 = 0; idx2 < arr.length - idx - 1; idx2++) { //앞 인덱스의 값과 뒤 인덱스(앞 인덱스+1) 값을 비교해야 하므로 -1을 한다.
                if (arr[idx2] > arr[idx2 + 1]) {    //앞의 값이 뒤의 값보다 크다면       {5, 2}
                    int temp = arr[idx2];           //앞의 값을 임시변수에 옮긴다.     5 {__, 2}
                    arr[idx2] = arr[idx2 + 1];      //뒤의 값을 앞으로 옮긴다.        5 {2, __}
                    arr[idx2 + 1] = temp;           //뒤에 임시변수에 담긴 값을 할당한다.  {2, 5}
                    swap = true;                    //변경이 일어났으므로 swap을 true로 변경한다.
                }
            }

            if (swap == false) break;   // 두번째 for문(line 20)의 첫 반복에서 한번도 swap이 일어나지 않았다면 break한다. (이미 정렬되어있어 for문 안의 if문이 수행되지 않았기 때문)
        }

        System.out.println("---- 버블 정렬 후 ----");
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");

    }
}
