package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public abstract class Groups {
	
	protected String groupName;
	protected int groupCount;
	
	protected ArrayList<User> groupList;

	public Groups(){
		this.groupList = new ArrayList<User>();
	}
	
	
	
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getGroupCount() {
		return groupCount;
	}

	public void setGroupCount(int groupCount) {
		this.groupCount = groupCount;
	}

	public void addUserToGroup(User user){
		groupList.add(user);
	}
	
	public void removeUserFromGroup(User user){
		groupList.remove(user);
	}
	
	
	public abstract void follow();
	
	public abstract void notifygroup(String message);
	

}
