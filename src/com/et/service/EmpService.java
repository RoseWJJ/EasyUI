package com.et.service;


import com.et.entity.Emp;
import com.et.util.PageTools;

public interface  EmpService {
	public abstract PageTools queryEmp(String sname,Integer page,Integer rows);
	public abstract void deleteEmp(String id);
	public abstract void updateEmp(Emp dept);
	public abstract void addEmp(Emp dept);
}
