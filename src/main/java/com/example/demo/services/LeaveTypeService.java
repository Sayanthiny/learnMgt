package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.LeaveType;

@Service
public interface LeaveTypeService {
	// add leaveType
	public void addLeaveType(LeaveType leaveType);
	
	//update leave type
	public void updateLeaveType(LeaveType leaveType);
	
	// get all leave type
	public List<LeaveType> getAllLeaveType();
	
	// delete leave type
	public void deleteLeaveTypeById(Long id);
	
	

}
