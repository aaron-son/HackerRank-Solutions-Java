import java.util.*;

public class Solution {
//    Boolean isValid = true;
//    Map<String, Boolean> magazineMap;
//    Map<String, Boolean> noteMap;
//
//    public Solution(String magazine, String note) {
//        magazineMap = new HashMap<String, Boolean>();
//        noteMap = new HashMap<String, Boolean>();
//
//        for (String key : magazine.split(" ")) {
//            magazineMap.put(key, Boolean.FALSE);
//        }
//        for (String key  : note.split(" ")) {
//            noteMap.put(key, Boolean.FALSE);
//            if(noteMap.get(magazineMap.get(key)) == Boolean.TRUE){
//                noteMap.put(key, Boolean.TRUE);
//                System.out.println(noteMap.get(magazineMap.get(key)));
//            }
//        }
//        System.out.println(noteMap);
////        for(int i=0; i <= noteMap.size(); i++) {
////            if(noteMap.get())
////        }
//
//        if(magazineMap.size() < noteMap.size()){
//            isValid = false;
//        }
//    }

    Map<String, Integer> magazineMap;
    boolean isValid;

    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        isValid = true;

        for (String word : magazine.split(" ")) {
            Integer i = magazineMap.get(word);

            if (i == null) {
                magazineMap.put(word, 1);
            } else {
                magazineMap.put(word, i + 1);
            }
        }

        for (String word : note.split(" ")) {
            Integer i = magazineMap.get(word);

            if (i == null || magazineMap.get(word) == 0) {
                isValid = false;
                break;
            } else {
                magazineMap.put(word, i - 1);
            }
        }
    }

    public boolean solve() {
        return isValid;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//
//        // Eat whitespace to beginning of next line
//        scanner.nextLine();
//
//        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
//        scanner.close();


//        int m = 6;
//        int n = 5;

        int m = 6;
        int n = 4;

//        Solution s = new Solution("two times three is not four", "two times two is four");
        Solution s = new Solution("give me one grand today night", "give one grand today");

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}



