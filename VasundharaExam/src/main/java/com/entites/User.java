package com.entites;

public class User {

  private String UserId;
  private String password;
  
  public String getUserId() {
    return UserId;
  }
  public void setUserId(String userId) {
    UserId = userId;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public User() {
    super();
    // TODO Auto-generated constructor stub
  }
  public User(String userId, String password) {
    super();
    UserId = userId;
    this.password = password;
  }

  @Override
  public String toString() {
    return "User [UserId=" + UserId + ", password=" + password + "]";
  }
  
  
  
  
  
  
  


}
