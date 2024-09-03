package org.msp.securityservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import msp.core.model.GenericBaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Permissions extends GenericBaseEntity<Long> {

    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @ManyToMany(mappedBy = "permissions")
    private List<Role> roles = new ArrayList<>();
}
