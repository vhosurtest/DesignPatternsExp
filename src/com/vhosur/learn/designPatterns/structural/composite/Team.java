package com.vhosur.learn.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Member {
    private List<Member> members = new ArrayList<>();

    public void add(Member member) {
        this.members.add(member);
    }

    @Override
    public void deploy() {
        for (Member member : members) {
            member.deploy();
        }
    }
}
