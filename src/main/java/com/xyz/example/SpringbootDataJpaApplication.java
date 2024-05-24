package com.xyz.example;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xyz.example.entity.User;
import com.xyz.example.repo.UserRepository;

@SpringBootApplication
public class SpringbootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootDataJpaApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		
//		------------------ 1. CREATE USER ----------------
		User user1 = new User();
		user1.setName("Varsha");
		user1.setCity("MZP");
		user1.setStatus("Programmer");
		
		User user2 = new User();
		user2.setName("Rani");
		user2.setCity("DDN");
		user2.setStatus("Java Dev");
		
		User user3 = new User();
		user3.setName("Annie");
		user3.setCity("KBG");
		user3.setStatus("python Dev");
		
//		SAVE SINGLE USER
//		User resUser = userRepo.save(user3);
//		System.out.println(resUser);
		
//		SAVE MULTIPLE USER
//		List<User> users = List.of(user1, user2);
//		Iterable<User> resUser = userRepo.saveAll(users);
//		resUser.forEach(e->System.out.println(e));
		
//		-----------------  2. UPDATE User for id=203 ---------------
//		Optional<User> optional = userRepo.findById(203);
//		User user = optional.get();
//		user.setName("Prachi");
//		User result = userRepo.save(user);
//		System.out.println(result);
		
//		------------------ 3. READ/FIND USERS -----------------------
		
//		Optional<User> optional = userRepo.findById(203);
//		User user = optional.get();
//		System.out.println(user);
		
//		Iterable<User> itr = userRepo.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});
//		itr.forEach(e->System.out.println(e));
		
//		------------------- 4. DELETE USER -------------------
		
//		userRepo.deleteById(252);
//		System.out.println("deleted!!");
		
//		Iterable<User> allUsers = userRepo.findAll();
//		allUsers.forEach(e->System.out.println(e));
//		userRepo.deleteAll(allUsers);
		
//		------------------ Custom Finder Method --------------
//		List<User> users = userRepo.findByName("Varsha");
//		users.forEach(e->System.out.println(e));
//		List<User> userss = userRepo.findByNameAndCity("Varsha","MZP");
//		userss.forEach(e->System.out.println(e));
		
//		------------------ JPQL / Native query ---------------
		
		List<User> allUser = userRepo.getAllUser();
		allUser.forEach(e->System.out.println(e));
		
		List<User> userByName = userRepo.getUserByName("Prachi");
		userByName.forEach(e->System.out.println(e));
		
		List<User> userByNameAndCity = userRepo.getUserByNameAndCity("Prachi", "DDN");
		userByNameAndCity.forEach(e->System.out.println(e));
	
		userRepo.getUsers().forEach(e->System.out.println(e));
	}

}
