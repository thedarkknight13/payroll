    package com.tanyamakuwekuwe.payroll.models;

    import com.tanyamakuwekuwe.payroll.util.Status;
    import jakarta.persistence.*;

    import java.util.Objects;

    @Entity
    @Table(name = "`order`")
    public class Order {
        private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
        @Column(name = "description")
        private String description;
        @Enumerated(EnumType.STRING)
        @Column(name = "status")
        private Status status;

        public Order() {
        }

        public Order(String description, Status status) {
            this.description = description;
            this.status = status;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Order order)) return false;
            return Objects.equals(getId(), order.getId()) && Objects.equals(getDescription(), order.getDescription()) && Objects.equals(getStatus(), order.getStatus());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getDescription(), getStatus());
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id=" + id +
                    ", description='" + description + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }
