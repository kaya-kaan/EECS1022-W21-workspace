package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Member;

public class TestMember {

	@Test
	public void test_Member_01() {
		Member member1 = new Member();
		Member member2 = new Member();
		assertEquals(false, member1 == member2);
	}

	@Test
	public void test_Member_02() {
		Member member1 = new Member();
		Member member2 = new Member();
		assertEquals(true, member1 != member2);
	}
	
	@Test
	public void test_Member_03() {
		Member ali = new Member(12345, 's', 100.0);
		Member kaan = new Member(12346, 's', 200.0);
		Member veli = new Member("Veli", 123589, 'g', 300.0);
		assertFalse(ali == kaan);
		assertFalse(ali == veli);
		assertFalse(kaan == veli);
	}

	@Test
	public void test_Member_04() {
		Member alan = new Member(85, 175);
		Member mark = new Member(101, 181);
		assertEquals(85, alan.getWeight(), 0.1);
		assertEquals(101, mark.getWeight(), 0.1);
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport());
}
}