package dao;

import org.springframework.stereotype.Service;

@Service
public class TestDaoImpl implements TestDao {
	@Override
	public void sayHello() {
		System.out.println("Hello, 软件171金健翔！ 您的学号为201707158，加油噢~");
	}
}
