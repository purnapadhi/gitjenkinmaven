package com.purna.gitjenkindockerexample.controller;

import java.util.ArrayList;
import java.util.List;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;*/
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.purna.gitjenkindockerexample.model.User;


@RestController
public class UserController {
	/*@Autowired(required=true)
	RestTemplate restTemplate;*/
	@GetMapping("/welcome")
	public ResponseEntity<?> defaultMessage (){
		//HttpHeaders httpheaders=new HttpHeaders();
		//HttpEntity<String> httpentity=new HttpEntity<>(String.class.toString(),httpheaders);
		//ResponseEntity<?> result=  restTemplate.exchange("http://localhost:2346/", HttpMethod.GET, httpentity, String.class);//("http://localhost:2346" , HttpMethod.GET,ResponseEntity.class.toString() );
		return new ResponseEntity<String>("WEL COME TO PURNA Project",HttpStatus.OK);
		
	}
	@GetMapping("/users")
	public ResponseEntity<?> getAllUser (){
		List<User> userList=new ArrayList<>();
		User user1=new User(1,"AMIT");
		User user2=new User(2,"MANMATH");
		User user3=new User(3, "YUVRAJ");
		User user4=new User(4,"PURNA");
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		//execute(url, HttpMethod.GET, requestCallback, responseExtractor, uriVariables)
		
		
		/*List<AccountUser> userList1=null;
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<List<AccountUser>> httpentity=new HttpEntity<>(userList1, headers);
		ResponseEntity<ArrayList> result= restTemplate.exchange("http://localhost:2346" , HttpMethod.GET, httpentity , ArrayList.class);
		userList1=result.getBody();
		System.out.println(userList1);*/
		
		return new ResponseEntity<List<User>>(userList,HttpStatus.OK);
		//return new ResponseEntity<List<AccountUser>>(userList1,HttpStatus.OK);
	}
	/*@GetMapping("/get")
	public List<AccountUser> getAllUser1 (){
	
		
		List<AccountUser> userList1=null;
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<List<AccountUser>> httpentity=new HttpEntity<>(userList1, headers);
		ResponseEntity<ArrayList> result= restTemplate.exchange("http://localhost:2346/" , HttpMethod.GET, httpentity , ArrayList.class);
		userList1=result.getBody();
		System.out.println(userList1);
		return userList1;
		
		//return new ResponseEntity<List<User>>(userList,HttpStatus.OK);
		//return new ResponseEntity<List<AccountUser>>(userList1,HttpStatus.OK);
	}
*/
}

  