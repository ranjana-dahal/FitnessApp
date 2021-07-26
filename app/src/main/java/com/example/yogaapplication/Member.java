package com.example.yogaapplication;

public class Member {
    String memberId;
    String memberName;
    String memberWeight;
    String memberHeight;
    String memberGen;

    public Member(){

    }
    public Member(String memberId , String memberName , String memberWeight , String memberHeight , String memberGen){
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberWeight = memberWeight;
        this.memberHeight = memberHeight;
        this.memberGen = memberGen;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberWeight() {
        return memberWeight;
    }

    public void setMemberWeight(String memberWeight) {
        this.memberWeight = memberWeight;
    }

    public String getMemberHeight() {
        return memberHeight;
    }

    public void setMemberHeight(String memberHeight) {
        this.memberHeight = memberHeight;
    }

    public String getMemberGen() {
        return memberGen;
    }

    public void setMemberGen(String memberGen) {
        this.memberGen = memberGen;
    }
}
