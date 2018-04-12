package com.dingHelper.department;

import java.util.List;

import org.junit.Test;

import com.dingHelper.OApiException;
import com.dingHelper.auth.AuthHelper;

public class DepartmentHelperTest {

	private String corpId = "ding3f28f1f5ccc43cd835c2f4657eb6378f";
	
	private String corpSecret = "ZeyYfQMU2OV1vefCZwjRJAa2JPUMz_RBFVdaJYVaZ7_2cVNKLkeVlKYf72Z8RIaC";
	
	private String ssoSecret = "b1u5ahkk9UjE0o1Q2x3sE7c5wfRrzA83fvynhG5Sqjlez5f5YJmKC6UunY0yGDzu";
	
	@Test
	public void testListDepartments() throws OApiException{
		String accessToken = AuthHelper.getAccessToken(corpId, corpSecret);
		System.out.println(accessToken);
		List<Department> departmentList = DepartmentHelper.listDepartments(accessToken);
		for (Department department : departmentList) {
			System.out.println(department);
		}
	}
	
	@Test
	public void testGetDepartment() throws OApiException{
		String accessToken = AuthHelper.getAccessToken(corpId, corpSecret);
		System.out.println(accessToken);
		Department department = DepartmentHelper.getDepartment(accessToken, 1l);
		System.out.println(department);
	}
}
