package spring.tutorial.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import spring.tutorial.domaine.UserDetails;

@WebService
public interface IBanAcountService {
	
	public UserDetails getUserDetails(@WebParam(name="userName") final String userVame);
	public void addUserDetails(@WebParam(name="userDetails") final UserDetails  details);

	
}
