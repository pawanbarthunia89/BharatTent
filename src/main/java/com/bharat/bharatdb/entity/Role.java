package com.bharat.bharatdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="role")
public class Role implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6400938364651875304L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rid")
	private Long roleId;
	@Column(name="role_nm")
	private String roleName;
}
