public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1001, "이태성");
        Member member2 = new Member(1002, "이정민");
        Member member3 = new Member(1003, "강감찬");
        Member member4 = new Member(1004, "홍길동");
        Member member5 = new Member(1005, "정기윤");

        // 회원 추가
        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.addMember(member4);
        memberArrayList.addMember(member5);

        memberArrayList.showAllMember();

        // 회원 삭제
        memberArrayList.removeMember(member1.getMemberId());

        memberArrayList.showAllMember();

        // 결과
        // 이태성 회원님의 아이디는 1001입니다.
        // 이정민 회원님의 아이디는 1002입니다.
        // 강감찬 회원님의 아이디는 1003입니다.
        // 홍길동 회원님의 아이디는 1004입니다.
        // 정기윤 회원님의 아이디는 1005입니다.
        //
        // 이정민 회원님의 아이디는 1002입니다.
        // 강감찬 회원님의 아이디는 1003입니다.
        // 홍길동 회원님의 아이디는 1004입니다.
        // 정기윤 회원님의 아이디는 1005입니다.
    }
}
