package main.java.set.BasicOperations;

import java.util.Objects;

public class Guest {
  private String name;
  private int inviteCode;

  public Guest(String name, int inviteCode) {
    this.name = name;
    this.inviteCode = inviteCode;
  }

  public String getname() {
    return this.name;
  }

  public int getInviteCode() {
    return this.inviteCode;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getInviteCode());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;

    Guest other = (Guest) obj;

    if (this.inviteCode != other.inviteCode) return false;

    return true;
  }

  @Override
  public String toString() {
    return "Guest{" +
        "name='" + this.name + '\'' +
        ", inviteCode=" + this.inviteCode +
        '}';
  }
}
