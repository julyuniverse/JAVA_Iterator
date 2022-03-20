# Collection 요소를 순회하는 Iterator

## 요소의 순회란?

- 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
- 순서가 있는 List 인터페이스의 경우는 Iterator를 사용하지 않고 get(i) 메서드를 활용할 수 있음.
- Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회함.

## Iterator 사용하기

- boolean hasNext(): 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 true를 반환
- E next(): 다음에 있는 요소를 반환
- iterator() 메서드는 모든 Collection 프레임워크에 요소에 사용할 수 있다.
  Iterator<T>를 선언하고 해당 요소에 iterator()를 붙이면 대입되는 값은 해당 요소의 index 0번째 요소 바로 이전 칸으로 커서가 잡힌다.
  그리고 while 문을 돌릴 때, hasNext() 메서드를 통해서 커서를 하나씩 다음 칸으로 커서를 옮긴다.
  ex) 최초 index 0번째 바로 이전 칸 -> index 0번째 칸