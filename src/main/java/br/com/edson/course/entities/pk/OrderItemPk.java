package br.com.edson.course.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.edson.course.entities.Order;
import br.com.edson.course.entities.Product;

//Por ser uma classe de PK usar-se a anotação @Embedable

@Embeddable
public class OrderItemPk implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order Order;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public Order getOrder() {
		return Order;
	}

	public void setOrder(Order order) {
		Order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Order == null) ? 0 : Order.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPk other = (OrderItemPk) obj;
		if (Order == null) {
			if (other.Order != null)
				return false;
		} else if (!Order.equals(other.Order))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}

}
