package org.example.java.ch5;

/*
* 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램
* */
public class Exercise5_4 {
  
  public static void main(String[] args){
    int[][] arr = {
            {5,5,5,5,5},
            {10,10,10,10,10},
            {20,20,20,20,20},
            {30,30,30,30,30}
    };

    int total=0;
    float avg=0f;

    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        total += arr[i][j];
      }
    }

    System.out.println(total);
    System.out.println(total /(float)(arr.length * arr[0].length));


  }//end of main
  
}
