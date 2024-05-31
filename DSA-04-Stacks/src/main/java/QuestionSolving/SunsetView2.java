package QuestionSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetView2 { // STACK
    public static void main(String[] args) {

        int [] builds = {3,5,4,4,3,1,3,2};
        System.out.println(sunsetView(builds, "west"));


    }

    public static ArrayList<Integer> sunsetView(int[] arr, String direction){

        // i'll create a stack
        Stack<Integer> result = new Stack<>();

        // i will create a moving index
        int i = 0 ;
        int step = -1;

        // i will check the direction if its west
        if (direction.equalsIgnoreCase("west")){
            i= arr.length-1;
            i= -step;
        }

        // i will travel int array
        while (i>=0 && i < arr.length){ // while loop will continue depends on this conditions

            while (!result.isEmpty() && arr[i] >= arr[result.peek()]){ // while loop will continue depends on this conditions
                result.pop();
            }

            result.push(i);
            i+=step;


        }


        if (direction.equalsIgnoreCase("west")) Collections.reverse(result);

        return  new ArrayList<>(result);
    }

}
