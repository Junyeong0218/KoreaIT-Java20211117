package a20_컬렉션;

import java.util.*;

/**
 * 
 * 컬렉션 ( Collection )
 * java 에서 데이터를 관리하기 위한 라이브러리
 * 배열에서 진화되었다고 생각하면 됨.
 * 
 * list<E> = 순서가 있다. index 가 있다. 데이터의 중복을 허용한다. -> ArrayList
 * 	add((index), value) = index 가 있으면 해당 인덱스에 value 값 대입 / index 없으면 순서대로
 *  remove(index) = 해당 index의 값을 지우고 뒤에 있는 값들을 앞으로 sorting 한다.
 * 	value 를 중복으로 삽입하는 것이 가능하다. 
 * set<E> = 순서가 없다. index 가 없다. 데이터의 중복을 허용하지 않는다. -> HashMap, TreeSet
 * 	데이터의 추가가 빠르다는 장점이 있으나, 데이터 조회시 처음부터 끝까지 모든 값을 대조해봐야하므로 시간이 오래 걸림.
 * 	value 를 중복으로 삽입하는 것이 불가능함. -> HashMap, TreeMap
 * map<K, V> = 키와 값의 한 쌍으로 이루어지고 순서가 없다. index가 없다. 키는 중복을 허용하지 않지만, 값은 중복될 수 있다.
 *	
 */

public class Collection {

	List<String> strList;
	Set<Integer> intSet;
	Map<Integer, String> isMap;
}
