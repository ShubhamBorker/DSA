package org.example.Stack;

import java.util.Stack;

public class NextGTElement {

    public static void findNGE(int[] arr){
                Stack<Integer> stack = new Stack<>();
                int[] result = new int[arr.length];

                // Traverse from right to left
                for (int i = arr.length - 1; i >= 0; i--) {
                    // Pop smaller or equal elements
                    while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                        stack.pop();
                    }
                    // If stack empty → no greater element
                    result[i] = stack.isEmpty() ? -1 : stack.peek();
                    // Push current element
                    stack.push(arr[i]);
                }

                // Print results
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + " -> " + result[i]);
                }
            }

            public static void main(String[] args) {
                int[] arr = {4, 5, 2, 25,6,1};
                findNGE(arr);
            }
        }