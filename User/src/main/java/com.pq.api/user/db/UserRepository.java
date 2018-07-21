package com.pq.api.user.db;

import com.pq.api.user.bean.UserBean;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserBean, Long> {

}