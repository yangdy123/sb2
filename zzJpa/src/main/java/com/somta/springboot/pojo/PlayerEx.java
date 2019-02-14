package com.somta.springboot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class PlayerEx {
 
   @Id
   @SequenceGenerator(name = "SEQ_ANSWER_OPTION", sequenceName = "SEQ_ANSWER_OPTION", allocationSize = 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ANSWER_OPTION")
   @Column(name = "ID", unique = true, nullable = false, precision = 18, scale = 0)
   private Long id;
 
   @Column(name = "name")
   private String name;
 
   @Column(name = "num")
   private int num;
 
   @Column(name = "position")
   private String position;
   
//   @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "team_id", nullable = false)
//    private Team team;
   
   public PlayerEx() {
   }
 
   public Long getId() {
      return id;
   }
 
   public void setId(Long id) {
      this.id = id;
   }
 
   public String getName() {
      return name;
   }
 
   public void setName(String name) {
      this.name = name;
   }
 
   public int getNum() {
      return num;
   }
 
   public void setNum(int num) {
      this.num = num;
   }
 
   public String getPosition() {
      return position;
   }
}