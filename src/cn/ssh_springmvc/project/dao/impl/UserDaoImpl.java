package cn.ssh_springmvc.project.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.ssh_springmvc.project.base.BaseDaoImpl;
import cn.ssh_springmvc.project.dao.UserDao;
import cn.ssh_springmvc.project.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public List<User> findByNameLike(String namePart) {
		return null;
	}

}
