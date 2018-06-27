package com.thinkxfactor.zomatoplus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.model.User;
import com.thinkxfactor.zomatoplus.model.Items;
public interface ItemRepository extends JpaRepository<User, Long> {

	User save(Items items);

}
