package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="LeaveType")
@Getter
@Setter

public class LeaveType {
	
		@Id
//		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String type;
		private int noticePeriod;
		private String description;

}
