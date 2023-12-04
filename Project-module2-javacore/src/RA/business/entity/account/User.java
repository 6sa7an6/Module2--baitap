package RA.business.entity.account;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class User implements Serializable {
    private Long id;
    private String username;
    private String email;
    private String fullName;
    private String password;
    private boolean role;
    private boolean status;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private List<OrdersDetail> carts;

    public User() {
    }

    public User(Long id, String username, String password, boolean role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public List<OrdersDetail> getCarts() {
        return carts;
    }

    public void setCarts(List<OrdersDetail> cart) {
        this.carts = cart;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", role=" + (role?"admin":"user") +
                ", status=" + (status?"Active":"Block") +
                ", createAt=" + createAt +
                ']';
    }
}
