package cn.ssh_springmvc.project;


import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ssh_springmvc.project.domain.User;


@Service
public class TestService {

	@Resource
	private SessionFactory sessionFactory;

	@Transactional
	public void saveTwoUsers() {
		Session session = sessionFactory.getCurrentSession();
		session.save(new User());
//		int a = 5 / 0;
		session.save(new User());

	}
}
