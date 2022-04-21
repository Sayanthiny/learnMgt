package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.LeaveType;
import com.example.demo.services.LeaveTypeService;
import com.example.demo.util.EndPointURL;


@RestController
public class LeaveTypeControler {
	@Autowired
	private LeaveTypeService leaveTypeService;
	
	@PostMapping(value=EndPointURL.LEAVETYPE)
	public void addLeaveType(@RequestBody LeaveType leaveType) {
		leaveTypeService.addLeaveType(leaveType);
	}
	
//	@GetMapping(value="test")
//	public String getAllLeaveType1() {
//		return "hello";
//	}
	
	@GetMapping(value=EndPointURL.LEAVETYPE)
	public List<LeaveType> getAllLeaveType(){
		return leaveTypeService.getAllLeaveType();
	}
	
	@PutMapping(value=EndPointURL.LEAVETYPE)
	public void updateLeaveType(@RequestBody LeaveType leaveType) {
		leaveTypeService.updateLeaveType(leaveType);
	}
	
	@DeleteMapping(value = EndPointURL.LEAVETYPE_DELETE_BY_ID)
	public void deleteLeaveTypeById(@PathVariable Long id) {
		leaveTypeService.deleteLeaveTypeById(id);
	}
 
	
}
