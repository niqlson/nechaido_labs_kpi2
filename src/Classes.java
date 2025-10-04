import java.math.BigDecimal;
import java.time.LocalDateTime;

enum OrderStatus {
    PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED
}

enum ReservationStatus {
    PENDING, CONFIRMED, COMPLETED, CANCELLED
}

class User {
    public Long id;
    public String email;
    public String password;
    public String firstName;
    public String lastName;
    public String role; // CUSTOMER, ADMIN
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
}

class Admin extends User {
    public Long id;
    public String adminLevel;
    public String permissions;
    public User user; //one to one
}

class Customer extends User {
    public Long id;
    public String phone;
    public String address;
    public Integer loyaltyPoints;
    public User user; //one to one
}

class Product {
    public Long id;
    public String name;
    public String description;
    public BigDecimal price;
    public Integer stockQuantity;
    public String category;
    public String imageUrl;
    public Boolean isActive;
    public LocalDateTime createdAt;
}

class Discount {
    public Long id;
    public String code;
    public BigDecimal percentage;
    public LocalDateTime startDate;
    public LocalDateTime endDate;
    public Integer maxUses;
    public Integer usedCount;
    public Boolean isActive;
    public LocalDateTime createdAt;
}

class Review {
    public Long id;
    public Integer rating;
    public String comment;
    public LocalDateTime createdAt;
    public Customer customer; // Many to one
    public Product product; //Many to one
}

class Cart {
    public Long id;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
    public Customer customer; // One to one
}

class CartItem {
    public Long id;
    public Integer quantity;
    public Cart cart; //Many to one
    public Product product; //Many to one
}

class Order {
    public Long id;
    public LocalDateTime orderDate;
    public BigDecimal totalAmount;
    public OrderStatus status;
    public String shippingAddress;
    public String paymentMethod;
    public Customer customer; // Many to one
    public Discount discount; //One to one, nullable
}

class OrderItem {
    public Long id;
    public Integer quantity;
    public BigDecimal unitPrice;
    public Order order; //Many to one
    public Product product; //Many to one
}

class Reservation {
    public Long id;
    public LocalDateTime reservationDate;
    public ReservationStatus status;
    public LocalDateTime pickupDate;
    public Customer customer; //Many to one
}

class ReservationItem {
    public Long id;
    public Integer quantity;
    public Reservation reservation; //Many to one
    public Product product; //Many to one
}