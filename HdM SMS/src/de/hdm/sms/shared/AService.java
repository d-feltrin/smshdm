package de.hdm.sms.shared;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.hdm.sms.shared.bo.Component;
import de.hdm.sms.shared.bo.User;

@RemoteServiceRelativePath("aservice")
public interface AService extends RemoteService {
	void insertComponent(Component c);

	ArrayList<Component> loadAllComponents();

	Component getOneComponentIdByName(String selectedComponent);

	void deleteComponentById(int deleteComponentId);

	void updateComponentById(Component c);

	void insertUser(User u);

	ArrayList<User> loadAllUsers();

	User getOneUserIdByName(String selectedUser);

	void deleteUserById(int deleteUserId);

	void updateUserById(User u);

}
