package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.LeaveType;
import com.example.demo.repositories.LeaveTypeRepository;


@Service
public class LeaveTypeServiceImplementation implements LeaveTypeService{
	
	@Autowired
	private LeaveTypeRepository leaveTypeRepository;

	// add leave type
	@Transactional
	public void addLeaveType(LeaveType leaveType) {
		leaveTypeRepository.save(leaveType);
		
	}

	// update leave type
	@Override
	public void updateLeaveType(LeaveType leaveType) {
		leaveTypeRepository.save(leaveType);
	}


	// get all leave type
	@Override
	public List<LeaveType> getAllLeaveType() {
		return leaveTypeRepository.findAll();
	}
	
	// delete leave type
	@Override
	public void deleteLeaveTypeById(Long id) {
		leaveTypeRepository.deleteById(id);
		
	}
}
