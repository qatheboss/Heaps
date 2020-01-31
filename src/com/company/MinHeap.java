package com.company;
import java.util.ArrayList;

public class MinHeap {
    ArrayList<Integer> data;

    public MinHeap() {
        data = new ArrayList<Integer>();
    }

    public void insert(Integer value) {
        data.add(value);
        int index = data.size() - 1;
        while (index > 0) {
            int parent = (index-1)/2;
            if (data.get(index) < data.get(parent)) {
                Integer temp = data.get(index);
                data.set(index, data.get(parent));
                data.set(parent, temp);
                index = parent;
            }
            else {
                break;
            }


        }
    }

    public Integer getMin() {
        return data.get(0);
    }

    public Integer extractMin() {
        Integer min = getMin();
        remove(0);
        return min;
    }

    public void remove(int index) {
        data.set(index, data.get(data.size()-1));
        data.remove(data.size()-1);
        while (index < data.size()) {
            int leftIndex = index * 2 + 1;
            int rightIndex = index * 2 + 2;
            int best = index;
            if (leftIndex < data.size() && data.get(leftIndex) < data.get(best)) {
                best = leftIndex;
            }
            if (rightIndex < data.size() && data.get(rightIndex) < data.get(best)) {
                best = rightIndex;
            }
            if (best != index) {
                Integer temp = data.get(index);
                data.set(index, data.get(best));
                data.set(best, temp);
                index = best;
            }
            else {
                break;
            }
        }

    }

    public String toString() {
        return data.toString();

    }


}
