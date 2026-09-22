package com.xworkz.monitor.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CricketTeamDto {

    private String teamName;
    private String captainName;
    private String coachName;
    private String homeGround;
    private String country;

    public CricketTeamDto() {
        System.out.println("CricketTeamDto is created");
    }
}