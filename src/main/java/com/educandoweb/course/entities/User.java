package com.educandoweb.course.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String emailString;
	private String phone;
	private String password;	
}
