package com.pl.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistic")
public class Player {
    @Id
    @Column(name = "player_name",unique = true)
    private String name;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String pos;

    @Column(name = "age")
    private Integer age;

    @Column(name = "matches_played")
    private Integer mp;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes_played")
    private Double min;

    @Column(name = "goals")
    private Double gls;

    @Column(name="assists")
    private Double ast;

    @Column(name = "penalties_scored")
    private Double pk;

    @Column(name = "yellow_cards")
    private Double crdv;

    @Column(name = "red_cards")
    private Double crdr;

    @Column(name = "expected_goals")
    private Double xg;

    @Column(name = "expected_assists")
    private Double xag;

    @Column(name = "team_name")
    private String team;



    public Player(String name, String nation, String pos, Integer age, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double crdv, Double crdr, Double xg, Double xag, String team) {
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.crdv = crdv;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    public Player() {

    }

    public Double getCrdv() {
        return crdv;
    }

    public void setCrdv(Double crdv) {
        this.crdv = crdv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public void setGls(Double gls) {
        this.gls = gls;
    }

    public void setAst(Double ast) {
        this.ast = ast;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public void setCrdr(Double crdr) {
        this.crdr = crdr;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNation() {
        return nation;
    }

    public String getPos() {
        return pos;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMp() {
        return mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public Double getMin() {
        return min;
    }

    public Double getGls() {
        return gls;
    }

    public Double getAst() {
        return ast;
    }

    public Double getPk() {
        return pk;
    }

    public Double getCrdr() {
        return crdr;
    }

    public Double getXg() {
        return xg;
    }

    public Double getXag() {
        return xag;
    }

    public String getTeam() {
        return team;
    }
}
