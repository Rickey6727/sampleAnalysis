package com.example.sample.domain.model;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "account")
public class SampleEntity {

    @Id
    private int id;
    
    private String name;
    
    public Integer getId() {
      return id;
	}
	public void setId(Integer id) {
	  this.id = id;
	}
	public String getName() {
	  return name;
	}
	public void setName(String name) {
	  this.name = name;
	}

}