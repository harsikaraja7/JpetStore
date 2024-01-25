package com.pageobectmanager;

import com.base.BaseClass;
import com.page.SingInPage;

public class PageObjectManager extends BaseClass{
private SingInPage signIn;

public SingInPage getSignin() {
	return(signIn==null) ? signIn=new SingInPage() : signIn;
}



}
