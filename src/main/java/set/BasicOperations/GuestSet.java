package main.java.set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
  private Set<Guest> guestSet;

  public GuestSet() {
    this.guestSet = new HashSet<>();
  }

  public void addGuest(String name, int inviteCode){
    this.guestSet.add(new Guest(name, inviteCode));
  }

  public void removeGuestByInviteCode(int inviteCode){
    Guest guestToRemove = null;
    for(Guest g: this.guestSet){
      if(g.getInviteCode() == inviteCode){
        guestToRemove = g;
        break;
      }
    }

    this.guestSet.remove(guestToRemove);
  }

  public int countGuests(){
    return this.guestSet.size();
  }

  public void showGuests(){
    System.out.println(this.countGuests());
  }
}
