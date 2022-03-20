public class Member {
    // 멤버 변수
    private int memberId; // 회원 아이디
    private String memberName; // 회원 이름

    // 생성자
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() { // toString 메서드 오버라이딩
       return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }
}
