package com.jpa.test2;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test2.dao2.UserRepository2;
import com.jpa.test2.entities2.User;

@SpringBootApplication
public class Bootjpaexample2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaexample2Application.class, args);
		UserRepository2 userRepository2=context.getBean(UserRepository2.class);
		
		/*
		 * User user = new User(); 
		 * user.setName("durgesh kumar Tiwari");
		 * user.setCity("Delhi"); 
		 * user.setStatus("i am java developer");
		 * 
		 * User user1 = userRepository2.save(user); System.out.println(user1);
		 */
		
		
		/*
		 * //create object of user User user1 = new User(); user1.setName("SAMIM");
		 * user1.setCity("BEGUSRAYE"); user1.setStatus("MULTI LEVEL MARKITING");
		 * 
		 * User user2 = new User(); user2.setName("RAJ"); user2.setCity("BIHAR");
		 * user2.setStatus("ANDROID programmer");
		 */
		
		
		/*
		 * User resultUser = userRepository2.save(user1); //YE SAVE KR RHE HAI SINGLE
		 * USER System.out.println("saved user" + resultUser);
		 * System.out.println("deho ho gya");
		 */
		
		/* YE MULTIDATA KO SAVE KRNE KE LIYE EK BAR ME HI SAVE KER  DEGA
		 * 
		 * List<User> users = List.of(user1,user2); Iterable<User> result =
		 * userRepository2.saveAll(users);//yan dihan dena *users hai
		 * 
		 * 
		 * result.forEach(user->{ System.out.println(user); });
		 * 
		 * //System.out.println("save user"+ resultUser);
		 * System.out.println("IT DONE GURU G");
		 */
		
		
		//UPDATE USER DATA
		/*
		 * Optional<User> optional=userRepository2.findById(52);
		 * 
		 * User user = optional.get();
		 * 
		 * user.setName("PAPPU KUMAR"); user.setCity("MUMBAI");
		 * user.setStatus("EMAIL MARKETING");
		 * 
		 * User result =userRepository2.save(user);
		 * 
		 * System.out.println(result);
		 */
		
		
		// HOW TO GET THE DATA
		
		/*findById(id)-
		return optional containing ur data
		
		*/
		
		
		
		// Iterable<User> itr = userRepository2.findAll();
		  
			/*
			 * Iterator<User> iterator = itr.iterator();
			 * 
			 * while(iterator.hasNext()) { User user=iterator.next();
			 * System.out.println(user); } //ek new methode aya hai.
			 */
		
		
		/*
		 * itr.forEach(new Consumer<User>() {
		 * 
		 * @Override public void accept(User t) { // TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * });
		 */

		
	//	itr.forEach(user->{System.out.741 ln(user);});
		
		//ab DELETE KISE KERTE HAI 
		//userRepository2.deleteById(203);
		
		//System.out.println("DELETED HO GYA ");
		
		//AB MULTIPLE DELETE KESE KRENGE 
//		Iterable<User> allusers = userRepository2.findAll();
//		allusers.forEach(user->System.out.println(user));
//		userRepository2.deleteAll(allusers);
		
		//CUSTOM FINDER METHODE
		List<User> users = userRepository2.findByName("UTTAM");
		users.forEach(e->System.out.println(e));
		System.out.println("______________________________");
		
		List<User> byNameAndCity = userRepository2.findByNameAndCity("RAJ", "BIHAR");
		byNameAndCity.forEach(e->System.out.println(e));
		
		//aab hum khud query likhenge
		System.out.println("______________________________________");
		/*
		 * List<User> allUser = userRepository2.getAllUser(); allUser.forEach(e->{
		 * System.out.println(e); });
		 * 
		 */
		List<User> userByName = userRepository2.getUserByName("PAPPU KUMAR");
		userByName.forEach(e->{
			System.out.println(e);
		});
		System.out.println("______________________________________");
		
		List<User> userByNameList = userRepository2.getUserByNameANDCity("durgesh kumar Tiwari" ,"DELHI");
		userByNameList.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		userRepository2.getUsers3().forEach(e->System.out.println(e));
		
		
	}

}
