package com.example.demo.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.example.demo.model.MailSpilt;
import com.example.demo.repo.MyReo;
@Component
public class Test implements CommandLineRunner{
@Autowired
	MyReo repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String s1="Katla@Ramya.gmail.com";
//		String[] arr=s1.split("@");
//		MailSpilt ma=new MailSpilt();
//		ma.setFirst(arr[0]);
//		String[] s2=arr[1].split(".gmail.com");
//		ma.setSecond(s2[0]);
//		repo.save(ma);
	String s3="sriman799@ciq.gmail.com";
	String s4="pooja@marka.gmail.com";
	String s5="mahesh@unukuru.gmail.com";
	
	String[] ar= {s3,s4,s5};
	for(int i=0;i<ar.length;i++)
	{
		
		String[] arr=ar[i].split("@");
		MailSpilt ma=new MailSpilt();
		ma.setFirst(arr[0]);
		String[] s2=arr[1].split(".gmail.com");
		ma.setSecond(s2[0]);
		//repo.save(ma);
		System.out.println(ma.toString());
	}
		
		
		
		
	}

}
