package br.pucrio.transilvania.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
   private int code;
   private String name;
   private String phone;
   private List<Request> reservations;

   public Client(int code, String name, String phone) {
      this.code = code;
      this.name = name;
      this.phone = phone;
      this.reservations = new ArrayList();
   }

   public int getCode() {
      return code;
   }

   public void setCode(int code) {
      this.code = code;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public List<Request> getReservations() {
      return reservations;
   }

   public void setReservations(List<Request> reservations) {
      this.reservations = reservations;
   }
}
