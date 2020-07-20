package com.kakao.teststudy;

import com.kakao.teststudy.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.kakao.teststudy.common.matcher.IsNotManager.isManager;
import static org.hamcrest.MatcherAssert.assertThat;

class TestStudyApplicationTests {

	@Test
	public void checkManager_true(){
		User user = new User("ringo", true);

		assertThat(user, isManager());
	}

	@Test
	public void checkManager_false(){
		User user = new User("demo", false);

		assertThat(user, isManager());
	}

}
