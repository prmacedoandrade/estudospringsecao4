package br.com.estudo.br.com.estudo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "cart_date")
    private LocalDate cartDate;

    @Column(name = "cart_value", scale = 2, precision = 20)
    private BigDecimal value;

    @OneToMany(mappedBy = "cart")
    private Set<ProductCart> productCarts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCartDate() {
        return cartDate;
    }

    public void setCartDate(LocalDate cartDate) {
        this.cartDate = cartDate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Set<ProductCart> getProductCarts() {
        return productCarts;
    }

    public void setProductCarts(Set<ProductCart> productCarts) {
        this.productCarts = productCarts;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", cartDate=" + cartDate +
                ", value=" + value +
                '}';
    }
}
