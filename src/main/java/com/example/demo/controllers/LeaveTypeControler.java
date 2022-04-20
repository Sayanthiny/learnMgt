package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.LeaveType;
import com.example.demo.services.LeaveTypeService;
import com.example.demo.util.endPointURL;


@RestController
public class LeaveTypeControler {
	@Autowired
	private LeaveTypeService leaveTypeService;
	
	@PostMapping("leavetype")
	public void addLeaveType(LeaveType leaveType) {
		leaveTypeService.addLeaveType(leaveType);
	}
	
	@GetMapping(value="test")
	public String getAllLeaveType1() {
		return "hello";
	}
	
	@GetMapping("leavetype")
	public void getAllLeaveType() {
		leaveTypeService.getAllLeaveType();
	}
	
	@PutMapping(value=endPointURL.LEAVETYPE)
	public void updateLeaveType(@RequestBody LeaveType leaveType) {
		leaveTypeService.updateLeaveType(leaveType);
	}
	
	@DeleteMapping(value = endPointURL.LEAVETYPE_DELETE_BY_ID)
	public void deleteLeaveTypeById(Long id) {
		leaveTypeService.deleteLeaveTypeById(id);
	}
 
	
}
