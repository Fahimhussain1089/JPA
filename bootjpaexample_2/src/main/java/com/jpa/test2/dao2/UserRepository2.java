package com.jpa.test2.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test2.entities2.User;

public interface UserRepository2 extends CrudRepository<User, Integer> {
	//ISME find samll me hoga or ByName--> ke sahara string me use small raho
	public List<User> findByName(String name); //CUSTOM FINDER METHODE
	
	public List<User> findByNameAndCity(String name,String city);
	
	//JPA me query fire kies krte hai ,there r two way 
	//jpa query and native query languege
	
	//@Query("select u FROM User u")
	//public List<User>getAllUser(); //getAllUer hamra methode hai
	
	@Query("select u From User u WHERE u.name=:n")
	public List<User> getUserByName(@Param("n") String name);
	
	//yah pr name and city do ek sath le ke query fire hogi
	@Query("select u From User u WHERE u.name=:n and u.city=:c")
	public List<User> getUserByNameANDCity(@Param("n") String name,@Param("c") String city);
	
	/// ab hum native query fire krenge 
	
	@Query(value ="select * from user",nativeQuery =true)
	public List<User> getUsers3();
	
	
	
	

}