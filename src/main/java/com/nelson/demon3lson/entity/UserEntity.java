package com.nelson.demon3lson.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratedColumn;
import org.hibernate.annotations.IdGeneratorType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="UserEntity")
@Entity
public class UserEntity implements Comparable<UserEntity>{
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String email;

    @Override
    public int compareTo(UserEntity o) {
        return this.getName().compareTo(name);
    }
}
