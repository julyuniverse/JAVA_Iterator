import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList; // ArrayList 클래스는 제네릭 클래스라는 걸 알 수 있다.

    // 생성자
    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    // 생성자
    public MemberArrayList(int size) {
        arrayList = new ArrayList<>(size);
    }

    // 회원 추가
    public void addMember(Member member) {
        arrayList.add(member);
    }

    // 회원 삭제
    public boolean removeMember(int memberId) {
        /**
         * iterator() 메서드는 모든 Collection 프레임워크의 요소에 사용할 수 있다.
         * Iterator<T>를 선언하고 해당 요소에 iterator()를 붙이면 대입되는 값은 해당 요소의 index 0번째 요소 바로 이전 칸으로 커서가 잡힌다.
         * 그리고 while 문을 돌릴 때, hasNext() 메서드를 통해서 커서를 하나씩 다음 칸으로 커서를 옮긴다.
         * ex) 최초 index 0번째 바로 이전 칸 -> index 0번째 칸
          */
        // arrayList 순회
        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()) {
            Member member = ir.next();
            if(member.getMemberId() == memberId) {
                arrayList.remove(member);
                return true;
            }
        }

        // for 문에서 순회를 다 하고 나서도 memberId와 매핑되는 id가 없다면 제어가 여기로 오게 된다. 제어 처리를 해준다.
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // 모든 회원 출력
    public void showAllMember() {
        // 향상된 for 문
        for (Member member : arrayList) {
            System.out.println(member);
        }

        System.out.println();
    }
}
