  package fca.suayed.dto;
  
  import org.jdbi.v3.core.mapper.reflect.ColumnName;
  
  public class ClientDto {
      private Long id;
      private String name;
      private String email;
      private String phone;
  
      public Long getId() {
          return id;
      }
  
      public void setId(Long id) {
          this.id = id;
      }
  
      @ColumnName("nombre")
      public String getName() {
          return name;
      }
  
      public void setName(String name) {
          this.name = name;
      }
  
      @ColumnName("correo")
      public String getEmail() {
          return email;
      }
  
      public void setEmail(String email) {
          this.email = email;
      }
  
      @ColumnName("telefono")
      public String getPhone() {
          return phone;
      }
  
      public void setPhone(String phone) {
          this.phone = phone;
      }
  }
