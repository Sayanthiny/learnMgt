package com.example.demo.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.LeaveType;


public interface LeaveTypeService {
	// add leaveType
	public void addLeaveType(@RequestBody LeaveType leaveType);
	
	//update leave type
	public void updateLeaveType(@RequestBody LeaveType leaveType);
	
	// get all leave type
	public List<LeaveType> getAllLeaveType();
	
	// delete leave type
	public void deleteLeaveTypeById(Long id);

}
