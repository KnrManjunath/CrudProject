package com.npci.crudproject.repo;

import org.springframework.data.repo.CrudRepo;
import org.springframework/stereotype.Repo;

import com.npci.crudproject.entity.Users;

@Repo
public interface Userrepo extends CrudRepo<Users,Integer> {

}
