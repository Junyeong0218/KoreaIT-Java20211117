package a20_�÷���;

import java.util.*;

/**
 * 
 * �÷��� ( Collection )
 * java ���� �����͸� �����ϱ� ���� ���̺귯��
 * �迭���� ��ȭ�Ǿ��ٰ� �����ϸ� ��.
 * 
 * list<E> = ������ �ִ�. index �� �ִ�. �������� �ߺ��� ����Ѵ�. -> ArrayList
 * 	add((index), value) = index �� ������ �ش� �ε����� value �� ���� / index ������ �������
 *  remove(index) = �ش� index�� ���� ����� �ڿ� �ִ� ������ ������ sorting �Ѵ�.
 * 	value �� �ߺ����� �����ϴ� ���� �����ϴ�. 
 * set<E> = ������ ����. index �� ����. �������� �ߺ��� ������� �ʴ´�. -> HashMap, TreeSet
 * 	�������� �߰��� �����ٴ� ������ ������, ������ ��ȸ�� ó������ ������ ��� ���� �����غ����ϹǷ� �ð��� ���� �ɸ�.
 * 	value �� �ߺ����� �����ϴ� ���� �Ұ�����. -> HashMap, TreeMap
 * map<K, V> = Ű�� ���� �� ������ �̷������ ������ ����. index�� ����. Ű�� �ߺ��� ������� ������, ���� �ߺ��� �� �ִ�.
 *	
 */

public class Collection {

	List<String> strList;
	Set<Integer> intSet;
	Map<Integer, String> isMap;
}
