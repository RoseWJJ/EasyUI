package com.et.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.dao.DeptMapper;
import com.et.dao.EmpMapper;
import com.et.entity.Dept;
import com.et.entity.DeptExample;
import com.et.entity.Emp;
import com.et.entity.EmpExample;
import com.et.entity.TreeNode;
import com.et.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptMapper dm;
	@Autowired
	EmpMapper em;
	
	public int queryDeptTotalCount(DeptExample fe){
		
		int totalCount =(int)dm.countByExample(fe);
		return totalCount;
	}
	
	public List<TreeNode>  queryTreeNode(Integer pid){
		DeptExample dep = new DeptExample();
		dep.createCriteria().andPidEqualTo(pid);
		List<Dept> deptList = dm.selectByExample(dep);
		List<TreeNode> treeList  = new ArrayList<TreeNode>();
		for (Dept d:deptList){
			TreeNode tNode = new TreeNode();
			tNode.setId(d.getGid()); 
			tNode.setText(d.getEname());
			//判断当前节点下是否存在子节点
			if(queryTreeNode(d.getGid()).size()==0){
				tNode.setState("open");
			}
			treeList.add(tNode);
		}
		return treeList;
	}
	public List<Emp> queryEmp(Integer id) {
		EmpExample ee = new EmpExample();
		if(id!=null)
			ee.createCriteria().andIdEqualTo(id);
		
		return em.selectByExample(ee);
		
	}
	public void deleteDept(String id) {
		dm.deleteByPrimaryKey(Integer.valueOf(id));
	}

	public void updateDept(Dept dept) {
		dm.updateByPrimaryKey(dept);
	}
	public void addDept(Dept dept) {
		
		dm.insert(dept);
	}
}
