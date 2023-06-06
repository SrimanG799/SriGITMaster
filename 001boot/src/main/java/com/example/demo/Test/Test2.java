package com.example.demo.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.StringOne;
import com.example.demo.repo.OneStringRepo;
@Component
public class Test2 implements CommandLineRunner{
 @Autowired
	OneStringRepo repo2;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String s1="sriman.kumar@gmail.com";
		String s2="pooja.marka@gmail.info";
		String s3="katla.ramya@gmail.us";
		String[] ar= {s1,s2,s3};

		for(int i=0;i<ar.length;i++)
		{
			  
String[] sr=ar[i].split("@gmail.com");
sr=sr[0].split("@gmail.info");
sr=sr[0].split("@gmail.us");
System.out.println(sr[0]);
String dot=sr[0];
String[] sa=dot.split("[.]");
//System.out.println(sa[0]+"   "+sa[1]);
StringOne so=new StringOne();
so.setFirst(sa[0]);
so.setSecond(sa[1]);
//System.out.println(so);
	repo2.save(so);		
			
		}
		
	}
}

