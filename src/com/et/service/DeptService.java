package com.et.service;

import java.util.List;


import com.et.entity.Emp;
import com.et.entity.TreeNode;

public interface DeptService {

	public abstract List<TreeNode> queryTreeNode(Integer pid);
	public abstract List<Emp> queryEmp(Integer id );
	
	

}