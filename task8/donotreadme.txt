//        ArrayList<Integer> ourList=  new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 7,7, 8, 8, 9, 9));
//        Set<Integer> ourSet = new HashSet<>(ourList);
//        System.out.printf("Процент уникальных чисел = %d%n", ourSet.size()*100/ourList.size());

Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 7, 8, 9, 10));
Set<Integer> tempSet = new HashSet<>(set1);
tempSet.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(tempSet);