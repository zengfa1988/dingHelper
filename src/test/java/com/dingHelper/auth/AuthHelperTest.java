package com.dingHelper.auth;

import org.junit.Test;

import com.dingHelper.OApiException;

public class AuthHelperTest {

	private String corpId = "ding3f28f1f5ccc43cd835c2f4657eb6378f";
	
	private String corpSecret = "ZeyYfQMU2OV1vefCZwjRJAa2JPUMz_RBFVdaJYVaZ7_2cVNKLkeVlKYf72Z8RIaC";
	
	private String ssoSecret = "b1u5ahkk9UjE0o1Q2x3sE7c5wfRrzA83fvynhG5Sqjlez5f5YJmKC6UunY0yGDzu";
	
	@Test
	public void testGetAccessToken(){
		try {
			String accessToken = AuthHelper.getAccessToken(corpId, corpSecret);
			System.out.println(accessToken);
		} catch (OApiException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetSsoToke(){
		try {
			String ssoToken = AuthHelper.getSsoToken(corpId, ssoSecret);
			System.out.println(ssoToken);
		} catch (OApiException e) {
			e.printStackTrace();
		}
	}
	
}
