package ru.vsu.cs.baturin_v_a.util;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockedQueueUtils {

    public static LinkedBlockingQueue<Integer> intArrayToList(int[] array) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        for (int j : array) {
            queue.add(j);
        }
        return queue;
    }

    public static int[] intListToArray(LinkedBlockingQueue<Integer> queue) {
        int[] array = new int[queue.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = queue.remove();
        }
        return array;
    }
}