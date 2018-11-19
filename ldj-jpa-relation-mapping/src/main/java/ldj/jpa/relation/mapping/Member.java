package ldj.jpa.relation.mapping;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    @ManyToOne
    @JoinColumn(name="TEAM_ID")
    private Team team;

    public void setTeam(Team team) {
        //기존 팀과 관계를 제거
        if(this.team != null) {
            this.team.getMembers().remove(this);
        }
        this.team = team;
        team.getMembers().add(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team getTeam() {
        return team;
    }
}
