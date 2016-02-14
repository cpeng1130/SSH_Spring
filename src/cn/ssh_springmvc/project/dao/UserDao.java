package cn.ssh_springmvc.project.dao;

import java.util.List;

import cn.ssh_springmvc.project.base.BaseDao;
import cn.ssh_springmvc.project.domain.User;


public interface UserDao extends BaseDao<User> {

	/**
	 * find user by part of name
	 * 
	 * @param namePart
	 * @return
	 */
	List<User> findByNameLike(String namePart);
}
