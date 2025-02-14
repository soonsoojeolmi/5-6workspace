package com.multi.collection.a_basic;

import java.util.*;

public class Exec01 {
    public static void main(String[] args) {
        //List
// ArrayList는 List중에서도 가장 많이 쓰이는  List이다.

// Vector는 동기화를 제공해준다. --> 두개의 스레드가 동시에 접근한다고 했을 때 한번에 한 스레드가 접근하도록 하니깐 데이터의 안정성을 놓고 봤을 때 좋다.
//                       하지만 이런 경우는 복수의 사용자가 존재 할 때 좋은 거지
//                       애초에 한명의 사용자가 사용할 경우 동기화가 필요 없는데도 이를 고려해서 처리하게 되기 때문에 성능의 저하를 가져온다.
// 이를 보완해서 나온게 ArrayList이다.
// 근데 왜 아직도 Vector라는 개념이 없어지지 않고 존재하냐라고 한다면 이를 바탕으로 만들어진 프로그램들이 아직 존재하기 때문에 호환성을 위해 남겨놓은 것이다.

// LinkedList는 데이터와 데이터를 체인처럼 관리하는 것이다.
// 그래서 특정 인덱스에서 객체를 삭제하거나 추가 할 때 굉장히 편한데
// 왜냐하면 내가 작업하고자 하는 인덱스의 인스턴스 앞뒤를 자동으로 인지해주고 있어서
// 내가 해당 인스턴스를 삭제했을 경우 앞뒤의 링크만 연결해주는 작업을 내부적으로 해주기 때문에...
// 그래서 만약 삭제나 삽입이 좀 자주 일어난다 하는 경우 LinkedList 사용

        ArrayList a1 = new ArrayList();
        a1.add(100);
        a1.add(200);
        a1.add("제니");
        a1.add(100.0);
        a1.add(true);

        System.out.println(a1);
        System.out.println(a1.get(0));
        System.out.println(a1.size());

        a1.remove(0);
        System.out.println(a1);

        for(int i=0 ; i<a1.size() ; i++){
            System.out.println(a1.get(i));
        }

        //찾고자하는 값의  인덱스를 찾을때
        System.out.println(a1.indexOf("제니"));

        System.out.println(a1.contains("제니"));

//        a1.clear();
//        System.out.println(a1);
//        System.out.println(a1.get(0));

        for(Object o :a1){
            System.out.println(o);

            if(o instanceof String str){
                System.out.println(str);
            }
        }
        /*
         * 1. Hash (hash알고리즘 도입) :
         *     데이터의 검색 성능 향상을 위해서 사용
         *     (hashCode와 equals를 모두 오버라이딩 해야한다.)

         * 2. Set
         *     - 순서유지 안됨, 중복 저장이 되지 않는다.(수학에서의 집합 개념)
         *     - 종류로는 HashSet, LinkedHashSet, TreeSet이 있다.
         *
         * 3. HashSet
         *     - 순서가 존재하지 않는다.
         *         *     (hashCode와 equals를 모두 오버라이딩 해야한다.)

         * 4. LinkedHashSet
         *     - 넣는 순서가 유지 된다.
         *         *     (hashCode와 equals를 모두 오버라이딩 해야한다.)

         * 5. TreeSet
         *     - 정렬기준대로 순서가 정해짐(기본 오름차순)
         *     - hashCode()와 equals()를 오버라이딩 할 필요 없이 알아서 중복저장 되지 않는다.
         *     - 세팅은 해 주어야 됨(Comparable이나 Comparator 구현 클래스)
         *
         *
         */

        HashSet a2= new HashSet();

        for(int i = 0 ;i<a1.size();i++){
            a2.add(a1.get(i));
        }
        System.out.println(a2);

        a2.add("제니");
        System.out.println(a2);

        a2.addAll(a1);
        System.out.println(a2);

        for(Object o :a2){
            System.out.println(o);
        }

        Iterator it = a2.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //map - 매핍시킨다. 연결시킨다.
        //키 : 값의 쌍으로 매핑시켜서 연결시켜서 저장함.
        /*
         * Map :
         * 데이터를 저장할때 각각의 자료를 구분지을수 있는 고유의 값을 정하여 해당값으로 접근할수 있는 실제 객체를 묶어 함꼐 관리하는 자료 구조 클래스.
         * 해당객체를 저장할때 key(고유의값 ) 은 set 의 특성으로 value(실제객체)는 List 의 특성으로 관리한다.
         * 종류는 크게 HashMap, HashTable(예전버전 -HashMap과 동일 스레드세이프가있다 ), TreeMap, Properties 등이 있다.
         *
         * - map은 key와 value로 구분되어 있고 이걸 로그인 할 때 ID와 PWD처럼 생각하면 편하다.
         *   (ID는 중복 불가능, 즉 Set과 관련이 있음을 알 수 있다.)
         *
         * - key와 value를 묶어서 Entry라고 한다. */

        HashMap map = new HashMap();
        map.put("apple", "사과");
        map.put("melon", "멜론");
        map.put("멜론", "사과");
        System.out.println(map);
        System.out.println(map.get("melon"));

        map.remove("melon");
        System.out.println(map);

        map.replace("apple", "사과", "황금사과");
        System.out.println(map);

        Set entrySet = map.entrySet();
        Iterator it2 = entrySet.iterator();

        while(it2.hasNext()){
            System.out.println(it2.next());
//            Map.Entry entry = (Map.Entry)it2.next();
//            System.out.println(entry.getKey()+" : "+entry.getValue());

            //방법2
//            Set KeySet = map.keySet();
//            Iterator it3 =  keySet.iterator();
//            while(it3.hasNext()){
//                //System.out.println(it3.next());
//                String key = (String)it3.next();
//                System.out.println(map.get(key));
//            }
//
//            Collection values = map.values();
//            Iterator it4 = value.iterator();
//            while(it4.hasNext()){
//                System.out.println(it4.next());
//            }
        }

        // LinkedList는 Queue 인터페이스를 구현하므로,
// 큐의 기능인 FIFO(First-In-First-Out) 원칙에 따라 요소를 추가하고 제거하는 메서드 사용

        LinkedList<String> milk = new LinkedList<>();

        milk.add("111");
        milk.add("222");
        milk.add("333");

        System.out.println(milk);

        milk.addLast("상한우유");
        milk.addFirst("신선한우유");
        milk.addLast("초코우유");
        milk.addFirst("바나나우유");

        System.out.println(milk);

        milk.removeFirst();
        milk.removeLast();

        System.out.println(milk);

        milk.remove();
        milk.remove();
        milk.remove();
        System.out.println(milk);

        for(String s : milk){
            System.out.println(s);
        }

        //Stack (후입선출 - LIFO)
//        Stack은 Vector를 상속받아 구현되었으며, LIFO(Last-In, First-Out) 방식으로 동작한다.
//        push(), pop(), peek() 등의 메서드를 제공한다.
//

        Stack<Integer> stack = new Stack<>();


        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        // Queue 계열 (선입선출 - FIFO)
//        Queue는 FIFO(First-In, First-Out) 방식으로 동작하는 자료구조다.
//                요소가 추가된 순서대로 처리된다.

        Queue<String> queue= new LinkedList<>();
        queue.add("111");
        queue.add("222");
        queue.add("333");
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        //        Deque (Double Ended Queue) 인터페이스를 구현하는 ArrayDeque 또는 LinkedList를 사용하여
//        양방향에서 요소를 추가 및 제거할 수 있다.

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("1");
        deque.addLast("2");
        deque.addFirst("3");

        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
