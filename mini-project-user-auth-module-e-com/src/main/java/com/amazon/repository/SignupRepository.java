package com.amazon.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.amazon.request.Users;

@Repository
public class SignupRepository {

	 ArrayList<Users> users = new ArrayList<>();

    public void save(Users user) {
        users.add(user);
    }
    
    public boolean doLoginRepo(String email, String password)
    {
    	for(Users u: users)
    	{
    		if(u.getEmail().equals(email) && u.getPassword().equals(password))
    			return true;
    	}
    	return false;
    }
    
    public boolean doResetPass(String email, String Pass, String newPass)
    {
    	for(Users e: users)
    	{
    		if(e.getEmail().equals(email) && e.getPassword().equals(Pass))
    		{
    			e.setPassword(newPass);
    			return true;
    		}
    	}
    	return false;
    }
    
    
}
