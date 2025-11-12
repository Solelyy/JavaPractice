package methods;

import java.util.*;

class Child {
    String stdId;
    String name;
    int ageInMonths;
    String originalAge;

    public Child(String stdId, String name, String ageString) {
        this.stdId = stdId;
        this.name = name;
        this.originalAge = ageString;
        this.ageInMonths = convertToMonths(ageString);
    }

    private int convertToMonths(String ageStr) {
        ageStr = ageStr.trim().toLowerCase();
        if (ageStr.contains("mo")) {
            return Integer.parseInt(ageStr.split(" ")[0]);
        } else if (ageStr.contains("yr")) {
            return Integer.parseInt(ageStr.split(" ")[0]) * 12;
        }
        return 0;
    }

    public String getStage() {
        int years = ageInMonths / 12;
        if (ageInMonths <= 11) return "Infant";
        else if (years >= 1 && years <= 5) return "Toddler";
        else if (years >= 6 && years <= 11) return "Child";
        else if (years >= 12 && years <= 18) return "Adolescent";
        else return "Adult";
    }

    @Override
    public String toString() {
        return stdId + " | " + name + " | " + originalAge + " | " + getStage();
    }
}

public class MergeSort {
    // Divide & Conquer Merge Sort
    public static void mergeSort(List<Child> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private static void merge(List<Child> list, int left, int mid, int right) {
        List<Child> temp = new ArrayList<>();
        int i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (list.get(i).ageInMonths <= list.get(j).ageInMonths)
                temp.add(list.get(i++));
            else
                temp.add(list.get(j++));
        }
        while (i <= mid) temp.add(list.get(i++));
        while (j <= right) temp.add(list.get(j++));

        for (int k = 0; k < temp.size(); k++) {
            list.set(left + k, temp.get(k));
        }
    }

    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();
        children.add(new Child("S01", "Marian Rivera", "9 mo old"));
        children.add(new Child("S02", "Dingdong Dantes", "2 yrs old"));
        children.add(new Child("S03", "Kylie Padilla", "4 yrs old"));
        children.add(new Child("S04", "Aljur Abrenica", "1 mo old"));
        children.add(new Child("S05", "Terra", "18 yrs old"));
        children.add(new Child("S06", "Danaya", "23 yrs old"));
        children.add(new Child("S07", "Flamarra", "2 mo old"));

        // Sort using Divide and Conquer
        mergeSort(children, 0, children.size() - 1);

        // Display sorted result
        System.out.println("Sorted by Age (Youngest to Oldest):");
        System.out.printf("%-10s | %-20s | %-10s | %-20s%n",
                "StdID", "Name", "Age", "Development Stage");
        System.out.println("---------------------------------------------------------------");

        for (Child c : children) {
            System.out.printf("%-10s | %-20s | %-10s | %-20s%n",
                    c.stdId, c.name, c.originalAge, c.getStage());
        }

        // Filter by developmental stages
        System.out.println("\n=== Filtered by Developmental Stages ===");
        Map<String, List<Child>> stages = new LinkedHashMap<>();
        for (Child c : children) {
            stages.computeIfAbsent(c.getStage(), k -> new ArrayList<>()).add(c);
        }

        for (String stage : stages.keySet()) {
            System.out.println("\n" + stage + ":");
            for (Child c : stages.get(stage)) {
                System.out.println(" - " + c.name + " (" + c.originalAge + ")");
            }
        }
    }
}

