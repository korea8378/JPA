package ldj.jpa.entity.mapping;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MEMBER", uniqueConstraints = {@UniqueConstraint(
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"})})
//@SequenceGenerator(
//        name = "BOARD_SEQ_GENERATOR",
//        sequenceName = "BOARD_SEQ", //매핑할 데이터베이스 시퀀스 이름
//        initialValue = 1, allocationSize = 1)
//@TableGenerator(
//        name = "BOARD_SEQ_GENERATOR",
//        table = "MY_SEQUENCES",
//        pkColumnName = "BOARD_SEQ", allocationSize = 1)
//)
public class Member {

    @Id
    @Column(name = "ID")
    private String id;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT 사용시
//    private String id;

//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, //SEQUENCE 사용
//                    generator = "BOARD_SEQ_GENERATOR")
//    private String id;

//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE, //TABLE 사용
//                    generator = "BOARD_SEQ_GENERATOR")
//    private String id;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO) //데이터베이스 방언에 따라 자동으로 전략 선택
//    private String id;


    @Column(name = "NAME", nullable = false, length = 10)
    private String userName;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
