package com.spock.auth;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.spock.dao.UserRepository;
import com.spock.entity.User;


@RestController
public class AuthController {

	@Autowired
	UserRepository userRepository;
	
	PasswordEncoder  passwordEncoder = new BCryptPasswordEncoder(); 
	Map<String, String> responseBody;


	@PostMapping("/api/1.0/auth")
	public ResponseEntity<?> handlerAuthencation(@RequestHeader(name = "Authorization", required = false) String authorization){
		if(authorization == null ) {
			
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		
		String Base64Encoder = authorization.split("Basic ")[1];
		String decoded = new String(Base64.getDecoder().decode(Base64Encoder));
		String[] parts = decoded.split(":");
		String username = parts[0];
		String password = parts[1];
		
		User inDB = userRepository.findByUsername(username);
		if(inDB == null) {
			
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		String hashedPassword = inDB.getPassword();
		if(!passwordEncoder.matches(password, hashedPassword)) {
			
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		
		responseBody = new HashMap<String, String>();
		responseBody.put("username", inDB.getUsername());
		responseBody.put("depotcode", inDB.getDepotcode());
		
		return ResponseEntity.ok().body(responseBody);
	}
}
